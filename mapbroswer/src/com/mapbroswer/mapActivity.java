package com.mapbroswer;

import android.webkit.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

//@JavascriptInterface

public class mapActivity extends Activity{
	private WebView webView;
	
	private Button btnPlace = null;
	private Button btnDrive = null;
	private Button btnBus =null;
	
	private AlertDialog.Builder builder;
	private AlertDialog alertDialog;
	
	private Context mContext;
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainlayout);
		//btnPlace=(Button)findViewById(R.id.btnPlace);
		//btnDrive=(Button)findViewById(R.id.btnDrive);
		//btnBus=(Button)findViewById(R.id.btnBus);
		//btnPlace.setOnClickListener(listener);
		//btnDrive.setOnClickListener(listener);
		//btnBus.setOnClickListener(listener);
		initViews();
		mContext = mapActivity.this;
	}

	private void initViews() {
		webView = (WebView) findViewById(R.id.webview);
		WebSettings webSettings = webView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		webView.addJavascriptInterface(this, "MainActivity");
		webSettings.setSupportZoom(true);
		webView.loadUrl("file:///android_asset/map.html");
	}
	


	
	
}
