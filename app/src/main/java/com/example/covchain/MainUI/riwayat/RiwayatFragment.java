package com.example.covchain.MainUI.riwayat;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.covchain.MainUI.riwayat.RiwayatJalur.RiwayatJalur;
import com.example.covchain.R;


public class RiwayatFragment extends Fragment {

    //riwayat

    public RiwayatFragment() {
        // Required empty public constructor
    }

    Button bt_cansino,bt_sinopharm,bt_sinovac;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View view = inflater.inflate(R.layout.fragment_riwayat, container, false);



        bt_cansino = view.findViewById(R.id.riw_btlck_cansino);
        bt_sinopharm = view.findViewById(R.id.riw_btlck_sinopharm);
        bt_sinovac = view.findViewById(R.id.riw_btlck_sinovac);


        bt_cansino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RiwayatJalur.class);
                intent.putExtra("vaksin", "cansino");
                startActivity(intent);
            }
        });

        bt_sinopharm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RiwayatJalur.class);
                intent.putExtra("vaksin", "sinopharm");
                startActivity(intent);
            }
        });

        bt_sinovac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RiwayatJalur.class);
                intent.putExtra("vaksin", "sinovac");
                startActivity(intent);
            }
        });

        return view;
    }


}
