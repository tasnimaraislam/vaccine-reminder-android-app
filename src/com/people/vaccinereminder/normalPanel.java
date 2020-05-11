package com.people.vaccinereminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
//import android.widget.Toast;

public class normalPanel extends Activity implements OnItemClickListener {
	
	ListView l1,l2,l3;
	TextView t1;
	Intent intent1;
	int position;
	
	public String vaccine[] = {"BCG","DPT","Hepatitis B","Pentavalent Rotavirus Vaccine(PRV)", "HIB",
			"Oral Polio Vaccine(OPV)","MR vaccine","MCV-1","MCV-2","MMR Vaccine","DPT Booster","Typhoid Vaccine",
			"Chicken Pox Vaccine","Hepatitis B Booster","Pneumonia Vaccine 23 Valent",
			"Pneumonia Vaccine 7 Valen","Vaccine against Cholera & Diarrhoea","Hepatitis A"};
	
	
	public String vaccine2[] = {"MR vaccine","Tetanus Vaccine","Human Papiloma Virus Vaccine"
			};
	
	public String vaccine3[] = {"Hepatitis A and its Booster","Hepatitis B","Chicken Pox Vaccine",
			"Pneumonia Vaccine 23 Valent","Vaccine against Cholera & Diarrhoea"};
	
	//private List<Alpha> myList=new ArrayAdapter<A>(null, 0);
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.normal_activity);
		
		l1 = (ListView) findViewById(R.id.listView1);
        l1.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1,vaccine));
        l1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "Item selected...ListActivity", Toast.LENGTH_SHORT).show();
				intent1= new Intent(normalPanel.this, ListActivity.class);
				intent1.putExtra("intVariableName", position);
				startActivity(intent1);
			}
		});
		
        l2 = (ListView) findViewById(R.id.listView2);
        l2.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1,vaccine2));
        l2.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "Item selected...ListActivity2", Toast.LENGTH_SHORT).show();
				intent1= new Intent(normalPanel.this, ListActivity2.class);
				intent1.putExtra("intVariableName", position);
				startActivity(intent1);
			}
		});
        
        l3 = (ListView) findViewById(R.id.listView3);
        l3.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1,vaccine3));
        l3.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "Item selected...ListActivity3", Toast.LENGTH_SHORT).show();
				intent1= new Intent(normalPanel.this, ListActivity3.class);
				intent1.putExtra("intVariableName", position);
				startActivity(intent1);
			}
		});
	}
		
	@Override
	public void onItemClick( AdapterView<?> a, View v, int position, long id) {
		// TODO Auto-generated method stub
		}	
	}
