package com.example.userasus.antesmarzo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener{


    EditText input;
    TextView campo;
    Button oc1;
    Button oc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onClick(View v) {

    }

    public void Saludar(View v){
        //enlace
        input = (EditText) findViewById(R.id.ed1);
        String mensaje = input.getText().toString().trim();
        //enlace
        campo = (TextView) findViewById(R.id.tv1);
        campo.setText(""+mensaje);
        //SE ENCARGA DE EMITIR UN MSJ DE ALERTA
        Toast.makeText(this,"hola auditorio: "+mensaje, Toast.LENGTH_LONG).show();
    }

}
