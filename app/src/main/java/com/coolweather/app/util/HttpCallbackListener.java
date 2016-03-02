package com.coolweather.app.util;

/**
 * Created by yilunwu on 16/3/1.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
