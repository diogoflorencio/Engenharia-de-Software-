package com.ufcg.es.stude20.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ufcg.es.stude20.R;
import com.ufcg.es.stude20.models.Stude;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

/**
 * Created by Notebook on 17/04/2016.
 */
public class FragmentDesempenho extends Fragment {
    PieChart chartBar;

    public FragmentDesempenho(Stude stude) {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.desempenho_fragment, container, false);

        chartBar = (PieChart) view.findViewById(R.id.chartBar);

        chartBar.addPieSlice(new PieModel("Sistemas da Informação 2", 15, Color.parseColor("#FE6DA8")));
        chartBar.addPieSlice(new PieModel("OAC", 25, Color.parseColor("#56B7F1")));
        chartBar.addPieSlice(new PieModel("Eng. de Software", 35, Color.parseColor("#CDA67F")));
        chartBar.addPieSlice(new PieModel("Alguma cadeira aí", 9, Color.parseColor("#FED70E")));

        /*StackedBarModel dom = new StackedBarModel("Dom");
        dom.addBar(new BarModel(1.3f, 0xFF63CBB0));
        dom.addBar(new BarModel(2.8f, 0xFFF06400));

        StackedBarModel seg = new StackedBarModel("Seg");
        seg.addBar(new BarModel(1.0f, 0xFF63CBB0));
        seg.addBar(new BarModel(2.0f, 0xFFF06400));

        StackedBarModel ter = new StackedBarModel("Ter");
        StackedBarModel qua = new StackedBarModel("Qua");
        StackedBarModel qui = new StackedBarModel("Qui");
        StackedBarModel sex = new StackedBarModel("Sex");
        StackedBarModel sab = new StackedBarModel("Sab");

        chartBar.addBar(dom);
        chartBar.addBar(seg);
        chartBar.addBar(ter);
        chartBar.addBar(qua);
        chartBar.addBar(qui);
        chartBar.addBar(sex);
        chartBar.addBar(sab);*/

        chartBar.startAnimation();



        return view;
    }
}
