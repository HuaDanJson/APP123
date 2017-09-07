package com.example.json.app123;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.json.app123.constants.ConstKey;
import butterknife.BindView;
import butterknife.ButterKnife;

public class WebViewDownLoadAPKActivity extends AppCompatActivity {

    @BindView(R.id.wvWebViewDownLoadAPKActivity)
    WebView wvWebViewDownLoadAPKActivity;

    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_down_load_apk);
        ButterKnife.bind(this);
        url = getIntent().getStringExtra(ConstKey.INTENT_KEY_TO_WEB_VIEW_DOWN_LOAD_APK_ACTIVITY_URL);
        wvWebViewDownLoadAPKActivity.loadUrl(url);

        //启用支持javascript
        WebSettings settings = wvWebViewDownLoadAPKActivity.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);//设置此属性，可任意比例缩放
        settings.setLoadWithOverviewMode(true);

        // 便页面支持缩放：
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);

        //使用缓存
        wvWebViewDownLoadAPKActivity.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        wvWebViewDownLoadAPKActivity.requestFocusFromTouch();//支持获取手势焦点
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wvWebViewDownLoadAPKActivity.canGoBack()) {
            wvWebViewDownLoadAPKActivity.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
