package com.simplifyi.simplifyi_phase2.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.simplifyi.simplifyi_phase2.R;


public class UploadQuestion extends AppCompatActivity {
    public ImageView but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uploadquestion);
        init();

    }

    private void init() {

        but=(ImageView)findViewById(R.id.answercall);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UploadQuestion.this, Finding_Buddy.class);
                startActivity(intent);
            }
        });
    }


}
