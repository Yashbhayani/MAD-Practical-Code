package com.example.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    EditText editTextNumber3;
    EditText editTextTextPersonName;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber3 = findViewById(R.id.editTextNumber3);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button.setOnClickListener(view -> {
            String a = editTextNumber.getText().toString();
            String b = editTextNumber3.getText().toString();

            double A = Double.parseDouble(a);
            double B = Double.parseDouble(b);
            double c = A + B;
            String C = String.valueOf(c);
            editTextTextPersonName.setText(C);
        });

        button2.setOnClickListener(view -> {
            String a = editTextNumber.getText().toString();
            String b = editTextNumber3.getText().toString();

            double A = Double.parseDouble(a);
            double B = Double.parseDouble(b);
            double c = A - B;
            String C = String.valueOf(c);
            editTextTextPersonName.setText(C);
        });

        button3.setOnClickListener(view -> {
            String a = editTextNumber.getText().toString();
            String b = editTextNumber3.getText().toString();

            double A = Double.parseDouble(a);
            double B = Double.parseDouble(b);
            double c = A * B;
            String C = String.valueOf(c);
            editTextTextPersonName.setText(C);
        });

        button4.setOnClickListener(view -> {
            String a = editTextNumber.getText().toString();
            String b = editTextNumber3.getText().toString();

            double A = Double.parseDouble(a);
            double B = Double.parseDouble(b);
            double c = A / B;
            String C = String.valueOf(c);
            editTextTextPersonName.setText(C);
        });

        button5.setOnClickListener(view -> {
            String a = editTextNumber.getText().toString();
            String b = editTextNumber3.getText().toString();

            double A = Double.parseDouble(a);
            double B = Double.parseDouble(b);
            double c = A % B;
            String C = String.valueOf(c);
            editTextTextPersonName.setText(C);
        });
    }
}