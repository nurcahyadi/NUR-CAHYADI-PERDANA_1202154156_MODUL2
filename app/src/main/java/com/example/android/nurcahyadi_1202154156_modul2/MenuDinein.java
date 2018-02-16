package com.example.android.nurcahyadi_1202154156_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MenuDinein extends AppCompatActivity {

    Button mPilihpesanan;
    EditText mNamapelanggan;
    Spinner mbtnSpinnerdinein;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dinein);


        mPilihpesanan = findViewById(R.id.btnpilihdinein);
        mNamapelanggan = findViewById(R.id.namapelanggan);
        mbtnSpinnerdinein = findViewById(R.id.spdinein);

        Intent a = getIntent();
        String b = a.getStringExtra("dinein");

        Toast.makeText(this,b,Toast.LENGTH_LONG).show();


        mPilihpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String SPdine = mbtnSpinnerdinein.getSelectedItem().toString();

                if (SPdine.equalsIgnoreCase("Meja 1")){
                    Toast.makeText(MenuDinein.this, "Meja 1 telah terpilih",Toast.LENGTH_LONG).show();
                    Intent a = new Intent(MenuDinein.this,recyclerView.class);
                    startActivity(a);
                } else if (SPdine.equalsIgnoreCase("Meja 2")){
                    Toast.makeText(MenuDinein.this, "Meja 2 telah terpilih",Toast.LENGTH_LONG).show();
                    Intent a = new Intent(MenuDinein.this,recyclerView.class);
                    startActivity(a);
                } else if (SPdine.equalsIgnoreCase("Meja 3")){
                    Toast.makeText(MenuDinein.this, "Meja 3 telah terpilih",Toast.LENGTH_LONG).show();
                    Intent a = new Intent(MenuDinein.this,recyclerView.class);
                    startActivity(a);
                } else if (SPdine.equalsIgnoreCase("Meja 4")){
                    Toast.makeText(MenuDinein.this, "Meja 4 telah terpilih",Toast.LENGTH_LONG).show();
                    Intent a = new Intent(MenuDinein.this,recyclerView.class);
                    startActivity(a);
                } else if (SPdine.equalsIgnoreCase("Meja 5")){
                    Toast.makeText(MenuDinein.this, "Meja 5 telah terpilih",Toast.LENGTH_LONG).show();
                    Intent a = new Intent(MenuDinein.this,recyclerView.class);
                    startActivity(a);
                }


            }
        });

    }
}
