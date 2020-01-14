package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout f = (FrameLayout)findViewById(R.id.mylayout);
        final RabbitView rb = new RabbitView(this);
        rb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                rb.rX = event.getX()-120;
                rb.rY = event.getY()-120;
                rb.invalidate();
                return true;
            }
        });
        f.addView(rb);
    }
}
