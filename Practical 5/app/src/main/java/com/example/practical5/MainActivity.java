package com.example.practical5;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        builder = new AlertDialog.Builder(this);

        button.setOnClickListener(view -> {
            builder.setMessage("Do you want to close this application ?");
            builder.setCancelable(false);
            builder.setPositiveButton("Yes", (dialog, id) -> {
                finish();
                Toast.makeText(getApplicationContext(), "you choose yes action for alert",
                        Toast.LENGTH_SHORT).show();
            });
            builder.setNegativeButton("No", (dialog, id) -> {
                //  Action for 'NO' Button
                dialog.cancel();
                Toast.makeText(getApplicationContext(), "you choose no action for alert",
                        Toast.LENGTH_SHORT).show();
            });

            //Creating dialog box
            AlertDialog alert = builder.create();
            //Setting the title manually
            alert.setTitle("AlertDialogExample");
            alert.show();
        });

    }
}