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

        gotoHome();
    }

    // Timer para el Splash que redirecciona a Home
    private void gotoHome() {
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Splash.this, Home.class);
            startActivity(intent);
            finish();
        },3000);
    }

}