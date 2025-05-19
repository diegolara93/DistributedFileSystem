package org.bandit.dfs.responses;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.bandit.dfs.model.ChunkID;

import java.util.List;

public class CreateFileResponse {
    private String fileID;
    private List<ChunkID> chunks;

    public CreateFileResponse() {}

    @JsonCreator
    public CreateFileResponse(
            @JsonProperty("fileID") String fileID,
            @JsonProperty("chunks") List<ChunkID> chunks
    ) {
        this.fileID = fileID;
        this.chunks = chunks;
    }
    public String getFileID() {
        return fileID;
    }
    public List<ChunkID> getChunks() {
        return chunks;
    }
}
