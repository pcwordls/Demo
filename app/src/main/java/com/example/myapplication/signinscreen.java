package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signinscreen extends AppCompatActivity {
    private EditText email,pass;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signinscreen);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
    }

    public void login(View view) {
        if(email.getText().toString().equals("") || pass.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Вы не ввели логин или пароль",Toast.LENGTH_LONG).show();
        }
        else{
            Intent i = new Intent(signinscreen.this,mainscreen.class);
            startActivity(i);
        }
    }

    public void reg(View view) {
    Intent i = new Intent(signinscreen.this,signupscreen.class);
    startActivity(i);
    }
}