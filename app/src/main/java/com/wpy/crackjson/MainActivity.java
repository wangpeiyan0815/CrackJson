package com.wpy.crackjson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.wpy.crackjson.bean.Bean;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

/**
 * 特殊json解析  双层集合嵌套
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }

    /**
     * 获取网络数据
     */
    private void getData() {
        String url = "https://mock.eolinker.com/success/cjTiF8H7R6Dw4fmRsuUS3H7ZPaVUJzRW";
        OkHttpUtils
                .get()
                .url(url)

                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Gson gson = new Gson();
                        Bean bean = gson.fromJson(response, Bean.class);
                        List<Bean.DataBeanHeadline> data =
                                bean.getData();
                        Log.i("TAG", "onResponse: ====="+data.size());
                        Bean.DataBeanHeadline dataBeanHeadline = data.get(1);
                        List<List<Bean.DataBeanHeadline.BodyBeanHeadline>> body = dataBeanHeadline.getBody();
                        List<Bean.DataBeanHeadline.BodyBeanHeadline> bodyBeanHeadlines = body.get(0);
                        String categoryTitle = bodyBeanHeadlines.get(0).getCategoryTitle();
                        Log.i("TAG", "onResponse: ====="+categoryTitle);
                    }

                });
    }
}
