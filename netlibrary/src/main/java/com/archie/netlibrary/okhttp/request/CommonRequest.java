package com.archie.netlibrary.okhttp.request;

import java.util.Map;

import okhttp3.FormBody;
import okhttp3.Request;

/**
 * 项目名:   NetTest2
 * 包名:     com.archie.netlibrary.okhttp.request
 * 文件名:   CommonRequest
 * 创建者:   Jarchie
 * 创建时间: 17/12/13 上午10:31
 * 描述:     接收请求参数，为我们生成Request对象
 */

public class CommonRequest {

    /**
     * 创建Get请求的Request
     *
     * @param url
     * @param params
     * @return 通过传入的参数返回一个Get类型的请求
     */
    public static Request createGetRequest(String url, RequestParams params) {
        StringBuilder urlBuilder = new StringBuilder(url).append("?");

        if (params != null) {
            for (Map.Entry<String, String> entry : params.urlParams.entrySet()) {
                urlBuilder
                        .append(entry.getKey())
                        .append("=")
                        .append(entry.getValue())
                        .append("&");
            }
        }

        return new Request.Builder().url(urlBuilder.substring(0, urlBuilder.length() - 1))
                .get().build();
    }

    /**
     * 创建Post请求的Request
     *
     * @param url
     * @param params
     * @return 返回一个创建好的Request对象
     */
    public static Request createPostRequest(String url, RequestParams params) {
        FormBody.Builder mFromBodyBuilder = new FormBody.Builder();

        if (params != null) {
            for (Map.Entry<String, String> entry : params.urlParams.entrySet()) {
                //将请求参数逐一遍历添加到我们的请求构建类中
                mFromBodyBuilder.add(entry.getKey(), entry.getValue());
            }
        }

        //通过请求构建类的build方法获取到真正的请求体对象
        FormBody mFormBody = mFromBodyBuilder.build();
        return new Request.Builder().url(url).post(mFormBody).build();
    }

}
