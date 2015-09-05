package cn.edu.hust.baidu.club.csapp.Parse;

import cn.edu.hust.baidu.club.csapp.UsedClasses.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by zhaoqingzhang on 15-5-10.
 */

public class ParseJson {
    /**
     *
     * @param json The json format String that need to parse
     * @return an instance of News class
     */
    public static News fromJsontoNews(String json) {
        Gson gson = new Gson();
        News news = gson.fromJson(json, News.class);
        return news;
    }

    /**
     *
     * @param json The json format String that need to parse
     * @return an List with News class
     */
    public static List<News> fromJsontoNewsList(String json){
        Gson gson = new Gson();
        List<News> newsList = gson.fromJson(json, new TypeToken<List<News>>(){}.getType());
        return newsList;
    }
    /**
     *
     * @param json The json format String that need to parse
     * @return an instance of Lostandfound  class
     */
    public static Lostandfound fromJsontoLostandfound(String json) {
        Gson gson = new Gson();
        Lostandfound lostandfound = gson.fromJson(json, Lostandfound.class);
        return lostandfound;
    }
    /**
     *
     * @param json The json format String that need to parse
     * @return an List with Lostandfound class
     */
    public static List<Lostandfound> fromJsontoLostandfoundList(String json){
        Gson gson = new Gson();
        List<Lostandfound> lostandfoundList = gson.fromJson(json, new TypeToken<List<Lostandfound>>(){}.getType());
        return lostandfoundList;
    }
    public static HomePage fromJsontoHomePage(String json){
        Gson gson = new Gson();
        HomePage homePage = gson.fromJson(json, HomePage.class);
        return homePage;
    }
    public static UserDetail fromJsontoUserDetail(String json){
        Gson gson = new Gson();
        UserDetail userDetail = gson.fromJson(json, UserDetail.class);
        return userDetail;
    }

    public static ArticlesDetail fromJsontoArticlesDetail(String json){
        Gson gson = new Gson();
        ArticlesDetail articlesDetail = gson.fromJson(json, ArticlesDetail.class);
        return articlesDetail;
    }

    public static ArticleComments fromJsontoArticleComments(String json){
        Gson gson = new Gson();
        ArticleComments articleComments = gson.fromJson(json, ArticleComments.class);
        return articleComments;
    }
}
