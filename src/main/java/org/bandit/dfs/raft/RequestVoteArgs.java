package org.bandit.dfs.raft;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestVoteArgs {
    private int term;
    private String candidateID;
    private int lastLogIndex;
    private int lastLogTerm;
    public RequestVoteArgs() {}

    @JsonCreator
    public RequestVoteArgs(
            @JsonProperty("term") int term,
            @JsonProperty("candidateID") String candidateID,
            @JsonProperty("lastLogIndex") int lastLogIndex,
            @JsonProperty("lastLogTerm") int lastLogTerm
    ) {
        this.term = term;
        this.candidateID = candidateID;
        this.lastLogIndex = lastLogIndex;
        this.lastLogTerm = lastLogTerm;
    }
    public int getTerm() {
        return term;
    }
    public String getCandidateID() {
        return candidateID;
    }
    public int getLastLogIndex() {
        return lastLogIndex;
    }
    public int getLastLogTerm() {
        return lastLogTerm;
    }
}
