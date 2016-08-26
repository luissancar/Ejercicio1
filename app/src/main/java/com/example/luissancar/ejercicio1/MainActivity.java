package com.example.luissancar.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView textView3,primero;
    private RadioButton r1, r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        textView3=(TextView)findViewById(R.id.textView3);
        primero=(TextView)findViewById(R.id.textView);
        r1=(RadioButton)findViewById(R.id.r1);
        r2=(RadioButton)findViewById(R.id.r2);

    }
    public void sumar(View view){
        String valor1=editText1.getText().toString();
        String valor2=editText2.getText().toString();
        int resultado;
        int a=Integer.parseInt(valor1);
        int b=Integer.parseInt(valor2);
        if (r1.isChecked())
            resultado=a+b;
        else
            resultado=a-b;
        textView3.setText(String.valueOf(resultado));}

}
