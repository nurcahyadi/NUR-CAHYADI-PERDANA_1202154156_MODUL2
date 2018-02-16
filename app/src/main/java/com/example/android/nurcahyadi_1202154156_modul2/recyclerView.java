package com.example.android.nurcahyadi_1202154156_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerView extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> mJudul;
    private ArrayList<Integer> mGambar;
    private ArrayList<String> mDesc;


    //Daftar Judul
    private String[] Judul = {"Bebek Betutu", "Bika Ambon", "Ikan Asam Pedas", "Nasi Liwet", "Nasi Padang", "Pempek", "Pepes",
            "Rawon","Rendang","Soto Banjar","Tumpeng"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.bebekbetutu, R.drawable.bikaambon, R.drawable.ikanasampedas,
            R.drawable.nasiliwet, R.drawable.nasipadang, R.drawable.pempekpempek, R.drawable.pepes,
            R.drawable.rawon,R.drawable.rendang,R.drawable.sotobanjar,R.drawable.tumpeng};
    //Daftar Deskripsi
    private String[] Desc = {"Harga: Rp 15.000", "Harga: Rp 16.000", "Harga: Rp 17.000", "Harga: Rp 18.000", "Harga: Rp 19.000",
            "Harga: Rp 15.000", "Harga: Rp 15.000", "Harga: Rp 20.000","Harga: Rp 21.000","Soto Harga: Rp 22.000",
            "Harga: Rp 23.000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mJudul = new ArrayList<>();
        mGambar = new ArrayList<>();
        mDesc = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new RecyclerViewAdapter(mJudul, mGambar,mDesc);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    //Mengambil data dari Varibale Gambar dan Judul serta deskripsi, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int a=0; a<Judul.length; a++){
            mGambar.add(Gambar[a]);
            mJudul.add(Judul[a]);
            mDesc.add(Desc[a]);

        }
    }
}
