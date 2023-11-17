package com.assignment.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.assignment.ui.databinding.ActivityTask2Binding;

public class TaskActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityTask2Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_task2);


    }
}