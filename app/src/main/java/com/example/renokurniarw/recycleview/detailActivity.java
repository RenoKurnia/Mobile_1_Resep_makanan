package com.example.renokurniarw.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent init = getIntent();

        getSupportActionBar().setTitle("judul");
        ImageView img = (ImageView)findViewById(R.id.gambar);
        TextView pembuatan = (TextView)findViewById(R.id.resep);
        TextView Judul = (TextView)findViewById(R.id.Judul);

        pembuatan.setText(init.getStringExtra("Pembuatan"));
        Judul.setText(init.getStringExtra("Judul"));
        img.setImageResource(init.getIntExtra("Gambar",0));

        
    }
}
