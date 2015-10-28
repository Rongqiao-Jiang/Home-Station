package com.example.jiang.data;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class UserDataHelper extends SQLiteOpenHelper {
	
	private static final String DATABASE_CREATE =   
            "create table user( _id integer primary key autoincrement, " +   
            "name text not null, password text not null);";  
	
	
	
	//favorite 
	private static final String CREATEFAVORITE = "create table favorite( _id integer primary key autoincrement, " +   
            "name text not null);"; 
	
	private static final String DBNAME = "UserDB";
	private static final int VERSION = 1 ;

	public UserDataHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}
	
	
	public UserDataHelper(Context context) {
		super(context, DBNAME, null, VERSION);
	}
	

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		try  
        {  
			arg0.execSQL(DATABASE_CREATE);  
			arg0.execSQL(CREATEFAVORITE);  
        }  
        catch(SQLException e)  
        {  
            e.printStackTrace();  
        }  
		

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
