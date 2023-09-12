package com.sigmotoa.mimundialg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ibF0 = findViewById(R.id.ib_flag0);
        ImageView imgF0 = findViewById(R.id.img_flag0);

        Glide.with(this)
                .load("https://flagcdn.com/24x18/nz.png")
                .circleCrop()
                .into(imgF0);



    }
}