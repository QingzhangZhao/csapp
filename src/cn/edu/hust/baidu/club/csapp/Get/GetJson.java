package cn.edu.hust.baidu.club.csapp.Get;

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
    private final OkHttpClient client = new OkHttpClient();

    /**
     *
     * @param url The address that you want to get json from
     * @return The json
     * @throws Exception
     */
    public String  run(String url) throws Exception {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful())
            throw new IOException("Unexpected code " + response);
        Headers responseHeaders = response.headers();
        for (int i = 0; i < responseHeaders.size(); i++) {
            System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
        }
        return response.body().string();
    }
}
