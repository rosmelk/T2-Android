package com.example.t2_evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv_nombre = findViewById(R.id.txt_nombre);//asociar la parte grafica con el codigo
        TextView tv_number = findViewById(R.id.txt_number);
        Button bt_llamar = findViewById(R.id.bt_llamar);
        Button bt_sms = findViewById(R.id.btn_sms);
    }
}