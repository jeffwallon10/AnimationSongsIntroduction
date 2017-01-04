package com.example.lenovo.classicanimationsongsintroduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class sorrowful extends AppCompatActivity {

    String address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorrowful);

        Button nextPageBtn = (Button)findViewById(R.id.button34);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(sorrowful.this , song.class);
                address = "https://www.youtube.com/watch?v=shvnYjg567c&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=44";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn1 = (Button)findViewById(R.id.button35);
        nextPageBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(sorrowful.this , song.class);
                address = "https://www.youtube.com/watch?v=LvD70QnYYvw&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=43";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn2 = (Button)findViewById(R.id.button36);
        nextPageBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(sorrowful.this , song.class);
                address = "https://www.youtube.com/watch?v=wcNRkRy59M4&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=23";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn3 = (Button)findViewById(R.id.button37);
        nextPageBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(sorrowful.this , song.class);
                address = "https://www.youtube.com/watch?v=tPqRwPEFN5k&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=15";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn4 = (Button)findViewById(R.id.button38);
        nextPageBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(sorrowful.this , song.class);
                address = "https://www.youtube.com/watch?v=wRL8A-kgH5Y&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=5";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn5 = (Button)findViewById(R.id.button39);
        nextPageBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(sorrowful.this , song.class);
                address = "https://www.youtube.com/watch?v=TRFVMI2p4fI&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=6";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn6 = (Button)findViewById(R.id.button40);
        nextPageBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(sorrowful.this , song.class);
                address = "https://www.youtube.com/watch?v=JfKVUGELXlw&index=3&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
