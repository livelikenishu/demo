package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.simplifyi.simplifyi_phase2.R;

public class TopChat extends AppCompatActivity {
   private Button details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_top_chat);
        init();


    }

    private void init() {

        details = (Button) findViewById(R.id.btn_continue);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(TopChat.this, UserProfile.class);
                    startActivity(intent);

            }
        });

    }

    public void back(View v)
    {
        Intent in=new Intent(this,Simplifyi.class);
        startActivity(in);
    }

}