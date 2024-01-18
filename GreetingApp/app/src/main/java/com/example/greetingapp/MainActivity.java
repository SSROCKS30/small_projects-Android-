package com.example.greetingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit_text_name;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_text_name = findViewById(R.id.editText);
        btn = findViewById(R.id.myBTN);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edit_text_name.getText().toString().trim();
                if (!name.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Welcome " + name + " on our greeting app",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Please enter your name",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}