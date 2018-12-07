package com.simplifyi.simplifyi_phase2.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.simplifyi.simplifyi_phase2.R;
import com.simplifyi.simplifyi_phase2.activities.DashBoardNavigationActivity;
import com.simplifyi.simplifyi_phase2.activities.Selecttabs;


public class profile extends Fragment {

    public static profile newInstance() {
        return new profile();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_user_profile, container, false);
    }


}