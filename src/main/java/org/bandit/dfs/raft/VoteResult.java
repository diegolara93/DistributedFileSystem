package org.bandit.dfs.raft;

public class VoteResult {
    int term;
    boolean voteGranted;

    public VoteResult(int term, boolean voteGranted) {
        this.term = term;
        this.voteGranted = voteGranted;
    }
    public int getTerm() {
        return term;
    }
}
