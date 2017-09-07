package com.example.json.app123.base;

import android.app.Application;
import android.view.View;
import android.widget.Toast;

import com.example.json.app123.util.ToastHelper;

/**
 * Created by Json on 2017/6/27.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ToastHelper.init(getApplicationContext());
    }
}
