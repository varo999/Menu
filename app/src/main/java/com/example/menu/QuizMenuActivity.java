package com.example.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView; // Asegúrate de importar TextView
import androidx.appcompat.app.AppCompatActivity;

public class QuizMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_menu); // Asegúrate de que este sea el XML correcto

        // Obtén el ListView y llena con opciones
        ListView menuList = findViewById(R.id.menuListView); // Cambié el ID para que coincida con el XML

        // Define las opciones del menú (strings desde recursos)
        String[] items = {
                getResources().getString(R.string.menu_item_play),
                getResources().getString(R.string.menu_item_scores),
                getResources().getString(R.string.menu_item_settings),
                getResources().getString(R.string.menu_item_help)
        };

        // Usamos un adaptador para vincular los datos del array con la vista ListView
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, R.layout.menu_item, items);
        menuList.setAdapter(adapt);

        // Configura el listener para cuando el usuario haga clic en una opción
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                // Recupera el texto de la opción seleccionada
                String selectedItem = ((TextView) itemClicked).getText().toString();

                // Dependiendo de la opción seleccionada, no hace nada (sin redirigir)
                if (selectedItem.equals(getResources().getString(R.string.menu_item_play))) {
                    // No redirigir a ninguna actividad
                    // startActivity(new Intent(QuizMenuActivity.this, QuizGameActivity.class));
                } else if (selectedItem.equals(getResources().getString(R.string.menu_item_scores))) {
                    // No redirigir a ninguna actividad
                    // startActivity(new Intent(QuizMenuActivity.this, QuizScoresActivity.class));
                } else if (selectedItem.equals(getResources().getString(R.string.menu_item_settings))) {
                    // No redirigir a ninguna actividad
                    // startActivity(new Intent(QuizMenuActivity.this, QuizSettingsActivity.class));
                } else if (selectedItem.equals(getResources().getString(R.string.menu_item_help))) {
                    // No redirigir a ninguna actividad
                    // startActivity(new Intent(QuizMenuActivity.this, QuizHelpActivity.class));
                }
            }
        });
    }
}
