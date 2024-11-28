package com.example;

public class DownloadInfo {
    private String title;
    private Integer downloadTimes;

    public DownloadInfo(String title) {
        this.title = title;
        downloadTimes = 1;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getDownloadTimes() {
        return this.downloadTimes;
    }

    public void incrementTitleDownloaded() {
        downloadTimes++ ;
    }
}
