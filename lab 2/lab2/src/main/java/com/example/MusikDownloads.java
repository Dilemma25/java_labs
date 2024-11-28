package com.example;

import java.util.ArrayList;
import java.util.List;

public class MusikDownloads {
    private List<DownloadInfo> downloadList;

    public MusikDownloads() {
        this.downloadList = new ArrayList<DownloadInfo>();
    }

    public DownloadInfo getDownloadInfo(String title) {        
        for (DownloadInfo item : this.downloadList) {
            if (item.getTitle() == title) {
                return item;
            }
        }

        return null;
    }

    public void updateDownloads(List<String> titles) {        
        boolean isAppend = false;
        
        for (String title : titles) {
            isAppend = false;
            for (DownloadInfo item : this.downloadList) {
                
                if (item.getTitle() == title) {
                    item.incrementTitleDownloaded();
                    isAppend = true;     
                }

            }
            if (!isAppend) {
                this.downloadList.add(new DownloadInfo(title));
            }
        }
    }

    public void printList() {
        System.out.println("Информация о скачиваниях:");
        for (DownloadInfo item : this.downloadList) {
            System.out.println(String.format("Музыка: %s, количество скачиваний: %s",item.getTitle(), item.getDownloadTimes()));
        }
    }
}
