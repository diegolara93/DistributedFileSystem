# Distributed File System

## How it works
This is a distributed file system in which a client uploads and retrieves files from a server,
the server has a "MasterNode" that is used for retrival and storage, it holds the metadata about files and the chunk information about files.
This MasterNode uses the Raft consensus algorithm to keep multiple replicas of itself and ensure fault tolerance. It uses 3 nodes.
Files, once uploaded are split into chunks of a set 64 MB, these chunks are then stored and use quorum-based replication for fault tolerance.
If a file is a text-based file (json, html, csv, etc) and exceeds 2 KB, it is compressed using g-zip. 
Communication between the client and the server as well as the node's in the cluster for the master node are done using HTTP and REST APIs with SpringBoot.