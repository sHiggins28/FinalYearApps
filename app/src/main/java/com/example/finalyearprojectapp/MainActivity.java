package com.example.finalyearprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void StreamOne(View view){

        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "RTSP Stream", Toast.LENGTH_LONG).show();

    }

    public void StreamTwo(View view){

        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "HTML Stream", Toast.LENGTH_LONG).show();

    }

    public void logout(View view) {

        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
}

