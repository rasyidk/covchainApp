package com.example.covchain.MainUI.QRscann.SuccesTransaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.covchain.MainActivity;
import com.example.covchain.R;

public class SuccesTransaction extends AppCompatActivity {

    Button bt_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succes_transaction);

        bt_home =  findViewById(R.id.suc_bt_home);
        bt_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuccesTransaction.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
