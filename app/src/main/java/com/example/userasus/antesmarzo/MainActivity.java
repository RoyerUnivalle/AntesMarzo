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
    Button btn_iniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oc1 = (Button) findViewById(R.id.oc1);
        oc2 = (Button) findViewById(R.id.oc2);

        btn_iniciar= (Button) findViewById(R.id.btn_iniciar);
        //metodo delegado
        oc1.setOnClickListener(this);

        btn_iniciar.setOnClickListener(this);

        //metodo en linea
        oc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                Toast.makeText(context,"hola meotod inline",Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.oc1:
                Toast.makeText(this,"hola meotod delegado",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_iniciar:
                Iniciar();
                break;
            default:
                break;
        }
    }

    public void Iniciar(){
        Intent ir = new Intent(MainActivity.this,Main2Activity.class);
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(ir);
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
