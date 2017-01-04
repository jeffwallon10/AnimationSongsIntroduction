package com.example.lenovo.classicanimationsongsintroduction;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class hot_spirited extends AppCompatActivity {

    String address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_spirited);

        Button nextPageBtn = (Button)findViewById(R.id.button10);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(hot_spirited.this , song.class);
                address = "https://www.youtube.com/watch?v=i_FIwDJhqcQ&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=49";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn1 = (Button)findViewById(R.id.button11);
        nextPageBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(hot_spirited.this , song.class);
                address = "https://www.youtube.com/watch?v=uOIsUpcJu2g&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=42";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn2 = (Button)findViewById(R.id.button12);
        nextPageBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(hot_spirited.this , song.class);
                address = "https://www.youtube.com/watch?v=A5zsryHQX-w&index=48&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn3 = (Button)findViewById(R.id.button13);
        nextPageBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(hot_spirited.this , song.class);
                address = "https://www.youtube.com/watch?v=b1Iqh4OgJrQ&index=37&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn4 = (Button)findViewById(R.id.button14);
        nextPageBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(hot_spirited.this , song.class);
                address = "https://www.youtube.com/watch?v=eoAWqCq6K2U&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=30";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn5 = (Button)findViewById(R.id.button15);
        nextPageBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(hot_spirited.this , song.class);
                address = "https://www.youtube.com/watch?v=mW4bIeldCzI&index=31&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn6 = (Button)findViewById(R.id.button16);
        nextPageBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(hot_spirited.this , song.class);
                address = "https://www.youtube.com/watch?v=wQRlcLCzFN8&index=32&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn7 = (Button)findViewById(R.id.button17);
        nextPageBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(hot_spirited.this , song.class);
                address = "https://www.youtube.com/watch?v=PE5UnOIq8AA&index=26&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn8 = (Button)findViewById(R.id.button18);
        nextPageBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(hot_spirited.this , song.class);
                address = "https://www.youtube.com/watch?v=38136UrQOhI&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=4";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
