package org.bandit.dfs.model;

import java.io.Serializable;
import java.util.Objects;

public class ChunkID implements Serializable {
    private final String fileID; // identifier of the file this chunk belongs to
    private final int index; // chunk's position

    public ChunkID(String fileID, int index) {
        this.fileID = fileID;
        this.index = index;
    }
    public String getFileID() {
        return fileID;
    }
    public int getIndex() {
        return index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileID, index);
    }
}
