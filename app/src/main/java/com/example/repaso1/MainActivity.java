package com.example.repaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1=findViewById(R.id.editTextValor);
    }

    public void enviarDato(View view){
        Intent intent=new Intent(this,SegundoActivity.class);
        String valorEnviar=valor1.getText().toString();
        intent.putExtra("valor1",valorEnviar);
        startActivity(intent);
    }
}