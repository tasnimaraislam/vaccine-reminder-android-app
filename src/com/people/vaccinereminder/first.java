package com.people.vaccinereminder;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class first extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_main);
		
		Resources ressources = getResources(); 
		TabHost tabHost = getTabHost(); 
		
		Intent intentUser = new Intent().setClass(this, normalPanel.class);
		TabSpec tabSpecUser = tabHost
				.newTabSpec("Normal User")
				.setIndicator("", ressources.getDrawable(R.layout.icon_normal_config))
				.setContent(intentUser);
		
		Intent intentEmployee = new Intent().setClass(this, homeActivity.class);
		TabSpec tabSpecEmployee = tabHost
				.newTabSpec("User")
				.setIndicator("", ressources.getDrawable(R.layout.icon_vac_config))
				.setContent(intentEmployee);
		
		Intent intentAbout = new Intent().setClass(this, aboutActivity.class);
		TabSpec tabSpecAbout = tabHost
				.newTabSpec("About")
				.setIndicator("",ressources.getDrawable(R.layout.icon_about))
				.setContent(intentAbout);
		
		// add all tabs 
		tabHost.addTab(tabSpecUser);
		tabHost.addTab(tabSpecEmployee);
		tabHost.addTab(tabSpecAbout);
		//set Windows tab as default (zero based) for showing the first tab after launch
		tabHost.setCurrentTab(0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

