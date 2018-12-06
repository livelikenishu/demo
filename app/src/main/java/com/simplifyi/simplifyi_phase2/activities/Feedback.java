package com.simplifyi.simplifyi_phase2.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.simplifyi.simplifyi_phase2.R;

public class Feedback extends AppCompatActivity {

    RatingBar mRatingBar;
    TextView mRatingScale;
    TextView mRatingname;
    Button mSendFeedback;
    public Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        init();

        mRatingBar = (RatingBar) findViewById(R.id.ratingBar);
        mRatingScale = (TextView) findViewById(R.id.tvRatingScale);
        mRatingname = (TextView) findViewById(R.id.textView2);
        mSendFeedback = (Button) findViewById(R.id.btn_continue);

        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                mRatingScale.setText(String.valueOf(v));
                switch ((int) ratingBar.getRating()) {
                    case 1:
                        mRatingScale.setText("Very bad");
                        break;
                    case 2:
                        mRatingScale.setText("Need some improvement");
                        break;
                    case 3:
                        mRatingScale.setText("Good");
                        break;
                    case 4:
                        mRatingScale.setText("Great");
                        break;
                    case 5:
                        mRatingScale.setText("Excellent!");
                        break;
                    default:
                        mRatingScale.setText("");
                }
            }
        });


    }

    private void init() {
        but=(Button) findViewById(R.id.btn_continue);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Feedback.this, UploadQuestion.class);
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


