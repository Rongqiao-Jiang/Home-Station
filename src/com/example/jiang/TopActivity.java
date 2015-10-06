package com.example.jiang;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class TopActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.top);
	Button startFoundActivity = (Button) findViewById(R.id.b2);
	startFoundActivity.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, FoundActivity.class);
			startActivity(intent);
			}
			});
	Button startShareActivity = (Button) findViewById(R.id.b3);
	startShareActivity.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, ShareActivity.class);
			startActivity(intent);
			}
			});
	Button startMessageActivity = (Button) findViewById(R.id.b4);
	startMessageActivity.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, MessageActivity.class);
			startActivity(intent);
			}
			});
	Button startMyselfActivity = (Button) findViewById(R.id.b5);
	startMyselfActivity.setOnClickListener(new OnClickListener() {
	    public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, MyselfActivity.class);
			startActivity(intent);
			}
			});
			
	
	}

}
