package com.ufcg.es.stude20.extras;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by Notebook on 18/04/2016.
 */
public class MyCountDownTimer extends CountDownTimer {
    private Context context;
    private TextView textView;
    private long timerInFuture;
    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    public MyCountDownTimer(Context context, TextView textView, long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);

        this.context = context;
        this.textView = textView;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        timerInFuture = millisUntilFinished;
        textView.setText(getCorrectTimer(true, millisUntilFinished)+":"+getCorrectTimer(false, millisUntilFinished));
        if (timerInFuture == 0) {
            Toast.makeText(context, "FINISH!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onFinish() {
        timerInFuture -= 1000;
        textView.setText(getCorrectTimer(true, timerInFuture)+":"+getCorrectTimer(false, timerInFuture));
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
