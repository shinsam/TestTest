package com.example.mymenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Switch switch1;
    RadioButton radio1, radio2, radio3;
    ImageView imageView;
    Button btn_exit, btn_begin;
    LinearLayout layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        radio1 = findViewById(R.id.radio_button1);
        radio2 = findViewById(R.id.radio_button2);
        radio3 = findViewById(R.id.radio_button3);
        imageView = findViewById(R.id.img_view);
        btn_exit = findViewById(R.id.btn_exit);
        btn_begin = findViewById(R.id.btn_begin);
        layout1 = findViewById(R.id.layout_1);

        radio1.setOnClickListener(this);
        radio2.setOnClickListener(this);
        radio3.setOnClickListener(this);
        switch1.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
        btn_begin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.radio_button1:
                imageView.setImageResource(R.drawable.an8);
                break;
            case R.id.radio_button2:
                imageView.setImageResource(R.drawable.an9);
                break;
            case R.id.radio_button3:
                imageView.setImageResource(R.drawable.an10);
                break;
            case R.id.switch1:
                if( switch1.isChecked() ) layout1.setVisibility(View.VISIBLE);
                else layout1.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn_begin:
                radio1.setChecked(true);
                imageView.setImageResource(R.drawable.an8);
                break;
            case R.id.btn_exit:
                finish();
                break;
        }
    }
}