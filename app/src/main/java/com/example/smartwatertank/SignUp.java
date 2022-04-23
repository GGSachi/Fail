package com.example.smartwatertank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText editTextTextPersonName;
    EditText editTextPassword;
    EditText editTextMobileNO;
    EditText editTextEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextMobileNO = (EditText) findViewById(R.id.editTextMobileNO);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
    }
    public void signupButtonClicked(View v){
        String txtUserName = editTextTextPersonName.getText().toString().trim();
        String txtPassword = editTextPassword.getText().toString().trim();
        String txtPhoneNo = editTextMobileNO.getText().toString().trim();
        String txtEmail = editTextEmail.getText().toString().trim();


    }

}