package cn.edu.hust.baidu.club.csapp.Post;


import android.util.Log;
import cn.edu.hust.baidu.club.csapp.UsedClasses.Lostandfound;
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
    public static String post(String url, Lostandfound lostandfound) throws IOException {

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
}
