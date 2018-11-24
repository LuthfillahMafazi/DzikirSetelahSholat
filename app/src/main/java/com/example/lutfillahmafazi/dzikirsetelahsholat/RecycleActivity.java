package com.example.lutfillahmafazi.dzikirsetelahsholat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import com.example.lutfillahmafazi.dzikirsetelahsholat.Adapter.AdapterJikir;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.myRecycleView)
    RecyclerView myRecycleView;

    String [] Dzikir;

    AdapterJikir adapterJikir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        Dzikir = getResources().getStringArray(R.array.Dzikir_Setelah_Sholat);

        adapterJikir = new AdapterJikir(this, Dzikir);

        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(this));
        myRecycleView.setAdapter(adapterJikir);
    }
}
