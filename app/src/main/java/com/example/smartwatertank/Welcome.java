 package com.example.smartwatertank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.net.HttpCookie;

 public class Welcome extends AppCompatActivity {


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_welcome);
     }


     public void onButtonSignUpClicked(View view) {
         Intent intent = new Intent(Welcome.this, SignUp.class);
         startActivity(intent);

     }

     public void onButtonSignInClicked(View view) {

     }


     Thread thread = new Thread() {
         public void run() {
             try {
                 Thread.sleep(4000);

             } catch (Exception e) {
                 e.printStackTrace();
             } finally {
                 Intent intent = new Intent(Welcome.this, SignUp.class);
                 startActivity(intent);

             }


         }
     };

  thread.start();
 }
 }
