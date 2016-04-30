package com.ufcg.es.stude20.extras;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ufcg.es.stude20.fragments.FragmentCronograma;
import com.ufcg.es.stude20.fragments.FragmentDesempenho;
import com.ufcg.es.stude20.fragments.FragmentDisciplinas;
import com.ufcg.es.stude20.fragments.FragmentStude;
import com.ufcg.es.stude20.models.Stude;


/**
 * Created by Notebook on 17/04/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private String[] mTabTitles;
    private Stude stude;
    public ViewPagerAdapter(FragmentManager fm, String[] mTabTitles, Stude stude) {
        super(fm);
        this.mTabTitles = mTabTitles;
        this.stude = stude;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentStude(stude);
            case 1:
                return new FragmentDisciplinas(stude);
            case 2:
                return new FragmentCronograma(stude);
            case 3:
                return new FragmentDesempenho(stude);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.mTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.mTabTitles[position];
    }
}
