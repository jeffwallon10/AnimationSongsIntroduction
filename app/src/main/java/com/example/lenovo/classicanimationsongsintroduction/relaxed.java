package com.example.lenovo.classicanimationsongsintroduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class relaxed extends AppCompatActivity {

    String address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relaxed);

        Button nextPageBtn = (Button)findViewById(R.id.button9);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(relaxed.this , song.class);
                address = "https://www.youtube.com/watch?v=EdV56XWZBWM&index=46&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn1 = (Button)findViewById(R.id.button19);
        nextPageBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(relaxed.this , song.class);
                address = "https://www.youtube.com/watch?v=5v_xMh7jJag&index=38&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn2 = (Button)findViewById(R.id.button20);
        nextPageBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(relaxed.this , song.class);
                address = "https://www.youtube.com/watch?v=3NEj8qhUiGY&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=17";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn3 = (Button)findViewById(R.id.button21);
        nextPageBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(relaxed.this , song.class);
                address = "https://www.youtube.com/watch?v=oIj4NYy3J4o&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=24";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn4 = (Button)findViewById(R.id.button22);
        nextPageBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(relaxed.this , song.class);
                address = "https://www.youtube.com/watch?v=nR9ssqv2v0E&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=22";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn5 = (Button)findViewById(R.id.button23);
        nextPageBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(relaxed.this , song.class);
                address = "https://www.youtube.com/watch?v=xrEplGQmB04&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=19";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn6 = (Button)findViewById(R.id.button24);
        nextPageBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(relaxed.this , song.class);
                address = "https://www.youtube.com/watch?v=8Z91VsRZ_MU&index=8&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
