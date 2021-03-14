package com.example.worldnoises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SharedPreferences myprefs;
    String mySharedPrefFileName = "Login_Info";
    Button Log_in;
    Button RegisterButton;
    Button Forgot_password_button;
    EditText  enter_info;
    EditText error_message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log_in = findViewById(R.id.enter_button);

        Log_in.setOnClickListener(new View.OnClickListener() {
            final Intent i = new Intent(getApplicationContext(), explorer.class);

            @Override
            public void onClick(View view) {
                myprefs = getSharedPreferences(mySharedPrefFileName, Context.MODE_PRIVATE);


                if(myprefs.getInt("IS_LOGGED_IN",0) ==0) {
                    Log_in.setText("PLEASE LOG IN");
                } else {
                    Log_in.setText("YOU ARE LOGGED IN");
                }
            }


        });



    }



    protected void create_new_user(String username, SharedPreferences.Editor editor) {
        editor.putString("USERNAME", username);
        editor.commit();
    }
    protected void is_user_logged_in(){

    }
}