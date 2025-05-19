package org.bandit.dfs;

import org.bandit.dfs.raft.RaftNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DistributedFileSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributedFileSystemApplication.class, args);
    }
    /*
    TODO: LATER MAKE SURE THIS FUNCTION TAKES IN A Config FILE AND THEN
    INSTANTIATES THE RAFT NODE WITH THE CONFIG FILE
     */
    @Bean
    public RaftNode raftNode() {
        List<RaftNode> peers = new ArrayList<>();
        RaftNode raftNode = new RaftNode(0, peers);
        return raftNode;
    }
}
