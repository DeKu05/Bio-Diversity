package com.example.bio_diversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dis5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis5);
        Button button = (Button) findViewById(R.id.button5);
        Button bttn = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity1();
            }
        });
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }
    public void openActivity1(){
        Intent intent = new Intent(this, dehradun_flora.class);
        startActivity(intent);
    }public void openActivity2(){
        Intent intent = new Intent(this, dehradun_fauna.class);
        startActivity(intent);
    }
}