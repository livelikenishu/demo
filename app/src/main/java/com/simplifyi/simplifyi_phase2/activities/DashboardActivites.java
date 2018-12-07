package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.simplifyi.simplifyi_phase2.R;
import com.simplifyi.simplifyi_phase2.sinch.CallActivity;

public class DashboardActivites extends AppCompatActivity {
    public ImageButton but;
    public ImageView call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboardactivity);
        init();
    }

    private void init() {

        but=(ImageButton)findViewById(R.id.setting);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivites.this, Selecttabs.class);
                startActivity(intent);
            }
        });

        call=(ImageView)findViewById(R.id.callanswer);
        call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivites.this, CallActivity.class);
                startActivity(intent);
            }
        });
    }


}
