package com.example.repaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CuartoActivity extends AppCompatActivity {
    private ListView lista;
    private EditText resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarto);

        lista=findViewById(R.id.lista1);
        resultado=findViewById(R.id.resultadoList);
        List<String> listaGuardar=new ArrayList<String>();
        listaGuardar.add("Hola");
        listaGuardar.add("Chao");


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listaGuardar
        );
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                resultado.setText("El item seleccionado es"+ lista.getItemAtPosition(i));
            }
        });
    }

}