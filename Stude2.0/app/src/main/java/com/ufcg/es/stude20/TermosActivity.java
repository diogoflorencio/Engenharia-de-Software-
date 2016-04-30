package com.ufcg.es.stude20;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class TermosActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String PREFS_NAME = "MainActivityPreferences";
    private Button buttonContinuar;
    private Button buttonCancelar;
    private CheckBox checkCondicoes;
    private EditText nomeUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPrefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        if (sharedPrefs.getBoolean("primeiroAcesso", false)) {
            Intent it = new Intent(this, MainActivity.class);
            startActivity(it);
            this.finish();
        }

        setContentView(R.layout.condicoes_main);

        buttonContinuar = (Button) findViewById(R.id.buttonContinuar);
        buttonCancelar = (Button) findViewById(R.id.buttonCancelar);
        checkCondicoes = (CheckBox) findViewById(R.id.checkCondicoes);
        nomeUsuario = (EditText) findViewById(R.id.nomeUsuario);
        buttonCancelar.setOnClickListener(this);
        buttonContinuar.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, MainActivity.class);
        Intent it2 = new Intent(Intent.ACTION_MAIN);
        it2.addCategory(Intent.CATEGORY_HOME);
        it2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        if (v.equals(buttonContinuar)) {
            if (checkCondicoes.isChecked()) {
                        it.putExtra("nome", nomeUsuario.getText().toString());
                        startActivity(it);
                        SharedPreferences sharedPrefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPrefs.edit();
                        editor.putBoolean("primeiroAcesso", true);
                        editor.commit();

                        Intent intent = new Intent(this, MainActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        editor.commit();
                        this.finish();
            } else {
                Toast.makeText(this, "Marque a caixa de confirmação", Toast.LENGTH_SHORT).show();
            }
        }
        if (v.equals(buttonCancelar)) {
            startActivity(it2);
        }
    }
}
