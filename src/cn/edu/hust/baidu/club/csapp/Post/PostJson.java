package cn.edu.hust.baidu.club.csapp.Post;


import android.util.Log;
import cn.edu.hust.baidu.club.csapp.UsedClasses.Article;
import cn.edu.hust.baidu.club.csapp.UsedClasses.Lostandfound;
import cn.edu.hust.baidu.club.csapp.UsedClasses.User;
import com.squareup.okhttp.*;

import java.io.IOException;

/**
 * Created by zhaoqingzhang on 15-5-14.
 */
public class PostJson {


    /**
     *
     * @param url url
     * @param lostandfound the lostandfound instance
     * @return the result of post
     * @throws IOException
     */
    public static String postLostandfound(String url, Lostandfound lostandfound) throws IOException {

        RequestBody formBody = new FormEncodingBuilder()
                .add("title", lostandfound.getTitle())
                .add("message",lostandfound.getMessage())
                .add("content",lostandfound.getContent())
                .build();


        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) Log.i("Post Error","Post Failed");
        return response.body().string();
    }
    /**
     *
     * @param url url
     * @param user the User instance
     * @return the result of post
     * @throws IOException
     */
    public static String postUsers(User user)throws  IOException{

        RequestBody formBody = new FormEncodingBuilder()
                .add("username",user.getUsername())
                .add("password", user.getPassword())
                .add("email",user.getEmail())
                .add("confirm",user.getConfirm())
                .build();

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/users/")
                .post(formBody)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) Log.i("Post Error","Post Failed");
        return response.body().string();
    }

    public static String userLogin(User user)throws  IOException{

        RequestBody formBody = new FormEncodingBuilder()
                .add("username", user.getUsername())
                .add("password", user.getPassword())
                .build();

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/entry/")
                .post(formBody)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) Log.i("Post Error","Post Failed");
        Log.i("userLogin response",response.body().string());
        return response.header("Set-Cookie","null");
    }

    public static String postArticle(Article article,String cookie) throws  IOException{
        RequestBody formBody = new FormEncodingBuilder()
                .add("title",article.getTitle())
                .add("content", article.getContent())
                .build();

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/articles/")
                .post(formBody)
                .addHeader("cookie", cookie)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) Log.i("Post Error","Post Failed");
        return response.body().string();
    }
    public static String postFollower(String uid,String cookie) throws  IOException{


        OkHttpClient client = new OkHttpClient();

        RequestBody formBody = new FormEncodingBuilder()
                .add("","")
                .build();

        Request request = new Request.Builder()
                .url("http://128.199.101.105:8080/users/detail/"+uid+"/")
                .post(formBody)
                .addHeader("cookie", cookie)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) Log.i("Post Error","Post Failed");
        return response.body().string();
    }
}
