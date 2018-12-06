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
import com.simplifyi.simplifyi_phase2.activities.Activity_incall;
import com.simplifyi.simplifyi_phase2.activities.DashboardActivites;

public class add  extends Fragment {

    public static add newInstance() {
        return new add();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.primarycategory, container, false);
    }

}
