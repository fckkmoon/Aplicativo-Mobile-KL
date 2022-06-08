package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Interfaces {

    Button botaoafazeres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
            public void teladois(View view) {
            Intent it = new Intent(this, Afazeres.class);
            startActivity(it);
            }

    Button botaocompletos;

    @Override
    public void telatres(View view) {
            Intent it = new Intent(this, Completos.class);
            startActivity(it);
            }

    Button botaotodas;

    @Override
    public void telaquatro(View view) {
            Intent it = new Intent(this, Todas.class);
            startActivity(it);
            }

    Button botaocompras;

    @Override
    public void telacinco(View view) {
        Intent it = new Intent(this, Compras.class);
        startActivity(it);
        }

    Button botaofilmes;

    @Override
    public void telaseis(View view) {
        Intent it = new Intent(this, Filmes.class);
        startActivity(it);
        }

    Button botaoferias;

    @Override
    public void telasete(View view) {
        Intent it = new Intent(this, Ferias.class);
        startActivity(it);
    }
}