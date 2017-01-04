package com.example.lenovo.classicanimationsongsintroduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class instrumental extends AppCompatActivity {

    String address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrumental);

        Button nextPageBtn = (Button)findViewById(R.id.button48);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(instrumental.this , song.class);
                address = "https://www.youtube.com/watch?v=3ixykwxBArI&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=28";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn1 = (Button)findViewById(R.id.button49);
        nextPageBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(instrumental.this , song.class);
                address = "https://www.youtube.com/watch?v=hgc3E_2xXl8&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=29";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn2 = (Button)findViewById(R.id.button50);
        nextPageBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(instrumental.this , song.class);
                address = "https://www.youtube.com/watch?v=cNO3IgsbQHs&index=27&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn3 = (Button)findViewById(R.id.button51);
        nextPageBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(instrumental.this , song.class);
                address = "https://www.youtube.com/watch?v=k0Ria09AeL4&index=20&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn4 = (Button)findViewById(R.id.button52);
        nextPageBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(instrumental.this , song.class);
                address = "https://www.youtube.com/watch?v=H0GKtTa7G0M&index=21&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn5 = (Button)findViewById(R.id.button53);
        nextPageBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(instrumental.this , song.class);
                address = "https://www.youtube.com/watch?v=LTorCvPzsGw&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=16";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn6 = (Button)findViewById(R.id.button54);
        nextPageBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(instrumental.this , song.class);
                address = "https://www.youtube.com/watch?v=IHxkPSc5kMc&index=18&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn7 = (Button)findViewById(R.id.button55);
        nextPageBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(instrumental.this , song.class);
                address = "https://www.youtube.com/watch?v=V_UVzQNUkSk&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=14";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn8 = (Button)findViewById(R.id.button56);
        nextPageBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(instrumental.this , song.class);
                address = "https://www.youtube.com/watch?v=ZWpjsknc9mc&index=12&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        Button nextPageBtn9 = (Button)findViewById(R.id.button57);
        nextPageBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(instrumental.this , song.class);
                address = "https://www.youtube.com/watch?v=TCb57gXVjJs&list=PLMpqbZB2Iko6I7mbw819LgZHw7f60dVio&index=13";
                Bundle bundle = new Bundle();
                bundle.putString("address", address);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
