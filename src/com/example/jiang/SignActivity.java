package com.example.jiang;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class SignActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.sign);
	Button startMainActivity = (Button) findViewById(R.id.button4);
	startMainActivity.setOnClickListener(new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(SignActivity.this, MainActivity.class);
			startActivity(intent);
			}
			});
	}

}
