package org.bandit.dfs;

import org.bandit.dfs.raft.RaftNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
        RaftNode raftNode = new RaftNode();
        return raftNode;
    }
}
