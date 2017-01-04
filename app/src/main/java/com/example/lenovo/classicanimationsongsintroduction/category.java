package com.example.lenovo.classicanimationsongsintroduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button nextPageBtn = (Button)findViewById(R.id.button3);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(category.this , hot_spirited.class);
                startActivity(intent);
            }
        });

        Button nextPageBtn1 = (Button)findViewById(R.id.button4);
        nextPageBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(category.this , relaxed.class);
                startActivity(intent);
            }
        });

        Button nextPageBtn2 = (Button)findViewById(R.id.button5);
        nextPageBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(category.this , inspirational.class);
                startActivity(intent);
            }
        });

        Button nextPageBtn3 = (Button)findViewById(R.id.button6);
        nextPageBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(category.this , sorrowful.class);
                startActivity(intent);
            }
        });

        Button nextPageBtn4 = (Button)findViewById(R.id.button7);
        nextPageBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(category.this , warm.class);
                startActivity(intent);
            }
        });

        Button nextPageBtn5 = (Button)findViewById(R.id.button8);
        nextPageBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(category.this , instrumental.class);
                startActivity(intent);
            }
        });
    }
}
