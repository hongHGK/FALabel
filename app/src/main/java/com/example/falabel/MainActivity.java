package com.example.falabel;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.falabel.ui.main.SectionsPagerAdapter;
import com.example.falabel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private TextView start_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_txt = findViewById(R.id.start_txt);

    }

    public void setup(View v) { //start asking for allergy

    }

}