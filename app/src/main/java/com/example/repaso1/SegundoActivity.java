package com.example.repaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.repaso1.Logica.Calculos;

public class SegundoActivity extends AppCompatActivity {
    private EditText valor2;
    private EditText valor3;
    private EditText resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        valor2=findViewById(R.id.editTextValorRecibido);
        valor3=findViewById(R.id.editTextValor1SegundoActivity);
        resultado=findViewById(R.id.editTextResultadoSegundoActivity);

        Bundle bundle=getIntent().getExtras();

        valor2.setText(bundle.getString("valor1"));
    }
    public void multiplicarValores(View view){

        String obtenerValor2=valor2.getText().toString();
        String obtenerValor3=valor3.getText().toString();

        Long numero2=Long.parseLong(obtenerValor2);
        Long numero3=Long.parseLong(obtenerValor3);

        Calculos calculos=new Calculos();

        resultado.setText(String.valueOf(calculos.multiplicar(numero2,numero3)));




    }

    public void enviarValor(View view){

        if(!resultado.getText().toString().equals("")){
            Intent intent=new Intent(this,TercerActivity.class);
            intent.putExtra("enviarDatoMutiplicado",resultado.getText().toString());
            startActivity(intent);
        }else{
            Toast.makeText(this,"No existe un resultado",Toast.LENGTH_LONG).show();
        }
    }
}