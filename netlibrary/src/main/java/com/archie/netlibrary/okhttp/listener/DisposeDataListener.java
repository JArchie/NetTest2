package com.archie.netlibrary.okhttp.listener;

/**
 * 项目名:   NetTest2
 * 包名:     com.archie.netlibrary.okhttp.listener
 * 文件名:   DisposeDataListener
 * 创建者:   Jarchie
 * 创建时间: 17/12/13 下午12:06
 * 描述:     自定义事件监听回调，处理请求成功和失败时的回调函数
 */

public interface DisposeDataListener {

    //请求成功回调事件处理
    public void onSuccess(Object responseObj);

    //请求失败回调事件处理
    public void onFailure(Object responseObj);

}
