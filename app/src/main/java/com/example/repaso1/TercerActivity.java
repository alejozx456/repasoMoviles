package com.example.repaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TercerActivity extends AppCompatActivity {

    private TextView valorRecibido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);

        valorRecibido=findViewById(R.id.textViewRecibidoActivity3);

        Bundle bundle=getIntent().getExtras();

        valorRecibido.setText(bundle.getString("enviarDatoMutiplicado"));
    }

    public void siguiente(View view){
        Intent intent=new Intent(this,CuartoActivity.class);
        startActivity(intent);
    }
}