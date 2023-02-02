package com.example.sussound;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//PowerReceiver powerReceiver=new PowerReceiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(getApplicationContext(),MyService.class));
    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//        IntentFilter filter = new IntentFilter(Intent.ACTION_POWER_CONNECTED);
//        IntentFilter mfilter = new IntentFilter(Intent.ACTION_POWER_DISCONNECTED);
//        registerReceiver(powerReceiver, filter);
//        registerReceiver(powerReceiver, mfilter);
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        unregisterReceiver(powerReceiver);
//    }
}



//    public class PowerReceiver extends BroadcastReceiver {
//
//        @Override public void onReceive(Context context, Intent intent) {
//            if(intent.getAction() == Intent.ACTION_POWER_CONNECTED) {
//                Toast.makeText(MainActivity.this,"Charger connected",Toast.LENGTH_LONG).show();
//            } else if(intent.getAction() == Intent.ACTION_POWER_DISCONNECTED){
//                Toast.makeText(MainActivity.this,"Charger disconnected",Toast.LENGTH_LONG).show();
//        }
//    }
//}}