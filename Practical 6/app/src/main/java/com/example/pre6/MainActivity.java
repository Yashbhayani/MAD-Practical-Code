package com.example.pre6;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button B1;
    EditText E1;
    EditText E2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1 = findViewById(R.id.editTextNumber);
        E2 = findViewById(R.id.editTextNumber1);
        B1 = findViewById(R.id.button);
        final String[] LL = new String[1];

        B1.setOnClickListener(view -> {
            String L_1 = E1.getText().toString();
            String L_2 = E2.getText().toString();

            if(L_1.equals("") && L_2.equals("")){
                E1.setError("Please Enter");
                E2.setError("Please Enter");
                Toast.makeText(MainActivity.this, "Data is Undefined", Toast.LENGTH_SHORT).show();
            }else if(!L_1.equals("")&&!L_2.equals("")){
                if(L_1.equals(LL[0]))
                {
                    double A = Double.parseDouble(L_2);
                    Double SA = A * 75.719;
                    DecimalFormat df_obj = new DecimalFormat("#.####");
                    String AA = Double.toString(Double.parseDouble(df_obj.format(SA)));
                    Toast.makeText(MainActivity.this, "USD = "+ A + " => INR = "+ AA , Toast.LENGTH_SHORT).show();
                    E1.setText(AA);
                    E2.setText("");
                    LL[0] = AA;
                }else if(L_2.equals(LL[0])) {
                    double A = Double.parseDouble(L_1);
                    Double SA = A / 75.719;
                    DecimalFormat df_obj = new DecimalFormat("#.####");
                    String AA = Double.toString(Double.parseDouble(df_obj.format(SA)));
                    Toast.makeText(MainActivity.this, "INR = "+ A + " => USD = "+ AA , Toast.LENGTH_SHORT).show();
                    E2.setText(AA);
                    E1.setText("");
                    LL[0] = AA;
                }
            }else {
                if(L_2.equals("")){
                    double A = Double.parseDouble(L_1);
                    Double SA = A / 75.719;
                    DecimalFormat df_obj = new DecimalFormat("#.####");
                    String AA = Double.toString(Double.parseDouble(df_obj.format(SA)));
                    Toast.makeText(MainActivity.this, "INR = "+ A + " => USD = "+ AA , Toast.LENGTH_SHORT).show();
                    E2.setText(AA);
                    E1.setText("");
                    LL[0] = AA;
                }else if(L_1.equals("")){
                    double A = Double.parseDouble(L_2);
                    Double SA = A * 75.719;
                    DecimalFormat df_obj = new DecimalFormat("#.####");
                    String AA = Double.toString(Double.parseDouble(df_obj.format(SA)));
                    Toast.makeText(MainActivity.this, "USD = "+ A + " => INR = "+ AA , Toast.LENGTH_SHORT).show();
                    E1.setText(AA);
                    E2.setText("");
                    LL[0] = AA;
                }
            }

        });

    }
}