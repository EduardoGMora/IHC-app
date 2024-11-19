package com.claseIHC.myapplication2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;  //
    String[] menuItems = {
            "Opción 1",
            "Opción 2",
            "Opción 3",
            "Opción 4",
            "Opción 5",
            "Opción 6"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                menuItems
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = menuItems[position];
                Toast.makeText(ListViewActivity.this, "Seleccionaste: " + selectedItem, Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        // Código para la opción 1
                        break;
                    case 1:
                        // Código para la opción 2
                        break;
                    case 2:
                        // Código para la opción 3
                        break;
                    case 3:
                        // Código para la opción 4
                        break;
                    case 4:
                        // Código para la opción 5
                        break;
                    case 5:
                        // Código para la opción 6
                        break;
                }
            }
        });
    }
}