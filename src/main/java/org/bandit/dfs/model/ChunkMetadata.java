package org.bandit.dfs.model;

import java.util.List;


public class ChunkMetadata {
    private final String chunkID;
    private final int index; // the way to address the order of the chunks for the file 0 -> 1 -> 2 etc
    private final long size; // the size of the chunk in bytes
    private final boolean isCompressed;
    private final List<String> locations; // the list of nodes that have this chunk

    public ChunkMetadata(String chunkID, int index, long size, boolean isCompressed, List<String> locations) {
        this.chunkID = chunkID;
        this.index = index;
        this.size = size;
        this.isCompressed = isCompressed;
        this.locations = locations;
    }
    public String getChunkID() {
        return chunkID;
    }
    public int getIndex() {
        return index;
    }
    public long getSize() {
        return size;
    }
    public boolean isCompressed() {
        return isCompressed;
    }
    public List<String> getLocations() {
        return locations;
    }
}
