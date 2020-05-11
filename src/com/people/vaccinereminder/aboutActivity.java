package com.people.vaccinereminder;


import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//import android.widget.Toast;

public class aboutActivity extends Activity{
	
	private TextView tvabout1,tvabout2,tvabout3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.about_activity);
		
		//Intent mIntent = getIntent();
		//int intValue = mIntent.getIntExtra("intVariableName", 0);		
		//Toast.makeText(getApplicationContext(), "Item selected...", Toast.LENGTH_SHORT).show();
		
		String tv1String, tv2String, tv3String;

		tvabout1 = (TextView) findViewById(R.id.aboutInfo2);
		tvabout2 = (TextView) findViewById(R.id.aboutInfo3);
		tvabout3 = (TextView) findViewById(R.id.aboutInfo4);
		
		tv1String = "Description: ";
		
		tv2String = "Vaccine Reminder is the easy-to-use tool for you to track of your vaccination due date. \nIt is important to keep your family vaccination records up to date, but managing and tracking \nthem can be very challenging. So, we have created the Vaccine Reminder.\nThe Vaccine Reminder is for Parents as well as Pediatric Doctors interested in keeping track of immunization schedule.\n\n\n";
		
		tv3String= "Features of Vaccine Reminder:\n\n"+
					"1. Vaccine List and Info\n" +
					"2, Generate Vaccination Schedule\n"+
					"3. Notify for Vaccine Reminders.\n\n\n" +
					"We will keep on adding new features to bring the immunization tracking at your fingertips. " +
					"Please remember getting your kids vaccinated is the best way to protect them from " +
					"life-threatening diseases.\n\n"+
					"Vaccines Names and details as Per World Health organization (WHO)," +
					"Vaccination Centre - Apollo Hospitals Dhaka,Vaccination - IBN SINA TRUST.\n\n"+
					"Notice - All the information about Vaccination has been mentioned in this application " +
					"are informative purpose only. Consult with your Doctor about what and when Vaccinations " +
					"need to be done for your baby.";
		
		
		
		tvabout1.setText(tv1String);
		tvabout2.setText(tv2String);
		tvabout3.setText(tv3String);
		
	}

}
