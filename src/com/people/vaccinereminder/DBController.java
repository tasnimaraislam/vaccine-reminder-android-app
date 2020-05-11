package com.people.vaccinereminder;

import java.util.ArrayList;
//import java.util.Calendar;
import java.util.HashMap;

import android.app.Notification;
//import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
//import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
//import android.view.View;
//import android.widget.Toast;

public class DBController extends SQLiteOpenHelper {

	private static final String LOGCAT = "vaccinereminder";
	SQLiteDatabase db;
	PendingIntent pendingIntent;
	Notification notification;
	
	//database name set up and database  create
	public DBController(Context applicationcontext) {
        super(applicationcontext, "androidsqlite.db", null, 1);
        Log.d(LOGCAT,"Created");
    }
	
	//table create into database
	@Override
	public void onCreate(SQLiteDatabase database) {
		String query;
		query = "CREATE TABLE vaccines ( vacId INTEGER PRIMARY KEY, vacName TEXT, time TEXT, personName TEXT)";
        database.execSQL(query);
        Log.d(LOGCAT,"vaccines Created");   
	}
	
	//database is upgrading
	@Override
	public void onUpgrade(SQLiteDatabase database, int version_old, int current_version) {
		String query;
		query = "DROP TABLE IF EXISTS vaccines";
		database.execSQL(query);
        onCreate(database);
	}
	
	//new vac value is inserting into database
	public void insertVacc(HashMap<String, String> queryValues) {
		SQLiteDatabase database = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("vacName", queryValues.get("vacName"));
		values.put("time", queryValues.get("time"));
		values.put("personName", queryValues.get("personName"));
		database.insert("vaccines", null, values);
		database.close();
	}
	
	//edit vac value is updating
	public int updateVacc(HashMap<String, String> queryValues) {
		SQLiteDatabase database = this.getWritableDatabase();	 
	    ContentValues values = new ContentValues();
	    values.put("vacName", queryValues.get("vacName"));
	    values.put("time", queryValues.get("time"));
	    values.put("personName", queryValues.get("personName"));
	    return database.update("vaccines", values, "vacId" + " = ?", new String[] { queryValues.get("vacId") });
	
	}
	
	//edit vac value is deleting
	public void deleteVacc(String id) {
		Log.d(LOGCAT,"delete");
		SQLiteDatabase database = this.getWritableDatabase();	 
		String deleteQuery = "DELETE FROM  vaccines where vacId='"+ id +"'";
		Log.d("query",deleteQuery);		
		database.execSQL(deleteQuery);
	}
	
	//showing vac list in the home activity
	public ArrayList<HashMap<String, String>> getAllVacc() {
		ArrayList<HashMap<String, String>> wordList;
		wordList = new ArrayList<HashMap<String, String>>();
		String selectQuery = "SELECT  * FROM vaccines";
	    SQLiteDatabase database = this.getWritableDatabase();
	    Cursor cursor = database.rawQuery(selectQuery, null);
	    if (cursor.moveToFirst()) {
	        do {
	        	HashMap<String, String> map = new HashMap<String, String>();
	        	map.put("vacId", cursor.getString(0));
	        	map.put("vacName", cursor.getString(1));
	        	map.put("time", cursor.getString(2));
	        	map.put("personName", cursor.getString(3));
                wordList.add(map);
	        } while (cursor.moveToNext());
	    }
	 
	      return wordList;
	}
	
	//value info after clicking edit vac
	public HashMap<String, String> getVaccInfo(String id) {
		HashMap<String, String> wordList = new HashMap<String, String>();
		SQLiteDatabase database = this.getReadableDatabase();
		String selectQuery = "SELECT * FROM vaccines where vacId='"+id+"'";
		Cursor cursor = database.rawQuery(selectQuery, null);
		Log.d(LOGCAT,"getVaccInfo started.."); 
		if (cursor.moveToFirst()) {
	        do {
					//HashMap<String, String> map = new HashMap<String, String>();
	        	wordList.put("vacName", cursor.getString(1));
	        	wordList.put("time", cursor.getString(2));
	        	wordList.put("personName", cursor.getString(3));
				   //wordList.add(map);
	        } while (cursor.moveToNext());
	    }
		Log.d(LOGCAT,"getVaccInfo ended.."); 
	return wordList;
	}
}
