package com.example.tngp17_001.work3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextTap;
    private ImageButton imgbtnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtnPlay = (ImageButton) findViewById(R.id.imgbtnPlay);
        editTextTap = (EditText) findViewById(R.id.editTextTap);

        imgbtnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("error","sdfejkaghdljk;kol");
                Intent intent = new Intent(MainActivity.this,
                        Trapper.class);
                intent.putExtra("Number", Integer.parseInt( editTextTap.getText().toString() ));
                startActivity(intent);
            }



        });
//        imgbtnPlay.set

    }
}
