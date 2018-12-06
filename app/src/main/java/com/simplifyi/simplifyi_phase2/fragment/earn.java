package com.simplifyi.simplifyi_phase2.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.simplifyi.simplifyi_phase2.R;
import com.simplifyi.simplifyi_phase2.activities.DashBoardNavigationActivity;
import com.simplifyi.simplifyi_phase2.activities.Feedback;
import com.simplifyi.simplifyi_phase2.activities.UploadQuestion;

public class earn extends Fragment{


    public static earn newInstance() {
        return new earn();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_termsand_conditions, container, false);
    }

}