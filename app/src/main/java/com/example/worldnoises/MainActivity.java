package com.example.worldnoises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int num = 0;
    Button enter_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter_button = findViewById(R.id.enter_button);

        enter_button.setOnClickListener(new View.OnClickListener(){ 
            final Intent i = new Intent(getApplicationContext(), explorer.class);

            @Override
            public void onClick(View view) {
               startActivity(i);

            }
        });

    }




}