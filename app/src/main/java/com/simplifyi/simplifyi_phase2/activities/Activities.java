package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.simplifyi.simplifyi_phase2.R;
import com.simplifyi.simplifyi_phase2.fragment.Tab1Fragment;
import com.simplifyi.simplifyi_phase2.fragment.Tab2Fragment;
import com.simplifyi.simplifyi_phase2.fragment.Tab3Fragment;
import com.simplifyi.simplifyi_phase2.fragment.Tab4Fragment;

import java.util.ArrayList;
import java.util.List;


public class Activities extends AppCompatActivity {
    private Button btnContinue;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("Received Calls");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.received, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Dialled Calls");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.dialled, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("Follows");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.follow1, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);

        TextView tabFour = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabFour.setText("Reply");
        tabFour.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.reply1, 0, 0);
        tabLayout.getTabAt(3).setCustomView(tabFour);
    }



    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new Tab1Fragment(), "Received Calls");
        adapter.addFrag(new Tab2Fragment(), "Dialled Calls");
        adapter.addFrag(new Tab4Fragment(), "Follows");
        adapter.addFrag(new Tab4Fragment(), "Reply");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
    public void back(View v)
    {
        Intent in=new Intent(Activities.this,DashBoardNavigationActivity.class);
        startActivity(in);
    }

}