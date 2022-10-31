package com.example.covchain.SignIn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.covchain.MainActivity;
import com.example.covchain.R;

public class SignIn extends AppCompatActivity {


    private Button sgn_btLogin;
    private EditText sgn_edtEmail;
    private EditText sgn_edtPassword;
    private TextView signin_tv_guest;
    String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        sgn_btLogin =  findViewById(R.id.sgn_btnLogin);
        sgn_edtEmail =  findViewById(R.id.sgn_edtEmail);
        sgn_edtPassword = findViewById(R.id.sgn_password);
        signin_tv_guest = findViewById(R.id.signin_tv_guest);

        signin_tv_guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, MainActivity.class);
                startActivity(intent);
            }
        });
        sgn_btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = sgn_edtEmail.getText().toString();
                password = sgn_edtPassword.getText().toString();
                login(email,password);
            }
        });

    }

    private void login(String email, String password) {
        Log.d("email", email);
        Log.d("password", password);

//        Toast.makeText(getApplicationContext(),password + email, Toast.LENGTH_SHORT).show();
//        if (email == "" || password ==""){
//            Toast.makeText(getApplicationContext(),"Mohon Isi semuannya", Toast.LENGTH_SHORT).show();
//        }else if(email == "admin" || password =="123"){
//
//            Intent i = new Intent(SignIn.this, MainActivity.class);
//            startActivity(i);
//        }else {
//            Toast.makeText(getApplicationContext(),"User tidak terdaftar", Toast.LENGTH_SHORT).show();
//        }

        if (email.equals("") || password.equals("")){
            Toast.makeText(getApplicationContext(),"Mohon Isi semuannya", Toast.LENGTH_SHORT).show();
        }else if (email.equals("admin") && password.equals("123")){
            Intent i = new Intent(SignIn.this, MainActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(),"User tidak ditemukan", Toast.LENGTH_SHORT).show();
        }
    }
}
