package com.example.android.nurcahyadi_1202154156_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    Button mPesan;
    RadioGroup rdGroup;
    RadioButton rdDineIn,rdTakeaAway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        rdDineIn = findViewById(R.id.rddinein);
        rdGroup = findViewById(R.id.rdgroup);
        rdTakeaAway = findViewById(R.id.rdtakeaway);
        mPesan = findViewById(R.id.btnpesan);

        mPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rdgrup = rdGroup.getCheckedRadioButtonId();
                String rdDinein = rdDineIn.getText().toString();
                String rdTakeaway = rdTakeaAway.getText().toString();

                if (rdgrup==rdDineIn.getId()){
                    Intent dinein = new Intent(MenuUtama.this,MenuDinein.class);
                    dinein.putExtra("dinein",rdDinein);
                    startActivity(dinein);

                } else {
                    Intent takeaway = new Intent(MenuUtama.this,MenuTakeAway.class);
                    takeaway.putExtra("takeaway",rdTakeaway);
                    startActivity(takeaway);
                }
            }
        });
    }
}
