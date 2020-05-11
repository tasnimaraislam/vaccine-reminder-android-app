package com.people.vaccinereminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//import android.widget.Toast;


public class ListActivity3 extends Activity{
	
	TextView tv1,tv2,tv3,tv4;
	int position;
	String tv1String, tv2String, st3,st4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_activity);
		
		Intent mIntent = getIntent();
		int intValue = mIntent.getIntExtra("intVariableName", position);
		//Toast.makeText(getApplicationContext(), "position: "+intValue, Toast.LENGTH_SHORT).show();
		
		tv1 = (TextView) findViewById(R.id.vaccInfo1);
		tv2 = (TextView) findViewById(R.id.vaccInfo2);
		tv3 = (TextView) findViewById(R.id.vaccInfo3);
		tv4 = (TextView) findViewById(R.id.vaccInfo4);
		
		if(intValue== 0)
		{
			tv1String = "Vaccine Name : Hepatitis A and its Booster";
			tv2String = "To prevent : Hepatitis-A";
			st3= "No.of dosage: 1 dose(vaccine)\n" +
					"1 dose(Booster)\n";
			st4= "Time of Vaccination : \n\n" +
					"For 15 years and above: single dose\n  " +
					"a booster dose after 6 months from Vaccine dose"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 1)
		{
			tv1String = "Vaccine Name : Hepatitis B";
			tv2String = "To prevent : Hepatitis-B";
			st3= "No.of dosage: 4\n\n" ;
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	Any Day\n" +
					"Second Dose:	1 month from 1st dose\n" +
					"Third Dose:	2 months from 1st dose\n" +
					"Fourth Dose:	12 months from 1st dose"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
	
		if(intValue== 2)
		{
			tv1String = "Vaccine Name : Chicken Pox Vaccine(Varilix)";
			tv2String = "To prevent : Chicken Pox";
			st3= "No.of dosage: 2\n" ;
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	Any Day\n" +
					"Second Dose:	At least 6 weeks from 1st dose\n" +
					"The interval should not be less than 4 weeks under any circumstance.";
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 3)
		{
			tv1String = "Vaccine Name : Pneumonia Vaccine 23 Valent";
			tv2String = "To prevent : Pneumonia";
			st3= "No.of dosage: 1\n" ;
			st4= "Time of Vaccination : \n\n" +
					"At the age of >2 Years" +
					"Age 65 years and above: Booster dose."; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		
		if(intValue== 4)
		{
			tv1String = "Vaccine Name : Vaccine against Cholera & Diarrhoea";
			tv2String = "To prevent : Cholera & Diarrhoea";
			st3= "No.of dosage: 2\n";
			st4= "Time of Vaccination : \n\n" +
					"Doses are to be administered at intervals of at " +
					"least one week. If more than 6 weeks have elapsed " +
					"between doses, the primary immunization course " +
					"should be restarted.";
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		
	}

}
