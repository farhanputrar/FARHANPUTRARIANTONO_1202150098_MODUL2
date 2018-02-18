package com.example.android.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void onClick(View view) {
        if (((RadioButton) findViewById(R.id.radioButton1)).isChecked()) {
            Intent intent = new Intent(MainPage.this, DineIn.class);
            startActivity(intent);
            else if(((RadioButton)findViewById(R.id.radioButton2)).isChecked()){
               Intent intent = new Intent(MainPage.this, TakeAway.class);
                startActivity(intent);


        }
    }
}