package com.example.bio_diversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class map extends AppCompatActivity {

    private ScaleGestureDetector scaleGestureDetector;
    private float FACTOR = 1.0f;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        imageView = (ImageView) findViewById(R.id.map);
        scaleGestureDetector = new ScaleGestureDetector(this,new ScaleListner());

        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        scaleGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class ScaleListner extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public boolean onScale(ScaleGestureDetector detector){
            FACTOR *= detector.getScaleFactor();
            FACTOR = Math.max(0.1f,Math.min(FACTOR,10.f));
            imageView.setScaleX(FACTOR);
            imageView.setScaleY(FACTOR);
            return true;
        }
    }
    public void openActivity3(){
        Intent intent = new Intent(this, diffrentDistricts.class);
        startActivity(intent);
    }
}