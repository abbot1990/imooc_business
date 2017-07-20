package com.youdu.imooc_business;

import com.youdu.imooc_business.okhttp.CommonOkHttpClient;
import com.youdu.imooc_business.okhttp.request.CommonRequest;

import org.junit.Test;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testOkHttp(){
        String url = "http://www.baidu.com";
        System.out.println("true");
        CommonOkHttpClient.sendRequest(CommonRequest.createGetRequest(url, null), new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                System.out.println(response.body().string());
            }
        });
    }

}