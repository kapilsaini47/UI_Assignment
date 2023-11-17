package com.assignment.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.assignment.ui.databinding.ActivityTask1Binding;

public class TaskActivity1 extends AppCompatActivity {

    private ActivityTask1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_task1);

        binding.tvTask.setOnClickListener(view -> {
            Intent intent = new Intent(this, TaskActivity2.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        binding.unbind();
    }
}