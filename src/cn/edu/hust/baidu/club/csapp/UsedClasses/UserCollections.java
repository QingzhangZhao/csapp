package cn.edu.hust.baidu.club.csapp.UsedClasses;

import java.util.List;

/**
 * Created by zqz on 15-9-5.
 */
public class UserCollections {
    private String  ctime;// "2015-07-13 10:52:58",
    private  String auth_id;// "e102ee4f-e6af-31d8-9055-672a5d1c714a",
    private String article_id;//fe069460-18d3-3dff-9a8e-1af383bb5027",
    private String title; //"BOX",
    private boolean     transmited;// false,
    private String    content;
    private List<String>    audiopath;
    private List<String>   transmit;
    private String     imagespath;


    public boolean isTransmited() {
        return transmited;
    }

    public List<String> getAudiopath() {
        return audiopath;
    }

    public List<String> getTransmit() {
        return transmit;
    }

    public String getArticle_id() {
        return article_id;
    }

    public String getAuth_id() {
        return auth_id;
    }

    public String getContent() {
        return content;
    }

    public String getCtime() {
        return ctime;
    }

    public String getImagespath() {
        return imagespath;
    }

    public String getTitle() {
        return title;
    }

    public void setArticle_id(String article_id) {
        this.article_id = article_id;
    }

    public void setAudiopath(List<String> audiopath) {
        this.audiopath = audiopath;
    }

    public void setAuth_id(String auth_id) {
        this.auth_id = auth_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public void setImagespath(String imagespath) {
        this.imagespath = imagespath;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTransmit(List<String> transmit) {
        this.transmit = transmit;
    }

    public void setTransmited(boolean transmited) {
        this.transmited = transmited;
    }
}
