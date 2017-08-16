package com.example.tngp17_001.work3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.CollationElementIterator;

import static com.example.tngp17_001.work3.R.id.editTextTap;

public class Trapper extends AppCompatActivity {

    private TextView tvNumber;
    private ImageButton imgbtnStart;
    private int number;
    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapper);

        n =  getIntent().getIntExtra("Number",0);
        tvNumber = (TextView)findViewById(R.id.tvNumber);

        imgbtnStart = (ImageButton) findViewById(R.id.imgbtnStart);
        imgbtnStart.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                number++;
                tvNumber.setText(String.valueOf(number));
                if (number == n) {
                    Intent in = new Intent(Trapper.this, MainActivity.class);
                    startActivity(in);
                    finish();
                }
            }
        });



    }
}
