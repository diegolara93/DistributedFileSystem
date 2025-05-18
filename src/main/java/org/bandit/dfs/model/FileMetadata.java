package org.bandit.dfs.model;

import java.util.List;

public class FileMetadata {
    private final String fileID; // Unique identifier for the file
    private final String fileName; // Name of the file
    private final long fileSize; // Size of the file in bytes (before chunking)
    private final String fileType;
    private final List<ChunkMetadata> chunks; // The list of chunks that make up the file, not chunked if less than 64 MB

    public FileMetadata(String fileID, String fileName, long fileSize, String fileType, List<ChunkMetadata> chunks) {
        this.fileID = fileID;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileType = fileType;
        this.chunks = chunks;
    }
    public String getFileID() {
        return fileID;
    }
    public String getFileName() {
        return fileName;
    }
    public long getFileSize() {
        return fileSize;
    }
    public String getFileType() {
        return fileType;
    }
    public List<ChunkMetadata> getChunks() {
        return chunks;
    }
}
