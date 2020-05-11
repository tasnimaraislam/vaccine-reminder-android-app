package com.people.vaccinereminder;

import java.util.Calendar;
import java.util.HashMap;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.Notification;
//import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
//import android.widget.Toast;

public class editVac extends Activity implements OnClickListener{	
	private ImageButton ib;
	private Calendar cal;
	private int day;
	private int month;
	private int year;
	public EditText et;
	PendingIntent pendingIntent;
	Notification notification;
	int d,m,y;
	EditText vacName, textTime;
	DBController controller = new DBController(this);
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
		 	super.onCreate(savedInstanceState);
			setContentView(R.layout.edit_vac);
			
			vacName = (EditText) findViewById(R.id.vacName);
			textTime = (EditText) findViewById(R.id.ETPerson02);
			
			ib = (ImageButton) findViewById(R.id.imageButton2);
			cal = Calendar.getInstance();
			day = cal.get(Calendar.DAY_OF_MONTH);
			month = cal.get(Calendar.MONTH);
			year = cal.get(Calendar.YEAR);
			et = (EditText) findViewById(R.id.editTextEditVac);
			ib.setOnClickListener(this);
			
			Intent objIntent = getIntent();
			String vacId = objIntent.getStringExtra("vacId");
			Log.d("Reading: ", "Reading all contacts..");
			
			HashMap<String, String> vaccList = controller.getVaccInfo(vacId);
			Log.d("vacName",vaccList.get("vacName"));
			Log.d("time",vaccList.get("time"));
			Log.d("personName",vaccList.get("personName"));
			
			if(vaccList.size()!=0) {
				vacName.setText(vaccList.get("vacName"));
				et.setText(vaccList.get("time"));
				textTime.setText(vaccList.get("personName"));
			}
	    }
	 
	 @SuppressWarnings("deprecation")
		public void onClick(View v) {
			showDialog(0);
		}

		@Override
		@Deprecated
		protected Dialog onCreateDialog(int id) {
			return new DatePickerDialog(this, datePickerListener, year, month, day);
		}
		private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
			public void onDateSet(DatePicker view, int selectedYear,
					int selectedMonth, int selectedDay) {
				y=selectedYear;
				m=selectedMonth;
				d=selectedDay;
				
				et.setText(selectedDay + " / " + (selectedMonth + 1) + " / "
						+ selectedYear);
			}
		};
	 
		
	 
	public void editvacc(View view) {
		HashMap<String, String> queryValues =  new  HashMap<String, String>();
		vacName = (EditText) findViewById(R.id.vacName);
		Intent objIntent = getIntent();
		String vacId = objIntent.getStringExtra("vacId");
		queryValues.put("vacId", vacId);
		queryValues.put("vacName", vacName.getText().toString());
		queryValues.put("time", et.getText().toString());
		queryValues.put("personName", textTime.getText().toString());
		
		controller.updateVacc(queryValues);
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
	
	public void removevacc(View view) {
		Intent objIntent = getIntent();
		String vacId = objIntent.getStringExtra("vacId");
		controller.deleteVacc(vacId);
		this.callHomeActivity(view);
		
	}
	public void callHomeActivity(View view) {
		Intent objIntent = new Intent(getApplicationContext(),first.class);
		startActivity(objIntent);
	}
	
	
}
