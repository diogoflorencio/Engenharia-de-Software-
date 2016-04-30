package com.ufcg.es.stude20;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.ufcg.es.stude20.models.Stude;

import uz.shift.colorpicker.LineColorPicker;
import uz.shift.colorpicker.OnColorChangedListener;

/**
 * Created by Notebook on 20/04/2016.
 */
public class ActivityCadastrarDisciplina extends Activity {
    private TextView thatColor;
    private TextView nomeDisciplina, dificuldadeText, colorText;
    private EditText nomeDisc;
    private Button salvarDisc;
    private RadioButton dificilButton, facilButton;
    private String[] pallete = {"#910000","#d00000", "#f93b4a", "#ff4040", "#fe0947", "#fe5580", "#ee82ee", "#b882ee", "#8470ff",
            "#6c90cc", "#358dd6", "#29b4fb", "#14f5e6", "#00ffd3", "#00ffab", "#00ff54", "#f9ff00", "#fdff00", "#fdff66", "#feffcc", "#ffffff"};
    private LineColorPicker colorPicker;
    private Stude stude;

    //Valores finais
    private String disciplina, dificuldade;
    private int cor;
    //

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrardisc_activity);
        Intent it = getIntent();

        stude = (Stude) it.getSerializableExtra("stude");

        colorPicker = (LineColorPicker) findViewById(R.id.picker);
        thatColor = (TextView) findViewById(R.id.thatColor);
        salvarDisc = (Button) findViewById(R.id.salvarDisc);
        //
        facilButton = (RadioButton) findViewById(R.id.facilButton);
        dificilButton = (RadioButton) findViewById(R.id.dificilButton);
        nomeDisc = (EditText) findViewById(R.id.nomeDisc);
        //

        //Bloco das cores
        int[] colors = new int[pallete.length];

        for (int i = 0; i < colors.length; i++) {
            colors[i] = Color.parseColor(pallete[i]);
        }

        colorPicker.setColors(colors);
        colorPicker.setSelectedColor(Color.parseColor(pallete[0]));

        colorPicker.setOnColorChangedListener(new OnColorChangedListener() {
            @Override
            public void onColorChanged(int c) {
                thatColor.setBackgroundColor(c);
            }
        });

        final int color = colorPicker.getColor();
        //Fim do bloco das cores

        salvarDisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cor = colorPicker.getColor();
                disciplina = nomeDisc.getText().toString();
                if (disciplina.matches("")) {
                    Toast.makeText(ActivityCadastrarDisciplina.this, "Dê um nome a disciplina", Toast.LENGTH_SHORT).show();
                }

                else if (!facilButton.isChecked() && !dificilButton.isChecked()) {
                    Toast.makeText(ActivityCadastrarDisciplina.this, "Selecione uma dificuldade", Toast.LENGTH_SHORT).show();
                }

                else {
                    try {
                        stude.addDisciplina(disciplina, cor);
                        startActivity(new Intent(ActivityCadastrarDisciplina.this, MainActivity.class));
                        finish();
                    } catch (Exception e) {
                        Toast.makeText(ActivityCadastrarDisciplina.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}