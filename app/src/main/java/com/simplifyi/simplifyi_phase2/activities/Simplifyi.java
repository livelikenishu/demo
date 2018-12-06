package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.simplifyi.simplifyi_phase2.R;

public class Simplifyi  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplify);

//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new simplifyfragment()).commit();
    }

    public void back(View v)
    {
        Intent in=new Intent(this,DashboardActivites.class);
        startActivity(in);
    }



}
