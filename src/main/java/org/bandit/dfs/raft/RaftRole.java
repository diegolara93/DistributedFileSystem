package org.bandit.dfs.raft;

/*
The roles that a Node can take during the Raft consensus algorithm,
Leader is the node that is in charge of the cluster, it receives the requests from the client and
communicates the information to the nodes in the cluster with the FOLLOWER state.

Candidate is a state that only occurs during elections, no node should be a CANDIDATE unless an election is
happening.
 */
public enum RaftRole {
    LEADER,
    FOLLOWER,
    CANDIDATE;
}
