package com.example.android.researchhero.LearnToResearch;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.researchhero.R;
import com.example.android.researchhero.adapter.ExperimentFragmentPagerAdapter;
import com.example.android.researchhero.adapter.ResearchPurposeFragmentPagerAdapter;

public class LearnExperimentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_experiment);


        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        ExperimentFragmentPagerAdapter adapter = new ExperimentFragmentPagerAdapter(
                getSupportFragmentManager(),
                LearnExperimentActivity.this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
