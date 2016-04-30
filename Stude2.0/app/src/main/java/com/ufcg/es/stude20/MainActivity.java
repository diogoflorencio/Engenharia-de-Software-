package com.ufcg.es.stude20;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

import com.ufcg.es.stude20.extras.ViewPagerAdapter;
import com.ufcg.es.stude20.models.Stude;

public class MainActivity extends AppCompatActivity {
    //Tabs
    private static final String PREFS_NAME = "ActivityPreferences";
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private Stude stude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*SharedPreferences sharedPrefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        if (sharedPrefs.getBoolean("primeiroAcesso", false)) {
            Intent it = new Intent(this, MainActivity.class);
            startActivity(it);
            this.finish();
        }*/

        //String nome = getIntent().getStringExtra("nome");

        try {
            stude = new Stude("Oi");
        } catch (Exception e) {
            e.printStackTrace();
        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.stude_launcher);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        //Criando Tabs
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), getResources().getStringArray(R.array.titles_tab), stude));
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
        }
        return false;
    }

    @Override
    public void onBackPressed() {
        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            super.onBackPressed();
            //additional code
        } else {
            getFragmentManager().popBackStack();
        }
    }

    public Stude getStude() {
        return stude;
    }
}
