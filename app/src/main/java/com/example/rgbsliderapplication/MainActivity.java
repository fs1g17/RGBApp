package com.example.rgbsliderapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {
    private Slider red;
    private Slider green;
    private Slider blue;
    private ConstraintLayout constraintLayout;

    private int RED;
    private int GREEN;
    private int BLUE;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_box);
        textView.setText("");
        textView.setAlpha(0.5f);

        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);

        constraintLayout = findViewById(R.id.background);

        int max = 255;
        RED = (int) (Math.random() * max);
        GREEN = (int) (Math.random() * max);
        BLUE = (int) (Math.random() * max);

        red.setValue(RED);
        green.setValue(GREEN);
        blue.setValue(BLUE);

        update();

        red.addOnChangeListener((slider, value, fromUser) -> {
            RED = (int) value;
            update();
        });
        green.addOnChangeListener((slider, value, fromUser) -> {
            GREEN = (int) value;
            update();
        });
        blue.addOnChangeListener((slider, value, fromUser) -> {
            BLUE = (int) value;
            update();
        });
    }

    private void update(){
        int color = Color.rgb(RED,GREEN,BLUE);
        constraintLayout.setBackgroundColor(color);
        String hex = "#"+Integer.toHexString(color).substring(2);
        hex = hex.toUpperCase();
        textView.setText("HEX:" + hex);
    }
}