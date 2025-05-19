package org.bandit.dfs.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetMetadataRequest {
    private String fileID;

    public GetMetadataRequest() {}

    @JsonCreator
    public GetMetadataRequest(
            @JsonProperty("fileID") String fileID
    ) {
        this.fileID = fileID;
    }
    public String getFileID() {
        return fileID;
    }
}
