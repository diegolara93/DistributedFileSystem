package org.bandit.dfs.raft;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoteResult {
    int term;
    boolean voteGranted;

    public VoteResult() {}
    public VoteResult(@JsonProperty("term") int term,
                      @JsonProperty("voteGranted") boolean voteGranted) {
        this.term = term;
        this.voteGranted = voteGranted;
    }
    public int getTerm() {
        return term;
    }
    public boolean isVoteGranted() {
        return voteGranted;
    }
}
