package com.claseIHC.myapplication2;

// Nombre del proyecto: IHC-app
// Desarolladores
// José Eduardo Gómez Mora
// Guillermo Gómez Castañeda
// Emmanuel Martín Marín

// MainActivity.java
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity; // Asegúrate de que este import esté presente

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login); // Conectar el layout XML

        // Inicializar las vistas
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        // Configurar la acción del botón de inicio de sesión
        loginButton.setOnClickListener(v -> handleLogin());
    }

    private void handleLogin() {
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        // Aquí puedes agregar la lógica de autenticación

        if (!isValidEmail(email)) {
            showToast("Por favor, ingresa un correo electrónico válido.");
            return;
        }

        if (password.isEmpty()) {
            showToast("Por favor, ingresa una contraseña.");
            return;
        }

        // Simular autenticación (usa un método seguro en producción)
        authenticateUser(email, password);
    }

    private boolean isValidEmail(String email) {
        // Verificar formato de correo electrónico
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private void authenticateUser(String email, String password) {
        // Simular autenticación
        if (email.equals("usuario@example.com") && password.equals("password123")) {
            showToast("Inicio de sesión exitoso.");
            // Redirigir a otra actividad (Splash en este caso)
            Intent intent = new Intent(MainActivity.this, Splash.class);
            startActivity(intent);
            finish(); // Opcional: cierra la actividad actual
        } else {
            showToast("Correo electrónico o contraseña incorrectos.");
        }
    }

    private void showToast(String message) {
        // Método auxiliar para mostrar mensajes
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
