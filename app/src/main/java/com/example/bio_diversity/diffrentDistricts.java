package com.example.bio_diversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diffrentDistricts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diffrent_districts2);
        Button button = (Button) findViewById(R.id.dis3);
        Button bttn = (Button) findViewById(R.id.dis5);
        Button almora = (Button) findViewById(R.id.dis1);
        Button rudra = (Button) findViewById(R.id.dis10);
        Button bag = (Button) findViewById(R.id.dis2);
        Button champ = (Button) findViewById(R.id.dis4);
        Button har = (Button) findViewById(R.id.dis6);
        Button nani = (Button) findViewById(R.id.dis7);
        Button pauri = (Button) findViewById(R.id.dis8);
        Button pitch = (Button) findViewById(R.id.dis9);
        Button tehri = (Button) findViewById(R.id.dis11);
        Button udham = (Button) findViewById(R.id.dis12);
        Button uttarkashi = (Button) findViewById(R.id.dis13);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
        uttarkashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity16();
            }
        });
        udham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity15();
            }
        });
        tehri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity14();
            }
        });
        pitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity13();
            }
        });
        nani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();
            }
        });
        pauri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity12();
            }
        });
        har.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity10();
            }
        });
        champ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity9();
            }
        });

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });

        almora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });
        rudra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });
        bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity8();
            }
        });
    }
    public void openActivity4(){
        Intent intent = new Intent(this, dis3.class);
        startActivity(intent);
    }
    public void openActivity12(){
        Intent intent = new Intent(this, dis8.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent = new Intent(this, dis5.class);
        startActivity(intent);
    }
    public void openActivity6(){
        Intent intent = new Intent(this, dis1.class);
        startActivity(intent);
    }
    public void openActivity7(){
        Intent intent = new Intent(this, dis10.class);
        startActivity(intent);
    }
    public void openActivity8(){
        Intent intent = new Intent(this, dis2.class);
        startActivity(intent);
    }
    public void openActivity9(){
        Intent intent = new Intent(this, dis4.class);
        startActivity(intent);
    }
    public void openActivity10(){
        Intent intent = new Intent(this, dis6.class);
        startActivity(intent);
    }
    public void openActivity11(){
        Intent intent = new Intent(this, dis7.class);
        startActivity(intent);
    }
    public void openActivity13(){
        Intent intent = new Intent(this, dis9.class);
        startActivity(intent);
    }
    public void openActivity14(){
        Intent intent = new Intent(this, dis11.class);
        startActivity(intent);
    }
    public void openActivity15(){
        Intent intent = new Intent(this, dis12.class);
        startActivity(intent);
    }
    public void openActivity16(){
        Intent intent = new Intent(this, dis13.class);
        startActivity(intent);
    }
}