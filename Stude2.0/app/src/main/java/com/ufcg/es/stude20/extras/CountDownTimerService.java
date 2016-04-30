package com.ufcg.es.stude20.extras;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.TextView;

import java.util.Calendar;

/**
 *
 * Created by Notebook on 19/04/2016.
 */
public class CountDownTimerService extends Service {
    private long timerInFuture;
    private long millisInFuture = 25*60*1000;
    private TextView textView;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Worker w = new Worker(startId);
        w.start();
        return super.onStartCommand(intent, flags, startId);
    }

    class Worker extends Thread {
        public boolean ativo = true;
        public int startId;

        public Worker(int startId) {
            this.startId = startId;
        }

        @Override
        public void run() {
            while (ativo) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                millisInFuture -=1000;
                textView.setText(getCorrectTimer(true, millisInFuture)+":"+getCorrectTimer(false, millisInFuture));
            }
            stopSelf(startId);
        }

        private String getCorrectTimer(boolean isMinute, long millisUntilFinished) {
            String aux;
            int constCalendar = isMinute ? Calendar.MINUTE : Calendar.SECOND;
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(millisUntilFinished);

            aux = c.get(constCalendar) < 10 ? "0" + c.get(constCalendar) : ""+c.get(constCalendar);

            return aux;
        }
    }
}
