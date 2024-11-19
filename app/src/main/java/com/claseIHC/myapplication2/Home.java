package com.claseIHC.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    private VideoView video;
    private Button botonlista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        video = findViewById(R.id.videoView);
        // Ruta al video que deseas reproducir que se encuentra en la carpeta res de android
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video;

        video.setVideoPath(path);
        video.start();

        botonlista = findViewById(R.id.botonlista);

        botonlista.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, ListViewActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
