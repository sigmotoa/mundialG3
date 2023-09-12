package com.sigmotoa.mimundialg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ibF0 = findViewById(R.id.ib_flag0);
        ImageView ibF1 = findViewById(R.id.ib_flag1);
        ImageView ibF2 = findViewById(R.id.ib_flag2);
        ImageView ibF3 = findViewById(R.id.ib_flag3);
        ImageView ibF4 = findViewById(R.id.ib_flag4);
        ImageView ibF5 = findViewById(R.id.ib_flag5);
        ImageView ibF6 = findViewById(R.id.ib_flag6);
        ImageView ibF7 = findViewById(R.id.ib_flag7);
        ImageView ibF8 = findViewById(R.id.ib_flag8);
        ImageView ibF9 = findViewById(R.id.ib_flag9);



        ImageView imgF0 = findViewById(R.id.img_flag0);
        ImageView imgF1 = findViewById(R.id.img_flag1);


       //Usamos Glide para las cards
        Glide.with(this)
                .load("https://flagcdn.com/w640/nz.png")
                .centerInside()
                .circleCrop()
                .into(imgF0);
        Glide.with(this)
                .load("https://flagcdn.com/w640/no.png")
                .centerInside()
                .circleCrop()
                .into(imgF1);

        //Usamos picasso para el horizontal Scroll
        Picasso.get()
                .load("https://flagcdn.com/w640/nz.png")
                .placeholder(R.drawable.co)
                .error(R.drawable.aw)
                .resize(96,96)
                .centerCrop()
                .into(ibF0);
Picasso.get()
                .load("https://flagcdn.com/w640/no.png")
                .placeholder(R.drawable.co)
                .error(R.drawable.aw)
                .resize(96,96)
                .centerCrop()
                .into(ibF1);
Picasso.get()
                .load("https://flagcdn.com/w640/ph.png")
                .placeholder(R.drawable.co)
                .error(R.drawable.aw)
                .resize(96,96)
                .centerCrop()
                .into(ibF2);
Picasso.get()
                .load("https://flagcdn.com/w640/ch.png")
                .placeholder(R.drawable.co)
                .error(R.drawable.aw)
                .resize(96,96)
                .centerCrop()
                .into(ibF3);
Picasso.get()
                .load("https://flagcdn.com/w640/au.png")
                .placeholder(R.drawable.co)
                .error(R.drawable.aw)
                .resize(96,96)
                .centerCrop()
                .into(ibF4);
Picasso.get()
                .load("https://flagcdn.com/w640/ie.png")
                .placeholder(R.drawable.co)
                .error(R.drawable.aw)
                .resize(96,96)
                .centerCrop()
                .into(ibF5);
Picasso.get()
                .load("https://flagcdn.com/w640/nz.png")
                .placeholder(R.drawable.co)
                .error(R.drawable.aw)
                .resize(96,96)
                .centerCrop()
                .into(ibF6);
Picasso.get()
                .load("https://flagcdn.com/w640/nz.png")
                .placeholder(R.drawable.co)
                .error(R.drawable.aw)
                .resize(96,96)
                .centerCrop()
                .into(ibF7);
Picasso.get()
                .load("https://flagcdn.com/w640/nz.png")
                .placeholder(R.drawable.co)
                .error(R.drawable.aw)
                .resize(96,96)
                .centerCrop()
                .into(ibF8);
Picasso.get()
                .load("https://flagcdn.com/w640/nz.png")
                .placeholder(R.drawable.co)
                .error(R.drawable.aw)
                .resize(96,96)
                .centerCrop()
                .into(ibF9);




    }
}