package br.ufjf.dcc196.chelgomes.livraria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Objetivo_Aplicativo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetivo_aplicativo);
    }

    public void voltarClick(View view){
        finish();
    }
}