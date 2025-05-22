package org.bandit.dfs.raft;

import java.util.List;

public class AppendEntriesArgs {
    public int term;
    public Integer leaderID;
    public int prevLogIndex;
    public int prevLogTerm;
    public int leaderCommit;
    public List<String> entries;

    public AppendEntriesArgs() {}
    public AppendEntriesArgs(int term, Integer leaderID, int prevLogIndex, int prevLogTerm, int leaderCommit, List<String> entries) {
        this.term = term;
        this.leaderID = leaderID;
        this.prevLogIndex = prevLogIndex;
        this.prevLogTerm = prevLogTerm;
        this.leaderCommit = leaderCommit;
        this.entries = entries;
    }
}
