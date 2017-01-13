package com.xiawei.administrator.day29_webview_js;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
  private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mWebView= (WebView) findViewById(R.id.web_view);
        //启动js
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("file:///android_asset/myweb.html");
    }

    public void onClickAndroidCallJS(View view) {
        //调用网页中的JS
        mWebView.loadUrl("javascript:sayHi('"+("test"+System.currentTimeMillis())+"')");
    }
}
