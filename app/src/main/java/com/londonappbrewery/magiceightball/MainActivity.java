package com.londonappbrewery.magiceightball;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askButton = findViewById(R.id.askbutton);
        final ImageView ball = findViewById(R.id.ball);
        final Random randomNumberGenerator = new Random();
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Number = randomNumberGenerator.nextInt(5);
                ball.setImageResource(ballArray[Number]);

            }
        });
    }
}
