package com.people.vaccinereminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//import android.widget.Toast;


public class ListActivity extends Activity{
	
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
			tv1String = "Vaccine Name : BCG";
			tv2String = "To prevent : Tuberculosis";
			st3= "No.of dosage: 1";
			st4= "Time of Vaccination : \n\n" +
					"After birth.\n" +
					"At first contact baby receive BCG and if it occur within 14 days, " +
					"it also receive Oral Polio Vaccine (OPV). " +
					"If baby visit after 14 days, it receives only BCG.";
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 1)
		{
			tv1String = "Vaccine Name : DPT";
			tv2String = "To prevent : Diphtheria, Pertussis & Tetanus";
			st3= "No.of dosage: 3\n" +
					"Interval between doses: 4 weeks";
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	6 Weeks old\n" +
					"Second Dose:	10 Weeks old\n" +
					"Third Dose:	14 Weeks old\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 2)
		{
			tv1String = "Vaccine Name : Hepatitis B";
			tv2String = "To prevent : Hepatitis-B";
			st3= "No.of dosage: 3\n\n" +
					"Interval between doses: 4 weeks";
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	6 Weeks old\n" +
					"Second Dose:	10 Weeks old\n" +
					"Third Dose:	14 Weeks old\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 3)
		{
			tv1String = "Vaccine Name : Pentavalent Rotavirus Vaccine(PRV)";
			tv2String = "To prevent : Rotavirus";
			st3= "No.of dosage: 3\n\n" +
					"Interval between doses: 4 weeks";
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	6 Weeks old\n" +
					"Second Dose:	10 Weeks old\n" +
					"Third Dose:	14 Weeks old\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 4)
		{
			tv1String = "Vaccine Name : Haemophilus Influenzae Type B Vaccine(HIB)";
			tv2String = "To prevent : Influenzae";
			st3= "No.of dosage: 3\n" ;
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	14 Weeks old\n" +
					"Second Dose:	20 Weeks old\n" +
					"Third Dose:	6 Months old\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 5)
		{
			tv1String = "Vaccine Name : Oral Polio Vaccine(OPV)";
			tv2String = "To prevent : Poliomyelitis";
			st3= "No.of dosage: 5\n" ;
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	6 Weeks old\n" +
					"Second Dose:	10 Weeks old\n" +
					"Third Dose:	14 Weeks old\n" +
					"Fourth Dose:	9 Months old\n" +
					"Fifth Dose:	5 Years old\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 6)
		{
			tv1String = "Vaccine Name : MR vaccine";
			tv2String = "To prevent : Measles and Rubella";
			st3= "No.of dosage: 1\n" ;
			st4= "Time of Vaccination : \n\n" +
					"After completion of 9 months"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 7)
		{
			tv1String = "Vaccine Name : MCV-1";
			tv2String = "To prevent : Measles";
			st3= "No.of dosage: 1\n" ;
			st4= "Time of Vaccination : \n\n" +
					"At age of 9 -12 months"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 8)
		{
			tv1String = "Vaccine Name : MCV-2";
			tv2String = "To prevent : Measles";
			st3= "No.of dosage: 2\n" ;
			st4= "Time of Vaccination : \n\n" +
					"At age of 15 -18 months"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 9)
		{
			tv1String = "Vaccine Name : MMR Vaccine";
			tv2String = "To prevent : Measles, Mumps and Rubella";
			st3= "No.of dosage: 1\n" ;
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	15-18 Months old\n" +
					"Second Dose:	12-14 Years old\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		
		
		if(intValue== 10)
		{
			tv1String = "Vaccine Name : DPT Booster";
			tv2String = "To prevent : Diphtheria, Pertussis & Tetanus";
			st3= "No.of dosage: 1\n" ;
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	15-18 Months old\n" +
					"Second Dose:	5 Years old\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 11)
		{
			tv1String = "Vaccine Name : Typhoid Vaccine";
			tv2String = "To prevent : Typhoid";
			st3= "No.of dosage: 1\n" ;
			st4= "Time of Vaccination : \n\n" +
					"At age of 2 years"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
	
		if(intValue== 12)
		{
			tv1String = "Vaccine Name : Chicken Pox Vaccine(Varilix)";
			tv2String = "To prevent : Chicken Pox";
			st3= "No.of dosage: 1\n" +
					"Interval between doses: Should not be less than 4 weeks under any circumstance." ;
			st4= "Time of Vaccination : \n\n" +
					"1-12 years of age: Single dose\n" +
					"above 13 years: 2 doses with an interval between doses of at least 6 weeks;\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 13)
		{
			tv1String = "Vaccine Name : Hepatitis B Booster";
			tv2String = "To prevent : Hepatitis B";
			st3= "No.of dosage: 2\n" ;
			st4= "Time of Vaccination : \n\n" +
					"First Dose:	5 Years old\n" +
					"Second Dose:	10 Years old\n"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 14)
		{
			tv1String = "Vaccine Name : Pneumonia Vaccine 23 Valent";
			tv2String = "To prevent : Pneumonia";
			st3= "No.of dosage: 1\n" ;
			st4= "Time of Vaccination : \n\n" +
					"At the age of >2 Years"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 15)
		{
			tv1String = "Vaccine Name : Pneumonia Vaccine 7 Valen";
			tv2String = "To prevent : Pneumonia";
			st3= "No.of dosage: \n" +
					"1) 2 months of age: \n\n3 doses at 2 months interval " +
					"from each dose and a 4th dose at the age of 12 to " +
					"15 months.\n\n" +
					"2)7 to 11 months: \n\nTotal 3 doses; the first 2 doses " +
					"at 2 months apart and 3rd dose after the child’s one " +
					"year birthday.\n\n" +
					"3)12 to 13 months: \n\nTotal 2 doses; 2 doses at 2 months" +
					" apart." +
					"4)24 months to 5 years: \n\n1 dose ";
			st4= "Time of Vaccination : \n\n" +
					"At the age of <2 Years";
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 16)
		{
			tv1String = "Vaccine Name : Vaccine against Cholera & Diarrhoea";
			tv2String = "To prevent : Cholera & Diarrhoea";
			st3= "No.of dosage: \n" +
					"1)At the age of 2-6 Years: 2 doses\n\n" +
					"2)At the age of >6 Years: 3 doses\n\n" +
					"Doses are to be administered at intervals " +
					"of at least one week. If more than 6 weeks " +
					"have elapsed between doses, the primary " +
					"immunization course should be restarted."
					;
			st4= "Time of Vaccination : \n\n" +
					"1)At the age of 2-6 Years" +
					"2)At the age of >6 Years";
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
		if(intValue== 17)
		{
			tv1String = "Vaccine Name : Hepatitis A";
			tv2String = "To prevent : Hepatitis-A";
			st3= "No.of dosage: 1\n\n";
			st4= "Time of Vaccination : \n\n" +
					"Between age 1-15 years"; 
			tv1.setText(tv1String);
			tv2.setText(tv2String);
			tv3.setText(st3);
			tv4.setText(st4);
		}
		
	}

}
