package org.bandit.dfs.controllers;

import org.bandit.dfs.raft.RaftNode;
import org.bandit.dfs.raft.RequestVoteArgs;
import org.bandit.dfs.raft.VoteResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/raft")
public class RaftController {
    private final RaftNode raft;
    public RaftController(RaftNode raft) {
        this.raft = raft;
    }

    /*
    TODO: Change the raft vote implementation to take in the RequestVoteArgs object
     */
    @PostMapping("/requestVote")
    public VoteResult requestVote(RequestVoteArgs args) {
        VoteResult temp = new VoteResult(args.getTerm(), false);
        return temp;
    }
}
