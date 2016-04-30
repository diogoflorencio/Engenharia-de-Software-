package com.ufcg.es.stude20.fragments;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.ufcg.es.stude20.R;
import com.ufcg.es.stude20.extras.CustomListAdapter;
import com.ufcg.es.stude20.models.Disciplina;
import com.ufcg.es.stude20.models.Stude;

import uz.shift.colorpicker.LineColorPicker;
import uz.shift.colorpicker.OnColorChangedListener;

/**
 * Created by Notebook on 17/04/2016.
 */
public class FragmentDisciplinas extends Fragment {
    //Button de Disciplinas
    private FloatingActionButton addDisc;
    private FrameLayout studeLayout;
    //Lista de Disciplinas
    private ListView lv;
    private CustomListAdapter listAdapter;
    private LineColorPicker colorPicker;
    String [] pallete = {"#910000","#d00000", "#f93b4a", "#ff4040", "#fe0947", "#fe5580", "#ee82ee", "#b882ee", "#8470ff",
            "#6c90cc", "#358dd6", "#29b4fb", "#14f5e6", "#00ffd3", "#00ffab", "#00ff54", "#f9ff00", "#fdff00", "#fdff66", "#feffcc", "#ffffff"};
    private Stude stude;
    private ViewGroup view;
    private Button editarDisc, buttonExcluir;
    private EditText editarNome;

    public FragmentDisciplinas(Stude stude) {
        super();
        this.stude = stude;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = (ViewGroup) inflater.inflate(R.layout.disciplinas_fragment, container, false);

        String [] nomesDisc = new String[stude.getDisciplinas().size()];
        for (int i = 0; i < nomesDisc.length; i++) {
            nomesDisc[i] = stude.getDisciplinas().get(i).getNome();
        }

        listAdapter =  new CustomListAdapter(getActivity(), stude.getDisciplinas(), nomesDisc);
        //Adicionar disciplinas
        addDisc = (FloatingActionButton) view.findViewById(R.id.addDisc);

        lv = (ListView) view.findViewById(R.id.listDisc);
        lv.setAdapter(listAdapter);

        Toast.makeText(getActivity(), Integer.toString(stude.getDisciplinas().size()), Toast.LENGTH_SHORT).show();

        addDisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogCadastrar(stude);
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showInputDialog(stude.getDisciplinas().get(position), position);
            }
        });
        return view;
    }

    public void showInputDialog(final Disciplina oldItem, final int index) {
        final Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.disciplina_dialog);

        final TextView thatColor = (TextView) dialog.findViewById(R.id.thatColor);
        colorPicker = (LineColorPicker) dialog.findViewById(R.id.colorPicker);

        //Bloco das cores
        int[] colors = new int[pallete.length];

        for (int i = 0; i < colors.length; i++) {
            colors[i] = Color.parseColor(pallete[i]);
        }

        colorPicker.setColors(colors);
        colorPicker.setSelectedColor(oldItem.getCor());
        colorPicker.setOnColorChangedListener(new OnColorChangedListener() {
            @Override
            public void onColorChanged(int c) {
                thatColor.setBackgroundColor(c);
            }
        });

        final int color = colorPicker.getColor();
        //Fim do bloco das cores

        dialog.setTitle("Editar disciplina");

        editarDisc = (Button) dialog.findViewById(R.id.editarDisc);
        buttonExcluir = (Button) dialog.findViewById(R.id.buttonExcluir);
        editarNome = (EditText) dialog.findViewById(R.id.editarNome);
        editarNome.setText(oldItem.getNome());

        editarDisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    oldItem.setNome(editarNome.getText().toString());
                    oldItem.setCor(color);
                    listAdapter.notifyDataSetChanged();
                    dialog.dismiss();
                } catch (Exception e) {
                    Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT);
                }
            }
        });

        buttonExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    stude.removeDisciplina(oldItem.getNome());
                    listAdapter.remove(oldItem.getNome());
                    listAdapter.notifyDataSetChanged();
                    dialog.dismiss();
                } catch (Exception e) {
                    Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT);
                }
            }
        });

        dialog.show();
    }

    public void showDialogCadastrar(final Stude stude) {
        final Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.cadastrardisc_activity);

        colorPicker = (LineColorPicker) dialog.findViewById(R.id.picker);
        final TextView thatColor = (TextView) dialog.findViewById(R.id.thatColor);
        Button salvarDisc = (Button) dialog.findViewById(R.id.salvarDisc);
        //
        final RadioButton facilButton = (RadioButton) dialog.findViewById(R.id.facilButton);
        final RadioButton dificilButton = (RadioButton) dialog.findViewById(R.id.dificilButton);
        final EditText nomeDisc = (EditText) dialog.findViewById(R.id.nomeDisc);
        //

        //Bloco das cores
        int[] colors = new int[pallete.length];

        for (int i = 0; i < colors.length; i++) {
            colors[i] = Color.parseColor(pallete[i]);
        }

        colorPicker.setColors(colors);

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
                if (!facilButton.isChecked() && !dificilButton.isChecked()) {
                    Toast.makeText(getActivity(), "Selecione uma dificuldade", Toast.LENGTH_SHORT).show();
                }

                else {
                    try {
                        stude.addDisciplina(nomeDisc.getText().toString(), colorPicker.getColor());
                        listAdapter.notifyDataSetChanged();
                        dialog.dismiss();
                    } catch (Exception e) {
                        Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                listAdapter.notifyDataSetChanged();
            }
        });

        dialog.show();
    }
}
