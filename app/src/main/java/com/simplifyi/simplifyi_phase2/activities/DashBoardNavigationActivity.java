package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.bottomnavigation.LabelVisibilityMode;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.simplifyi.simplifyi_phase2.R;

import com.simplifyi.simplifyi_phase2.fragment.add;
import com.simplifyi.simplifyi_phase2.fragment.earn;
import com.simplifyi.simplifyi_phase2.fragment.profile;
import com.simplifyi.simplifyi_phase2.fragment.simplifyfragment;

public class DashBoardNavigationActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selected=null;
            switch (item.getItemId()) {
                case R.id.simplify:
                    selected=new simplifyfragment();
                    loadFragment(selected);
                    break;
                case R.id.activity:
                    startActivity(new Intent(DashBoardNavigationActivity.this,Activities.class));
                    break;
                case R.id.add:

                    startActivity(new Intent(DashBoardNavigationActivity.this,PrimaryCategory.class));
                    break;
                case R.id.earn:
                    selected=new earn();
                    loadFragment(selected);
                    break;
                case R.id.profile:
                    selected=new profile();
                    loadFragment(selected);
                    break;
            }
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selected).commit();
            return true;
        }

        private void loadFragment(Fragment selected) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container,selected);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboardnavigationactivity);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
