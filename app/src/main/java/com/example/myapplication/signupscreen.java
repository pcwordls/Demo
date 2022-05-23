package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signupscreen extends AppCompatActivity {
    private EditText email,pass,name;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupscreen);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        name = findViewById(R.id.name);

    }

    public void register(View view) {
        if(email.getText().toString().equals("")||pass.getText().toString().equals("")||name.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Вы не заполнили все поля",Toast.LENGTH_LONG).show();
        }
        else{
            Intent i = new Intent(signupscreen.this,mainscreen.class);
            startActivity(i);
        }
    }
}