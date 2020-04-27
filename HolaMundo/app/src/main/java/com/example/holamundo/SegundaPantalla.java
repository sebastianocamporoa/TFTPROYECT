package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class SegundaPantalla extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        et1 = (EditText)findViewById(R.id.txtNum1);
        et2 = (EditText)findViewById(R.id.txtNum2);
        tv1 = (TextView)findViewById(R.id.txtResultado);
    }
    public void Suma(View view){
        int num1 = Integer.parseInt(String.valueOf(et1.getText()));
        int num2 = Integer.parseInt(String.valueOf(et2.getText()));
        int suma = num1 + num2;
        String resultado = String.valueOf(suma);
        tv1.setText(resultado);
    }



}
