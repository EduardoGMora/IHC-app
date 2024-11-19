package com.claseIHC.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Timer para el Splash
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Al terminar el Splash, ir al ListView
                Intent intent = new Intent(Splash.this, ListViewActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000); // 3000 ms = 3 segundos
    }
}