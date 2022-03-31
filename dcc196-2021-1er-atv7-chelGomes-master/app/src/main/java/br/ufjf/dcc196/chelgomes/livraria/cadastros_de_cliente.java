package br.ufjf.dcc196.chelgomes.livraria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class cadastros_de_cliente extends AppCompatActivity {
    EditText editTextMatricula;
    EditText editTextNome;
    EditText editTextCpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastros_de_cliente);

        editTextMatricula = findViewById(R.id.editTextMatricula);
        editTextNome = findViewById(R.id.editTextNome);
        editTextCpf = findViewById(R.id.editTextCpf);
    }

    public void voltarClick(View view){
        finish();
    }

    public void cadastroCliente(View view){
        String matricula = editTextMatricula.getText().toString();
        String nome = editTextNome.getText().toString();
        String cpf = editTextCpf.getText().toString();

        finish();
    }
}