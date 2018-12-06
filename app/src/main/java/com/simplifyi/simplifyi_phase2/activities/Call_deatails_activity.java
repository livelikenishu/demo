package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.simplifyi.simplifyi_phase2.R;

public class Call_deatails_activity   extends AppCompatActivity {
    public ImageView cancel;
    public TextView timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbacktimer);
        init();
        timer=(TextView)findViewById(R.id.timerText);
        CountDownTimer count=new CountDownTimer(40*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText("00:"+(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                timer.setText("00:00");

            }
        }.start();
    }

    private void init() {

        cancel=(ImageView)findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Call_deatails_activity.this, Feedback.class);
                startActivity(intent);
            }
        });

    }
    public void back(View v)
    {
        Intent in=new Intent(this,Finding_Buddy.class);
        startActivity(in);
    }


}
