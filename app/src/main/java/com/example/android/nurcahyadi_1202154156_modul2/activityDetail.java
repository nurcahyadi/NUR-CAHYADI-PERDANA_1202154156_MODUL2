package com.example.android.nurcahyadi_1202154156_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activityDetail extends AppCompatActivity {
    ImageView mGambardariRV;
    TextView mNama,mHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mGambardariRV = findViewById(R.id.gambar1);
        mNama = findViewById(R.id.textnama);
        mHarga = findViewById(R.id.textharga);

        Intent b = this.getIntent();
        String d = b.getStringExtra("judul");
        String e = b.getStringExtra("deskripsi");
        int c = b.getExtras().getInt("gambar");

        mNama.setText(d);
        mHarga.setText(e);
        mGambardariRV.setImageResource(c);

    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
    }

