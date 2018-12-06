package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.simplifyi.simplifyi_phase2.R;

public class Finding_Buddy extends AppCompatActivity {
    public Button but;
    public ImageView buddy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finding__buddy);
        init();
    }
    private void init() {

        but=(Button)findViewById(R.id.stop);
        buddy=(ImageView)findViewById(R.id.buddy);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Finding_Buddy.this, DashboardActivites.class);
                startActivity(intent);
            }
        });

        buddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Finding_Buddy.this, Call_deatails_activity.class);
                startActivity(intent);
            }
        });
    }

    public void back(View v)
    {
        Intent in=new Intent(this,DashBoardNavigationActivity.class);
        startActivity(in);
    }


}
