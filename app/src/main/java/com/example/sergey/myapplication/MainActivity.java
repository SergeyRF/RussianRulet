package com.example.sergey.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Intent intent1 = new Intent(this, Main2Activity.class);
        Button insert = findViewById(R.id.insert);
        View.OnClickListener insertListener = new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                startActivity(intent1);
            }
        };
        insert.setOnClickListener(insertListener);

        imageView = findViewById(R.id.smile);

        GlideDrawableImageViewTarget target = new GlideDrawableImageViewTarget(imageView);
        Glide.with(this).load(R.drawable.gun).into(target);
    }
}
