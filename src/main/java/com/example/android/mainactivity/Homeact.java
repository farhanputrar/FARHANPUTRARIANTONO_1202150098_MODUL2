package com.example.android.mainactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by user on 18/02/2018.
 */

public class Homeact extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeact);
        Toast.makeText(getApplicationContext(), "FARHAN PUTRA RIANTONO_1202150098", Toast.LENGTH_LONG).show();
    }
}
