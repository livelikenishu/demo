package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.simplifyi.simplifyi_phase2.R;
import com.simplifyi.simplifyi_phase2.activities.RegisterPage;

import me.anwarshahriar.calligrapher.Calligrapher;

import static com.simplifyi.simplifyi_phase2.activities.ApplicationTimer.SPLASH_TIME_OUT;


public class Logo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
       // setContentView(R.layout.dummy);
//        Calligrapher myfront=new Calligrapher(this);
//        myfront.setFont(this,"roboto.xml",true);
       new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(Logo.this, RegisterPage.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }


}
