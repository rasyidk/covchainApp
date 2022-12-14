package com.example.covchain.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.covchain.MainActivity;
import com.example.covchain.R;
import com.example.covchain.SignIn.SignIn;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Timer t =new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i =  new Intent(SplashScreen.this, SignIn.class);
                startActivity(i);
            }
        },2000);

    }
}
