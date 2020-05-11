package com.people.vaccinereminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//import android.widget.Toast;

public class ListActivity2 extends Activity{
	
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
			tv1String = "Vaccine Name : MR vaccine";
			tv2String = "To prevent : Measles-Rubella";
			st3= "No.of dosage: \n\nThe 2nd dose is only given to women.";
			st4= "Time of Vaccination : \n\n" +
					"At age of 15 years";
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 1)
		{
			tv1String = "Vaccine Name : TT";
			tv2String = "To prevent : Tetanus";
			st3= "No.of dosage: 5\n\n" ;
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	15 years old\n" +
					"Second Dose:	4 weeks after TT-1\n" +
					"Third Dose:	6 months after TT-2\n" +
					"Fourth Dose:	1 year after TT-3\n" +
					"Fifth Dose:	1 year after TT-4\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 2)
		{
			tv1String = "Vaccine Name : Human Papiloma Virus Vaccine";
			tv2String = "To prevent : Human Papiloma Virus";
			st3= "No.of dosage: 3\n\n";
			st4= "Time of Vaccination : \n\n" +
					"For females from 10 to 50 years of age\n\n" +
					"First Dose:	Any day after 10 years of age  \n" +
					"Second Dose:	1 month from 1st dose\n" +
					"Third Dose:	6 months from 1st dose\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}		
		
	}

}
