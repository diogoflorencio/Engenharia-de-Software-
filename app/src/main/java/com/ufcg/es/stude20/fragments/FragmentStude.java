package com.ufcg.es.stude20.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ufcg.es.stude20.R;
import com.ufcg.es.stude20.core.TimerListener;
import com.ufcg.es.stude20.models.Stude;
import com.ufcg.es.stude20.widget.CountDownView;

import java.util.Calendar;

/**
 * Created by Notebook on 17/04/2016.
 */
public class FragmentStude extends Fragment implements TimerListener {

    private static final String PREFS_NAME = "FragmentPreferences";
    String [] discs = {"Sistemas da Informação","Loac","Oac","Eng. de Software"};
    private TextView aviso;
    private TextView pressToStart;
    private Spinner spDisc;
    //Buttons do Stude
    private FloatingActionButton startStude;
    private FloatingActionButton proxEvento;

    //private Date dateInFuture;
    //private long diff;

    //Eventos do cronometro
    private CountDownView timer;
    private boolean Intervalo = true;
    private int numIntervalos = 0;
    private boolean contando = false;
    private Stude stude;

    public FragmentStude(Stude stude) {
        super();
        this.stude = stude;
    }

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup)inflater.inflate(R.layout.stude_fragment, container, false);

        Toast.makeText(getActivity(), "Bem-vindo " + stude.getusuario(), Toast.LENGTH_SHORT).show();

        //Buttons Stude
        proxEvento = (FloatingActionButton) view.findViewById(R.id.proxEvento);
        startStude = (FloatingActionButton) view.findViewById(R.id.startStude);

        //Cronometro
        //textView = (TextView) view.findViewById(R.id.countDown);
        timer = (CountDownView) view.findViewById(R.id.viewTimer);

        //Text views
        aviso = (TextView) view.findViewById(R.id.aviso);
        pressToStart = (TextView) view.findViewById(R.id.pressToStart);

        //Spinner de Disciplinas
        ArrayAdapter<String> spAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, discs);
        spAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spDisc = (Spinner) view.findViewById(R.id.spinnerDisc);
        spDisc.setAdapter(spAdapter);
        timer.setListener(this);

        //Touch para iniciar estudos
        startStude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  SharedPreferences sharedPrefs = getActivity().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPrefs.edit();
                editor.putBoolean("Contando", true);
                contando = true;
                timer.setVisibility(View.VISIBLE);
                startStude.setVisibility(View.GONE);
                pressToStart.setVisibility(View.GONE);
                fadeOutText(pressToStart);
                fadeOutButton(startStude);
                aviso.setVisibility(View.VISIBLE);
                fadeInText(aviso);
                aviso.setText("Estude a partir de agora \n e aguarde o tempo acabar");
                timer.setInitialTime(10 * 1000);
                editor.commit();
                timer.start();
            }
        });

        setRetainInstance(true);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Script", "onResume");

        if (contando) {
            startStude.setVisibility(View.GONE);
            pressToStart.setVisibility(View.GONE);

            if (!Intervalo) {
                aviso.setVisibility(View.VISIBLE);
                fadeInText(aviso);
                aviso.setText("Aproveite bem seu intervalo :)");
            }

            if (Intervalo) {
                aviso.setVisibility(View.VISIBLE);
                fadeInText(aviso);
                aviso.setText("Estude a partir de agora \n e aguarde o tempo acabar");
            }
            timer.setInitialTime(timer.getCurrentMillis());
            timer.start();
        }
    }

      @Override
    public void onStop() {
        super.onStop();
        Log.i("Script", "onStop");

      }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Script", "onDestroy");
        timer.stop();
    }

    @Override
    public void timerElapsed() {
        aviso.setVisibility(View.GONE);
        fadeOutText(aviso);
        if (numIntervalos == 2) {
            numIntervalos = 0;
            contando = false;
            startStude.setVisibility(View.VISIBLE);
            pressToStart.setVisibility(View.VISIBLE);
            timer.stop();
            timer.setVisibility(View.GONE);
            fadeInText(pressToStart);
            fadeInButton(startStude);
            Toast.makeText(getActivity(), "Cota diária alcançada. \n Fique a vontade para estudar mais :)", Toast.LENGTH_SHORT).show();
        } else {
            proxEvento.setVisibility(View.VISIBLE);
            proxEvento.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    timer.stop();
                    if (Intervalo && numIntervalos < 2) {
                        Intervalo = false;
                        proxEvento.setVisibility(View.GONE);
                        fadeOutButton(proxEvento);
                        aviso.setVisibility(View.VISIBLE);
                        fadeInText(aviso);
                        aviso.setText("Aproveite bem seu intervalo :)");
                        timer.setInitialTime(5 * 1000);
                        numIntervalos++;
                        timer.start();
                    } else if (!Intervalo && numIntervalos < 2) {
                        Intervalo = true;
                        proxEvento.setVisibility(View.GONE);
                        fadeOutButton(proxEvento);
                        aviso.setVisibility(View.VISIBLE);
                        fadeInText(aviso);
                        aviso.setText("Estude a partir de agora \n e aguarde o tempo acabar");
                        timer.setInitialTime(10 * 1000);
                        timer.start();
                    }
                }
            });
        }
    }

    private void fadeOutButton (FloatingActionButton fba) {
        Animation anim = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), android.R.anim.fade_out);
        fba.setAnimation(anim);
    }

    private void fadeInButton (FloatingActionButton fba) {
        Animation anim = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), android.R.anim.fade_in);
        fba.setAnimation(anim);
    }

    private void fadeOutText (TextView text) {
        Animation anim = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), android.R.anim.fade_out);
        text.setAnimation(anim);
    }

    private void fadeInText (TextView text) {
        Animation anim = AnimationUtils.loadAnimation(getActivity().getApplicationContext(), android.R.anim.fade_in);
        text.setAnimation(anim);
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
