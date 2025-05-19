package org.bandit.dfs.requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateFileRequest {
    private String fileName;
    private String filePath;
    private long fileSize;

    public CreateFileRequest() {}

    @JsonCreator
    public CreateFileRequest(
            @JsonProperty("fileName") String fileName,
            @JsonProperty("filePath") String filePath,
            @JsonProperty("fileSize") long fileSize
    ) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }
    public String getFilePath() {
        return filePath;
    }
    public long getFileSize() {
        return fileSize;
    }
}
