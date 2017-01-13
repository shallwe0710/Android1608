package com.xiawei.administrator.day29_down_continue.entities;

/**
 * Created by Administrator on 2017/1/12.
 */
public class DownloadInfo {
    private  int id;
    private  String filenName;
    private  String url;
    private  long  progress;
    private  long length;

    public DownloadInfo() {
    }

    public DownloadInfo(int id, String filenName, String url, long progress, long length) {
        this.id = id;
        this.filenName = filenName;
        this.url = url;
        this.progress = progress;
        this.length = length;
    }

    @Override
    public String toString() {
        return "DownloadInfo{" +
                "id=" + id +
                ", filenName='" + filenName + '\'' +
                ", url='" + url + '\'' +
                ", progress=" + progress +
                ", length=" + length +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilenName() {
        return filenName;
    }

    public void setFilenName(String filenName) {
        this.filenName = filenName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getProgress() {
        return progress;
    }

    public void setProgress(long progress) {
        this.progress = progress;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
