package com.simplifyi.simplifyi_phase2.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simplifyi.simplifyi_phase2.R;
import com.simplifyi.simplifyi_phase2.fragment.profile;

public class UserProfile extends AppCompatActivity {

    public static Fragment newInstance() {
        return new profile();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
    }
}
