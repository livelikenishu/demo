package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.simplifyi.simplifyi_phase2.R;

public class Activity_incall  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

    }
    public void back(View view)
    {
        Intent intent = new Intent(Activity_incall.this, DashboardActivites.class);
        startActivity(intent);

    }

}