package org.bandit.dfs.raft;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/*
 The Node class representing a single Node in the Raft consensus algorithm.
 Each node has an ID to reference itself, currentTerm indicating the current term of the node,
 an Integer representing whon the node has voted for during elections.
 A commit index indiciating the highest index it has last committed to.
 Each node starts off as a follower.
 List<Node> is the list of peers in the cluster
 */
@Slf4j
public class RaftNode {
    int id;
    int currentTerm = 0;
    Integer votedFor = null;
    int commitIndex;
    RaftRole role = RaftRole.FOLLOWER;
    List<RaftNode> peers;

    public void becomeLeader() {
        log.info("Node {} has become the leader during term {}.", id, currentTerm);
        role = RaftRole.LEADER;
    }

    public void startElection() {
        log.info("Node {} is starting an election", id);
        currentTerm++;
        votedFor = id;
        int votesReceived = 1; // 1 since the node votes for itself

        for (RaftNode peer : peers) {
            VoteResult result = peer.handleRequestVote(currentTerm, id);

            /*
            If the peer's current term is greater than the current term of the CANDIDATE node,
            it is not eligible to become the leader, it steps down and becomes a follower.
            We then stop the election and wait for another Node to notice no heartbeat has been sent.
             */
            if (result.getTerm() > currentTerm) {
                currentTerm = result.getTerm();
                votedFor = null;
                role = RaftRole.FOLLOWER;
                return;
            }

            if (result.voteGranted) {
                votesReceived++;
            }
        }

        if (votesReceived > peers.size() / 2) {
            becomeLeader();
        } else {
            role = RaftRole.FOLLOWER;
            votedFor = null;
            log.info("Node {} has lost the election during term {}.", id, currentTerm);
        }
    }

    public VoteResult handleRequestVote(int term, int candidateId) {
        if (term < this.currentTerm) {
            VoteResult result = new VoteResult(this.currentTerm, false);
            log.info("Node {} has a higher term than Candidate {} during term {}, election stopped", this.id, id, term);
            return result;
        }
        boolean isLogUpToDate = true;

        if ((votedFor == null || votedFor == candidateId) && isLogUpToDate ) {
            votedFor = candidateId;
            log.info("Node {} has voted for Candidate {} during term {}", id, candidateId, term);
            VoteResult result = new VoteResult(this.currentTerm, true);
            return result;
        }
        VoteResult result = new VoteResult(this.currentTerm, false);
        return result;
    }

    public void sendHeartbeat() {
        log.info("Node {} is sending heartbeat to peers", id);
        for (RaftNode peer : peers) {
            peer.handleAppendEntries(currentTerm, id);
        }
    }

    private void handleAppendEntries(int currentTerm, int id) {

    }
}
