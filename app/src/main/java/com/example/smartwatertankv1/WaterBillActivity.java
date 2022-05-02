package com.example.smartwatertankv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.smartwatertankv1.databinding.ActivityWaterBillBinding;

public class WaterBillActivity extends DrawerBaseActivity {

    ActivityWaterBillBinding activityWaterBillBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityWaterBillBinding = ActivityWaterBillBinding.inflate(getLayoutInflater());
        setContentView(activityWaterBillBinding.getRoot());
        allocateActivityTitle("WaterBill");
    }
}