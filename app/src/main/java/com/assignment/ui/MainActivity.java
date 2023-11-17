package com.assignment.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.assignment.ui.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.btnGo.setOnClickListener(view -> {
            Intent intent = new Intent(this, TaskActivity1.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        binding.unbind();
    }
}