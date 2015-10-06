package com.example.jiang;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MessageActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.message);
	Button startTopActivity = (Button) findViewById(R.id.b1);
	startTopActivity.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(MessageActivity.this, TopActivity.class);
			startActivity(intent);
			}
			});
	Button startFoundActivity = (Button) findViewById(R.id.b2);
	startFoundActivity.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(MessageActivity.this, FoundActivity.class);
			startActivity(intent);
			}
			});
	Button startShareActivity = (Button) findViewById(R.id.b3);
	startShareActivity.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(MessageActivity.this, ShareActivity.class);
			startActivity(intent);
			}
			});
	Button startMyselfActivity = (Button) findViewById(R.id.b5);
	startMyselfActivity.setOnClickListener(new OnClickListener() {
	    public void onClick(View v) {
			Intent intent = new Intent(MessageActivity.this, MyselfActivity.class);
			startActivity(intent);
			}
			});	
	}


}
