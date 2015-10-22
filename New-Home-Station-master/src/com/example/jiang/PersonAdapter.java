package com.example.jiang;

import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonAdapter extends ArrayAdapter<Person>{
	private int resourceId;
	public PersonAdapter(Context context,int textViewResourcedId,List<Person> objiects){
		super(context,textViewResourcedId,objiects);
		resourceId=textViewResourcedId;
	}
	@SuppressLint("ViewHolder")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	Person person = getItem(position); // 获取当前项的Fruit实例
	View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
	ImageView personImage = (ImageView) view.findViewById(R.id.person_image);
	TextView personName = (TextView) view.findViewById(R.id.person_name);
	personImage.setImageResource(person.getImageId());
	personName.setText(person.getName());
	return view;
	}
	

}
