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
	Button startroom1 = (Button) findViewById(R.id.topbutton1);
	startroom1.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, room1.class);
			startActivity(intent);
			}
			});
	Button startroom2 = (Button) findViewById(R.id.topbutton2);
	startroom2.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, room2.class);
			startActivity(intent);
			}
			});
	Button startroom3 = (Button) findViewById(R.id.topbutton3);
	startroom3.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, room3.class);
			startActivity(intent);
			}
			});
	Button startroom4 = (Button) findViewById(R.id.topbutton4);
	startroom4.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, room4.class);
			startActivity(intent);
			}
			});
	Button startroom5 = (Button) findViewById(R.id.topbutton5);
	startroom5.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, room5.class);
			startActivity(intent);
			}
			});
	Button startroom6 = (Button) findViewById(R.id.topbutton6);
	startroom6.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, room6.class);
			startActivity(intent);
			}
			});
	Button startroom7 = (Button) findViewById(R.id.topbutton7);
	startroom7.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(TopActivity.this, room7.class);
			startActivity(intent);
			}
			});

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
