package com.claseIHC.myapplication2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity; // Asegúrate de que este import esté presente

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Conectar el layout XML

        // Inicializar las vistas
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        // Configurar la acción del botón de inicio de sesión
        loginButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            // Validación simple de los campos (puedes expandirla según tu necesidad)
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(MainActivity.this, "Por favor, completa ambos campos", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Iniciando sesión...", Toast.LENGTH_SHORT).show();
                // Aquí podrías añadir la lógica para autenticar al usuario
            }
        });
    }
}
