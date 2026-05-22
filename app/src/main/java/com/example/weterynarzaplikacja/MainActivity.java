package com.example.weterynarzaplikacja;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayListgatunek;
    ArrayAdapter<String> arrayAdapter;
    SeekBar seekBar;
    Button buttonOk;
    EditText editTextImieNazwisko;
    EditText editTextCelWizyty;
    EditText editTextCzas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        arrayListgatunek = new ArrayList<>();
        arrayListgatunek.add("Pies");
        arrayListgatunek.add("Kot");
        arrayListgatunek.add("Świnka morska");
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListgatunek);
        listView.setAdapter(arrayAdapter);
        editTextImieNazwisko = findViewById(R.id.editTextText);
        editTextCelWizyty = findViewById(R.id.editTextText2);
        editTextCzas = findViewById(R.id.editTextTime);
    }
}