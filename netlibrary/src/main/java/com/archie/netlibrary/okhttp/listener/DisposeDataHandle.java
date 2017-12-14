package com.archie.netlibrary.okhttp.listener;

/**
 * 项目名:   NetTest2
 * 包名:     com.archie.netlibrary.okhttp.listener
 * 文件名:   DisposeDataHandle
 * 创建者:   Jarchie
 * 创建时间: 17/12/13 下午12:11
 * 描述:     封装回调接口和要转换的实体对象
 */

@SuppressWarnings("WeakerAccess")
public class DisposeDataHandle {

    public DisposeDataListener mListener = null;
    public Class<?> mClass = null;

    public DisposeDataHandle(DisposeDataListener listener) {
        this.mListener = listener;
    }

    public DisposeDataHandle(DisposeDataListener listener, Class<?> clazz) {
        this.mListener = listener;
        this.mClass = clazz;
    }

}
