package com.example.sergey.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class Main2Activity extends AppCompatActivity {

    public static final String TAG = Main2Activity.class.getSimpleName();

    TextView live;
    int patron = 6;
    Button shot;
    Gun show = new Gun();
    ImageView gun;


    /*public void stars(){
         Intent intent = new Intent(this, MainActivity.class);
         startActivity(intent);
     }*/
    public void textor(String ret) {
        live.setText(ret);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button notshot = findViewById(R.id.notshot);
        live = findViewById(R.id.live);
        shot = findViewById(R.id.shot);
        gun = findViewById(R.id.gun);
        shot.setOnClickListener(shoot);


    }

    public View.OnClickListener shoot = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if ( show.shoot()) {
                Log.d(TAG, "onClick: i = 0");
                live.setText("Zalupa");
                GlideDrawableImageViewTarget target = new GlideDrawableImageViewTarget(gun);
                Glide.with(Main2Activity.this).load(show.gun()).into(target);
                shot.setOnClickListener(null);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        finish();
                    }
                }, 3000);
                --patron;
            } else {

                textor(show.fuck());
                shot.setText("Again?");
            }
        }
    };
}
