package com.archie.nettest2.request;

import com.archie.netlibrary.okhttp.CommonOkHttpClient;
import com.archie.netlibrary.okhttp.listener.DisposeDataHandle;
import com.archie.netlibrary.okhttp.listener.DisposeDataListener;
import com.archie.netlibrary.okhttp.request.CommonRequest;
import com.archie.netlibrary.okhttp.request.RequestParams;
import com.archie.nettest2.bean.TestModel;
import com.archie.nettest2.constant.HttpConstant;

/**
 * 项目名:   NetTest2
 * 包名:     com.archie.nettest2.request
 * 文件名:   RequestCenter
 * 创建者:   Jarchie
 * 创建时间: 17/12/13 下午9:50
 * 描述:     统一管理所有的请求
 */

public class RequestCenter {

    //根据参数发送所有的get请求
    private static void getRequest(String url, RequestParams params,
                                   DisposeDataListener listener,
                                   Class<?> clazz){
        CommonOkHttpClient.get(CommonRequest.createGetRequest(url, params),
                new DisposeDataHandle(listener,clazz));
    }

    public static void requestRecommandData(DisposeDataListener listener){
        RequestCenter.getRequest(HttpConstant.HOME_RECOMMAND,null,listener, TestModel.class);
    }

}
