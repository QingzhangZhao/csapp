package cn.edu.hust.baidu.club.csapp.Get;

import android.util.Log;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by zhaoqingzhang on 15-5-14.
 */

//Get json by OkHttp
public class GetJson {

    /**
     *
     * @param url The address that you want to get json from
     * @return The json
     * @throws Exception
     */
    public static  String  run(String url) throws Exception {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);
        return response.body().string();
    }

    /**
     * 登录后获取文章
     * @param cookie the cookie
     * @return the result of get
     * @throws Exception
     */
    public  static  String  getArticles(String cookie) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/articles/")
                .header("Cookie", cookie)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);
        return response.body().string();
    }

    /**
     * 得到文章的详细信息
     * @param id the id
     * @param cookie the cookie
     * @return the result of get
     * @throws Exception
     */
    public  static  String  getDetailArticles(String id,String cookie) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/articles/detail/"+id+"/")
                .header("Cookie", cookie)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);
        return response.body().string();
    }

    /**
     * 得到用户的详细信息
     * @param uid the uid
     * @param cookie the cookie
     * @return the result of get
     * @throws Exception
     */
    public  static  String  getAUserInfo(String uid,String cookie) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/users/detail/"+uid+"/")
                .header("Cookie",cookie)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);
        return response.body().string();
    }
    /**
     * 获取文章的评论
     * @param uid the uid
     * @param cookie the cookie
     * @return the result of get
     * @throws Exception
     */
    public  static  String  getArticleComment(String uid,String cookie) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/comments/"+uid+"/")
                .header("Cookie",cookie)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);
        return response.body().string();
    }
}
