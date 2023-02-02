package com.example.sussound;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.widget.Toast;


    public class PowerReceiver extends BroadcastReceiver {

        @Override public void onReceive(Context context, Intent intent) {
            if(intent.getAction() == Intent.ACTION_POWER_CONNECTED) {
                MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.connet);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you
            } else if(intent.getAction() == Intent.ACTION_POWER_DISCONNECTED){
                MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.disconnet);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you
            }
        }
//        private static boolean isPowerOn(Context context) {
//            return Settings.System.getInt(context.getContentResolver(), Settings.Global., 0) != 0;
//        }
    }

