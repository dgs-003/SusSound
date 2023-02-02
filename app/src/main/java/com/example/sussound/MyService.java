package com.example.sussound;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.widget.Toast;
public class MyService extends Service {
    PowerReceiver powerReceiver=new PowerReceiver();
    public MyService() {
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        onTaskRemoved(intent);
        IntentFilter filter = new IntentFilter(Intent.ACTION_POWER_CONNECTED);
        IntentFilter mfilter = new IntentFilter(Intent.ACTION_POWER_DISCONNECTED);
        registerReceiver(powerReceiver, filter);
        registerReceiver(powerReceiver, mfilter);
//        Toast.makeText(getApplicationContext(),"This is a Service running in Background",
//                Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onTaskRemoved(Intent rootIntent) {
        Intent restartServiceIntent = new Intent(getApplicationContext(),this.getClass());
        restartServiceIntent.setPackage(getPackageName());
        startService(restartServiceIntent);
        super.onTaskRemoved(rootIntent);
    }
}
