package com.example.jiang;
import java.util.ArrayList;
import java.util.List;


import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;


import android.widget.ListView;
public class MessageActivity extends Activity{
	private List<Person> personList = new ArrayList<Person>();
	private String[] data={"Jone","Amy","Marry","Rose","Dave","Angela","Rosy","Anna","Karry","Ella"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.message);
	initPersons();
	PersonAdapter adapter = new PersonAdapter(MessageActivity.this, R.layout.person, personList);
	ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(
			MessageActivity.this, android.R.layout.simple_list_item_1, data);
	
	ListView listView=(ListView) findViewById(R.id.listview);
	listView.setAdapter(adapter);
	listView.setAdapter(adapter2);
	listView.setOnItemClickListener(new OnItemClickListener(){
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(MessageActivity.this,Msgmain.class);
			startActivity(intent);
			
		}
		
	});
	
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
	Button startMessageActivity = (Button) findViewById(R.id.b5);
	startMessageActivity.setOnClickListener(new OnClickListener() {
	    public void onClick(View v) {
			Intent intent = new Intent(MessageActivity.this, MyselfActivity.class);
			startActivity(intent);
			}
			});	
	
	}
	private void initPersons() {
		// TODO Auto-generated method stub
		Person jone=new Person("Jone",R.drawable.share);
		personList.add(jone);
		Person amy=new Person("Amy",R.drawable.share);
		personList.add(amy);
		Person marry=new Person("Marry",R.drawable.found);
		personList.add(marry);
		Person rose=new Person("Rose",R.drawable.found);
		personList.add(rose);
		Person dave=new Person("Dave",R.drawable.found);
		personList.add(dave);
		Person angela=new Person("Angela",R.drawable.found);
		personList.add(angela);
		Person rosy=new Person("Rosy",R.drawable.found);
		personList.add(rosy);
		Person anna=new Person("Anna",R.drawable.found);
		personList.add(anna);
		Person karry=new Person("Karry",R.drawable.found);
		personList.add(karry);
		Person ella=new Person("Ella",R.drawable.found);
		personList.add(ella);
	}


}
