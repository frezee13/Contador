package com.example.pc_seven.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private TextView tvNumber;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd =(Button) findViewById(R.id.btn_add);
        tvNumber = (TextView) findViewById(R.id.tv_number);
        tvNumber.setText("BNB Hola Mundo!");

    }
}
