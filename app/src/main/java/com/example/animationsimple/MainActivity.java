package com.example.animationsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button translateBtn, alphaBtn, scaleBtn, rotateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id define
        textView = findViewById(R.id.textAnim);
        translateBtn = findViewById(R.id.translateBtn);
        alphaBtn = findViewById(R.id.alphaBtn);
        scaleBtn = findViewById(R.id.scaleBtn);
        rotateBtn = findViewById(R.id.rotateBtn);



        // move animation
        translateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //animation set
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);

                textView.startAnimation(move);

            }
        });


        // alpha animation
        alphaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                textView.startAnimation(alpha);
            }
        });


        // scale animation
        scaleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                textView.startAnimation(scale);
            }
        });


        // rotate animation
        rotateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);
                textView.startAnimation(rotate);
            }
        });

    }
}