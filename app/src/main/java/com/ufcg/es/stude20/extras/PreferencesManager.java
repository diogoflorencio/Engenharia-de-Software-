package com.ufcg.es.stude20.extras;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Notebook on 15/04/2016.
 */
public class PreferencesManager {
    public static final String ENTERING_FIRST_TIME = "EnteringFirstTime";

    public static void storeInt(Context context, String key, int value) {
        SharedPreferences prefs = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static int getInt(Context context, String key, int defaultValue){
        return context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE).getInt(key, defaultValue);
    }
}