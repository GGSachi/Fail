package com.example.smartwatertankv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.smartwatertankv1.databinding.ActivityDashboardBinding;

public class DashboardActivity extends DrawerBaseActivity {

    ActivityDashboardBinding activityDashboardBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDashboardBinding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(activityDashboardBinding.getRoot());
        allocateActivityTitle("Dashboard");
    }
}