package com.example.jiang;


import com.example.jiang.data.UserDataHelper;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class FravoriteLayout extends Activity {
	private TextView result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fravoritelayout);
		result = (TextView) findViewById(R.id.result);
		if(contains()){
			// favorite list 
		}else{
			//null
			result.setText(R.string.favorite_null);
		}
	}
	
	
	private boolean contains() {
		UserDataHelper  DBHelper = new UserDataHelper(this);
		SQLiteDatabase  db = DBHelper.getWritableDatabase();
		
		Cursor cursor = db.query("favorite", new String []{"name"}, null,null, null, null, null);
		if(cursor != null){
			
			cursor.moveToFirst();
			if(cursor.getCount() > 0){
				
				return true;
			}
			return false;
			
		}else{
			return false;
		}
		
		
		
	}
	
}
