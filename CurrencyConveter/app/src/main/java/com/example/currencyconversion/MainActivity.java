package com.example.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

EditText E1;
TextView T1 ;
Button B1;
Spinner SP1;
Spinner SP2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        B1 = findViewById(R.id.button);
        E1 = findViewById(R.id.editTextTextPersonName);
        T1 = findViewById(R.id.tex1);



        Spinner SP1 = findViewById(R.id.spinner1);
       Spinner SP2 = findViewById(R.id.spinner2);


       String[] from = {"INR","USD","EUR","KWD"};
       ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
       SP1.setAdapter(ad);

        String[] to = {"INR","USD","EUR","KWD"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        SP2.setAdapter(ad1);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String SD = E1.getText().toString();
                if(SD.equals("")) {
                    E1.setError("Please Enter Currency Value");
                }else {
                    String[] CUR = {"INR", "USD", "EUR", "KWD"};
                    double[] MON = {76.26, 1.0, 0.91, 0.3};
                    Double JKL = null;
                    Double ASE = null;
                    Double A1 = Double.parseDouble(SD);
                    String S1 = SP1.getSelectedItem().toString();
                    String S2 = SP2.getSelectedItem().toString();

                    if (S1 != S2) {
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                if (CUR[i] == S1 && CUR[j] == S2) {
                                    ASE = (MON[j] / MON[i]) * A1;
                                    DecimalFormat df_obj = new DecimalFormat("#.####");
                                    JKL = Double.parseDouble(df_obj.format(ASE));
                                    String IOP = Double.toString(JKL);
                                    T1.setText(IOP);
                                }
                            }
                        }
                    } else {
                        Toast.makeText(MainActivity.this, "Your Currency Converter Value is Wrong", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}