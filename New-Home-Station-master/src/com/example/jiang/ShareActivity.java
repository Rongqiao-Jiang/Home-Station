package com.example.jiang;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class ShareActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.share);
	Button startTopActivity = (Button) findViewById(R.id.b1);
	startTopActivity.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(ShareActivity.this, TopActivity.class);
			startActivity(intent);
			}
			});
	Button startFoundActivity = (Button) findViewById(R.id.b2);
	startFoundActivity.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(ShareActivity.this, FoundActivity.class);
			startActivity(intent);
			}
			});
	Button startMessageActivity = (Button) findViewById(R.id.b4);
	startMessageActivity.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(ShareActivity.this, MessageActivity.class);
			startActivity(intent);
			}
			});
	Button startMyselfActivity = (Button) findViewById(R.id.b5);
	startMyselfActivity.setOnClickListener(new OnClickListener() {
	    public void onClick(View v) {
			Intent intent = new Intent(ShareActivity.this, MyselfActivity.class);
			startActivity(intent);
			}
			});
	
	}


}
