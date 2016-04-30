package com.ufcg.es.stude20.extras;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ufcg.es.stude20.R;
import com.ufcg.es.stude20.models.Disciplina;

import java.util.ArrayList;

/**
 * Created by Notebook on 21/04/2016.
 */
public class CustomListAdapter extends ArrayAdapter<String> {
    Context context;
    ArrayList<Disciplina> disciplinas;

    public CustomListAdapter(Activity context, ArrayList<Disciplina> disciplinas, String[] nomesDisc) {
        super(context, R.layout.list_row, nomesDisc);
        this.context = context;
        this.disciplinas = disciplinas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View single_row = inflater.inflate(R.layout.list_row, null, true);
        TextView textView = (TextView) single_row.findViewById(R.id.nomeDisciplina);
        TextView imageView = (TextView) single_row.findViewById(R.id.imageView);
        TextView hourView = (TextView) single_row.findViewById(R.id.hourView);

        textView.setText(disciplinas.get(position).getNome());
        imageView.setBackgroundColor(disciplinas.get(position).getCor());
        imageView.setTextColor(disciplinas.get(position).getCor());
        hourView.setText(Double.toString(disciplinas.get(position).getHorasEstudadas()));
        return single_row;
    }
}