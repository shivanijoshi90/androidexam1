package com.shivani.androidexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtstart= findViewById(R.id.txtstart);

        txtstart.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,activity2.class);

            startActivity(intent);
        });
    }
}