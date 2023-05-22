package com.prodcocarf.prueba1sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnOpcionRegistro,btnRegistroMascota,btnConsultaIndividual,btnConsultaSpinner,btnConsultaLista,btnConsultaListaMascota,btnConsultaListaPersonasRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Metodo para registrar usuarios
        btnOpcionRegistro = (Button) findViewById(R.id.btnOpcionRegistro);
        btnOpcionRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistroUsuariosActivity.class);
                startActivity(intent);

            }
        });
//Metodo para registrar mascota
        btnRegistroMascota=(Button) findViewById(R.id.btnRegistroMascota);
        btnRegistroMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistroMascotaActivity.class);
                startActivity(intent);
            }
        });
//Metodo para consulta individual
        btnConsultaIndividual=(Button) findViewById(R.id.btnConsultaIndividual);
        btnConsultaIndividual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConsultarUsuariosActivity.class);
                startActivity(intent);
            }
        });

//

        btnConsultaSpinner=findViewById(R.id.btnConsultaSpinner);
        btnConsultaSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConsultaComboActivity.class);
                startActivity(intent);
            }
        });

        btnConsultaLista=findViewById(R.id.btnConsultaLista);
        btnConsultaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConsultarListaListViewActivity.class);
                startActivity(intent);
            }
        });

        btnConsultaListaMascota=findViewById(R.id.btnConsultaListaMascota);
        btnConsultaListaMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaMascotasActivity.class);
                startActivity(intent);
            }
        });

        btnConsultaListaPersonasRecycler=findViewById(R.id.btnConsultaListaPersonasRecycler);
        btnConsultaListaPersonasRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaPersonasRecycler.class);
                startActivity(intent);
            }
        });
    }
}