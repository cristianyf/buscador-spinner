package com.example.buscadorspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.text);

        try {
            ArrayList<String> numberList = new ArrayList<>();

            numberList.add("Select number");
            numberList.add(" uno");
            numberList.add(" dos");
            numberList.add(" tres");
            numberList.add(" cuatro");
            numberList.add(" cinco");
            numberList.add(" uno");
            numberList.add(" dos");
            numberList.add(" tres");
            numberList.add(" cuatro");
            numberList.add(" cinco");
            numberList.add(" uno");
            numberList.add(" dos");
            numberList.add(" tres");
            numberList.add(" cuatro");
            numberList.add(" cinco");
            numberList.add(" uno");
            numberList.add(" dos");
            numberList.add(" tres");
            numberList.add(" cuatro");
            numberList.add(" cinco");
            numberList.add(" uno");
            numberList.add(" dos");
            numberList.add(" tres");
            numberList.add(" cuatro");
            numberList.add(" cinco");
            numberList.add(" uno");
            numberList.add(" dos");
            numberList.add(" tres");
            numberList.add(" cuatro");
            numberList.add(" cinco");

            spinner.setAdapter((new ArrayAdapter<>(MainActivity.this,
                    android.R.layout.simple_spinner_dropdown_item, numberList)));

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {
                        Toast.makeText(getApplicationContext(), "seleccione un numero", Toast.LENGTH_SHORT).show();
                        textView.setText("");
                    } else {
                        String number = parent.getItemAtPosition(position).toString();
                        textView.setText(number);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        } catch (Exception e) {

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        try {
            super.onStop();
        } catch (Exception e) {

        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {

        }
    }
}