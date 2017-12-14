package com.archie.nettest2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.archie.netlibrary.okhttp.listener.DisposeDataListener;
import com.archie.nettest2.bean.TestModel;
import com.archie.nettest2.request.RequestCenter;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.text);
        //测试网络框架
        RequestCenter.requestRecommandData(new DisposeDataListener() {
            @Override
            public void onSuccess(Object responseObj) {
                TestModel model = (TestModel) responseObj;
                //设置名称字段显示到TextView上
                textView.setText(model.getData().getList().get(0).getUname());
            }

            @Override
            public void onFailure(Object responseObj) {
                Log.e("测试网络框架", "onFailure: " + responseObj.toString() );
            }
        });
    }

    //用OKHTTP发送最基本的网络请求
    private void sendRequest(){
        //1、创建OkHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
        //2、创建一个Request
        final Request request = new Request.Builder()
                .url("https://www.baidu.com/")
                .build();
        //3、通过okhttpclient对象来构建Call对象
        Call call = mOkHttpClient.newCall(request);
        //4、请求加入调度
        call.enqueue(new Callback() {

            //请求失败
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {

            }

            //请求成功
            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {

            }
        });
    }

}
