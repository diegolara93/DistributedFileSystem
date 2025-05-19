package org.bandit.dfs.responses;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.bandit.dfs.model.ChunkMetadata;

import java.util.List;

public class GetMetadataResponse {
    private String fileID;
    private List<ChunkMetadata> chunks;

    public GetMetadataResponse() {}

    @JsonCreator
    public GetMetadataResponse(
            @JsonProperty("fileID") String fileID,
            @JsonProperty("chunks") List<ChunkMetadata> chunks
    ) {
        this.fileID = fileID;
        this.chunks = chunks;
    }
    public String getFileID() {
        return fileID;
    }
    public List<ChunkMetadata> getChunks() {
        return chunks;
    }
}
