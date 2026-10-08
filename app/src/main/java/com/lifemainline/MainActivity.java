package com.life.mainline;
import android.app.*;import android.os.*;import android.graphics.Color;import android.view.*;import android.webkit.*;
public class MainActivity extends Activity{
 WebView w;
 public void onCreate(Bundle b){super.onCreate(b);getWindow().setStatusBarColor(Color.rgb(244,245,247));getWindow().setNavigationBarColor(Color.rgb(244,245,247));getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);w=new WebView(this);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(true);w.setBackgroundColor(Color.rgb(244,245,247));w.setWebViewClient(new WebViewClient());setContentView(w);w.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){if(w!=null&&w.canGoBack())w.goBack();else super.onBackPressed();}
}