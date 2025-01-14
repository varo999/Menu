package com.example.menu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Aquí podrías mostrar un splash screen
        // En este caso, usaremos un Handler para esperar unos segundos antes de cambiar a QuizMenuActivity

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Después de un pequeño delay, redirigimos a QuizMenuActivity
                Intent intent = new Intent(MainActivity.this, QuizMenuActivity.class);
                startActivity(intent);
                finish(); // Cierra MainActivity para que no regrese a ella cuando presione "Atrás"
            }
        }, 2000); // 2 segundos de splash screen (ajustable)
    }
}
