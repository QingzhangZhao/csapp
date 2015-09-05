package cn.edu.hust.baidu.club.csapp.UsedClasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zqz on 15-9-5.
 */
public class ArticlesDetail {
    private List<ArrayList> zan;
    private List<ArrayList> collect;
    private  ArticleInDetail article;

    public ArticleInDetail getArticle() {
        return article;
    }

    public List<ArrayList> getCollect() {
        return collect;
    }

    public List<ArrayList> getZan() {
        return zan;
    }
}
