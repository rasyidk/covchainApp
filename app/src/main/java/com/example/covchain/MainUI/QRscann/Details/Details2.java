package com.example.covchain.MainUI.QRscann.Details;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.covchain.MainActivity;
import com.example.covchain.MainUI.QRscann.SuccesTransaction.SuccesTransaction;
import com.example.covchain.R;

public class Details2 extends AppCompatActivity {

    Button bt_close,bt_tolak,bt_terima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        bt_close = findViewById(R.id.det2_bt_close);
        bt_tolak = findViewById(R.id.det2_bt_tolak);
        bt_terima = findViewById(R.id.det2_bt_terima);


        bt_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Details2.this, Details1.class);
                startActivity(intent);
            }
        });

        bt_terima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Details2.this, SuccesTransaction.class);
                startActivity(intent);
            }
        });

        bt_tolak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Details2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
