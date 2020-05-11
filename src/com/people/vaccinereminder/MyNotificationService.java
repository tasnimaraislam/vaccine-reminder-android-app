package com.people.vaccinereminder;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;
//import android.preference.PreferenceManager;
//import android.widget.Toast;
//import android.content.Context;

public class MyNotificationService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
//		String ms = "You have a noti";	
		
		Uri uri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
		
		Intent ni = new Intent(this, first.class);
		
		PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, ni, 0);
		
		final NotificationManager mgr=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
		
		Notification notification=new Notification.Builder(this)
		.setContentTitle("Vaccine Reminder!!!")
		.setTicker("Check your Vaccine Reminder list!!!!\nYou have to take vaccine today.")
		.setWhen(System.currentTimeMillis())
		.setSmallIcon(R.drawable.ic_launcher)
		.setContentIntent(pendingIntent)
		.setSound(uri)
		.setDefaults(Notification.DEFAULT_VIBRATE)
		.build();
		
		mgr.notify(1, notification);
		
		//Toast.makeText(getApplication(), ms, Toast.LENGTH_LONG).show();
		
		return super.onStartCommand(intent, flags, startId);
		
	
	}
	

}
