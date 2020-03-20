package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button lbutton,cButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lbutton=findViewById(R.id.linearbtn);
        cButton=findViewById(R.id.Cbtn);


        lbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button present in linear layout",Toast.LENGTH_SHORT).show();
            }
        });
        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button present in Constraint layout",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
