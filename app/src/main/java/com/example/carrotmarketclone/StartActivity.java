package com.example.carrotmarketclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView startGif = (ImageView)findViewById(R.id.startGif);
        Glide.with(this).load(R.raw.kakao).into(startGif);

        Button replace_startPage = (Button)findViewById(R.id.replace_startPage);
        replace_startPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PlaceSelectActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
