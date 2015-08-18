package cn.edu.hust.baidu.club.csapp.Parse;

import cn.edu.hust.baidu.club.csapp.UsedClasses.Lostandfound;
import cn.edu.hust.baidu.club.csapp.UsedClasses.News;
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
}
