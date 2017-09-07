package com.example.json.app123;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.json.app123.constants.ConstKey;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WebViewActivity extends AppCompatActivity {

    @BindView(R.id.ivWebViewActivityBack)
    ImageView ivWebViewActivityBack;
    @BindView(R.id.tvWebViewActivityTitle)
    TextView tvWebViewActivityTitle;
    @BindView(R.id.wvWebViewActivity)
    WebView wvWebViewActivity;

    private String title;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        ButterKnife.bind(this);
        initVariables();
        initWebView();

    }

    public void initVariables() {
        ivWebViewActivityBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewActivity.this.finish();
            }
        });
        title = getIntent().getStringExtra(ConstKey.INTENT_KEY_TO_WEB_VIEW_ACTIVITY_TITLE);
        url = getIntent().getStringExtra(ConstKey.INTENT_KEY_TO_WEB_VIEW_ACTIVITY_URL);
    }

    public void initWebView() {
        tvWebViewActivityTitle.setText(title);
        wvWebViewActivity = (WebView) findViewById(R.id.wvWebViewActivity);
        wvWebViewActivity.loadUrl(url);

        //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
        wvWebViewActivity.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });

        //启用支持javascript
        WebSettings settings = wvWebViewActivity.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);//设置此属性，可任意比例缩放
        settings.setLoadWithOverviewMode(true);

        // 便页面支持缩放：
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);

        //使用缓存
        wvWebViewActivity.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        wvWebViewActivity.requestFocusFromTouch();//支持获取手势焦点
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wvWebViewActivity.canGoBack()) {
            wvWebViewActivity.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
