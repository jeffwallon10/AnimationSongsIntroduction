package com.example.lenovo.classicanimationsongsintroduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class inspirational extends AppCompatActivity {

    String address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspirational);

        Button nextPageBtn = (Button)findViewById(R.id.button25);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(inspirational.this , song.class);
                address = "https://www.youtube.com/watch?v=8udtTDoCJ_o&index=45&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn1 = (Button)findViewById(R.id.button26);
        nextPageBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(inspirational.this , song.class);
                address = "https://www.youtube.com/watch?v=NQl5OFli1Ms&index=47&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn2 = (Button)findViewById(R.id.button27);
        nextPageBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(inspirational.this , song.class);
                address = "https://www.youtube.com/watch?v=FpM714-Rq14&index=35&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn3 = (Button)findViewById(R.id.button28);
        nextPageBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(inspirational.this , song.class);
                address = "https://www.youtube.com/watch?v=uoC_ppjdNmY&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=25";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn4 = (Button)findViewById(R.id.button29);
        nextPageBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(inspirational.this , song.class);
                address = "https://www.youtube.com/watch?v=krfqSkBXGRQ&index=11&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn5 = (Button)findViewById(R.id.button30);
        nextPageBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(inspirational.this , song.class);
                address = "https://www.youtube.com/watch?v=IcImTnSs5Es&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=7";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn6 = (Button)findViewById(R.id.button31);
        nextPageBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(inspirational.this , song.class);
                address = "https://www.youtube.com/watch?v=7JV_zNFJnCk&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=10";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn7 = (Button)findViewById(R.id.button32);
        nextPageBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(inspirational.this , song.class);
                address = "https://www.youtube.com/watch?v=m5ogHd3MgCI&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=9";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn8 = (Button)findViewById(R.id.button33);
        nextPageBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(inspirational.this , song.class);
                address = "https://www.youtube.com/watch?v=ZJF7lgKwGas&index=1&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
