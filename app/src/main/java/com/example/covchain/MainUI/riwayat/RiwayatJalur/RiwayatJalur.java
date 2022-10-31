package com.example.covchain.MainUI.riwayat.RiwayatJalur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.covchain.R;

public class RiwayatJalur extends AppCompatActivity {


    TextView tv_vaksin;
    RelativeLayout rel_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_jalur);

        tv_vaksin =  findViewById(R.id.riwjal_tv_vaksin);
        rel_text = findViewById(R.id.riwjal_rel);

        String vaksin = getIntent().getStringExtra("vaksin");

        if (vaksin.equals("sinopharm")){
            tv_vaksin.setText("sinopharm");
//            rel_text.setBackgroundColor(R.drawable.rounded_beritaterkini);
        }else if (vaksin.equals("cansino")){
            tv_vaksin.setText("cansino");
//            rel_text.setBackgroundColor(ContextCompat.getColor(this, R.color.bluesky));
        }else if (vaksin.equals("sinovac")){
            tv_vaksin.setText("sinovac");
//            rel_text.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
        }
    }
}
