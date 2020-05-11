package com.people.vaccinereminder;

import java.util.Calendar;
import java.util.HashMap;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

public class newVac extends Activity implements OnClickListener{
	PendingIntent pendingIntent;
	Notification notification;
	Button start,clear;
	
	ImageButton ib;
	public Calendar cal,c;
	private int day;
	private int month;
	private int year;
	public EditText et;
	int d,m,y;
	long when;
	
	EditText vacName, edText;
	DBController controller = new DBController(this);
	   
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.add_new_vac);	  
	   	        
	        vacName = (EditText) findViewById(R.id.vacName);
	        edText = (EditText) findViewById(R.id.ETPerson01);
	        
	        ib = (ImageButton) findViewById(R.id.imageButton1);
			
	        cal = Calendar.getInstance();
			day = cal.get(Calendar.DAY_OF_MONTH);
			month = cal.get(Calendar.MONTH);
			year = cal.get(Calendar.YEAR);
			
			Log.d("Vaccine Reminder","Date pic up. :)...");	
						
			et = (EditText) findViewById(R.id.editText);
			Log.d("Vaccine Reminder","et successful...");
			ib.setOnClickListener(this);
			Log.d("Vaccine Reminder","ib set successful...");
			
			
	    }
	 
	 @SuppressWarnings({"deprecation" })
		public void onClick(View v) {
			showDialog(0);
		}

		@Override		
		protected Dialog onCreateDialog(int id) {
			
			Log.d("Vaccine Reminder","Dialog box opened...");		
			
			return new DatePickerDialog(this, datePickerListener, year, month, day);
		}
		private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
			public void onDateSet(DatePicker view, int selectedYear, int selectedMonth, int selectedDay) {
				y=selectedYear;
				m=selectedMonth;
				d=selectedDay;
				et.setText(selectedDay + "/" + (selectedMonth + 1) + "/"
						+ selectedYear);
				Log.d("Vaccine Reminder","setText into et successful...");
				
			}
		};
		
		
		
		 
	public void addNewVac(View view) {
		
		HashMap<String, String> queryValues =  new  HashMap<String, String>();
		queryValues.put("vacName", vacName.getText().toString());
		queryValues.put("time", et.getText().toString());
		queryValues.put("personName", edText.getText().toString());
		controller.insertVacc(queryValues);
		
		this.setNotification(view);
		this.callHomeActivity(view);
	}
	
	public void setNotification(View view){
		Log.d("Vaccine Reminder","noti set started...");
		Log.d("Vaccine Reminder","newVac.java...");
		try{	
		//notification	will set in 7:00:00 am								
		Calendar calendar = Calendar.getInstance();
		calendar.set(y,m,d);
		calendar.set(Calendar.HOUR, 7);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.SECOND, 0);
	    calendar.set(Calendar.AM_PM,Calendar.AM);
		long when = calendar.getTimeInMillis();
		
		Log.d("tag", when + " " + System.currentTimeMillis());			
		
		
		Intent si = new Intent(this, MyNotificationService.class);
		si.putExtra("msg", "Notification");
		
		pendingIntent = PendingIntent.getService(this,1, si, PendingIntent.FLAG_ONE_SHOT);
		
		AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
	    alarmManager.set(AlarmManager.RTC, when, pendingIntent);

		
		Log.d("Vaccine Reminder","noti set successful...");
		}
		catch (Exception e) {
			//Toast.makeText(getApplicationContext(), ""+e, Toast.LENGTH_LONG).show();

		}
	}
	public void callHomeActivity(View view) {
		Intent objIntent = new Intent(getApplicationContext(), first.class);
		startActivity(objIntent);
	}
	
	
}
	
