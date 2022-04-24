package com.example.smartwatertankv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button signUpButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.SignIn);
        signUpButton = (Button) findViewById(R.id.SignUp);

        signUpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SignUp();
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                logInView();
            }
        });
    }

    public void logInView(){
        Intent intent = new Intent(this,SignIn.class);
        startActivity(intent);
    }

    public void SignUp(){
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);
    }
}