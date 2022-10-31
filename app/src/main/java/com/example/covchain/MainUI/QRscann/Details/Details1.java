package com.example.covchain.MainUI.QRscann.Details;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.covchain.MainActivity;
import com.example.covchain.MainUI.QRscann.SuccesTransaction.SuccesTransaction;
import com.example.covchain.R;

public class Details1 extends AppCompatActivity {

    Button bt_details,bt_tolak,bt_terima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details1);

        bt_details = findViewById(R.id.det1_bt_details);
        bt_tolak = findViewById(R.id.det1_bt_tolak);
        bt_terima = findViewById(R.id.det1_bt_terima);

        bt_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Details1.this, Details2.class);
                startActivity(intent);
            }
        });

        bt_terima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Details1.this, SuccesTransaction.class);
                startActivity(intent);
            }
        });

        bt_tolak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Details1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
