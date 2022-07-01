package com.example.bio_diversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dis7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis7);
        Button button = (Button) findViewById(R.id.button17);
        Button bttn = (Button) findViewById(R.id.button18);
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
        Intent intent = new Intent(this, nanital_flora.class);
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intent = new Intent(this, nanital_fauna.class);
        startActivity(intent);
    }
}