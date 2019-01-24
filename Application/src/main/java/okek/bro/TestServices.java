package okek.bro;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.*;

/**
 * Created by Dedi Dot on 1/22/2019.
 * Happy Coding!
 */

public class TestServices extends Service {

    @Override
    public void onCreate() {
        Log.e("wkwk", "onCreate");
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("wkwk", "onBind");
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("wkwk", "hellooooYYY");
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Log.e("wkwk", "executed");
            }
        }, 0, 1000);
        return START_STICKY;
    }

    /*@Override
    public void onTaskRemoved(Intent rootIntent) {
        Log.e("wkwk", "onTaskRemoved");
        *//*Intent intent = new Intent(this, TestServices.class);
        PendingIntent pendingIntent = PendingIntent.getService(this, 0,
                intent, 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME,
                0, 0, pendingIntent);*//*
        super.onTaskRemoved(rootIntent);
    }*/
}

