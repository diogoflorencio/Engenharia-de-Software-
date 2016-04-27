package com.ufcg.es.stude20.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ufcg.es.stude20.R;
import com.ufcg.es.stude20.models.Stude;

/**
 * Created by Notebook on 17/04/2016.
 */
public class FragmentCronograma extends Fragment {

    public FragmentCronograma(Stude stude) {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.cronograma_fragment, container, false);

        return view;

    }
}
