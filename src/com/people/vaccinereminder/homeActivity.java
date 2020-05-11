package com.people.vaccinereminder;

//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import android.app.AlarmManager;
//import android.database.Cursor;
//import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;



public class homeActivity extends ListActivity{
	

	
	//PendingIntent pendingIntent;
	//Notification notification;
	Intent intent;	
	TextView vacId;
	DBController controller = new DBController(this);
	//int count=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_activity);
		
		ArrayList<HashMap<String, String>> vaccList =  controller.getAllVacc();
		if(vaccList.size()!=0) {
			ListView lv = getListView();
			lv.setOnItemClickListener(new OnItemClickListener() {
				  @Override 
				  public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
					  vacId = (TextView) view.findViewById(R.id.vacId);
					  String valvaccId = vacId.getText().toString();					  
					  Intent  objIndent = new Intent(getApplicationContext(),editVac.class);
					  objIndent.putExtra("vacId", valvaccId); 
					  startActivity(objIndent); 
				  }
			}); 
			ListAdapter adapter = new SimpleAdapter( homeActivity.this,vaccList, R.layout.view_vac_list, 
					new String[] { "vacId","vacName","time", "personName"}, new int[] {R.id.vacId, R.id.vacName, R.id.time, R.id.TextPerson}); 
			setListAdapter(adapter);
			
		}
	}
	
	public void showAddForm(View view) {
		Intent objIntent = new Intent(getApplicationContext(), newVac.class);
		startActivity(objIntent);
	}

}
