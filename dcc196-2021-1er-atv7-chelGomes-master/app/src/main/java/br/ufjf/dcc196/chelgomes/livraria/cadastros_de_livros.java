package br.ufjf.dcc196.chelgomes.livraria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class cadastros_de_livros extends AppCompatActivity {
        EditText editTextTitulo;
        EditText editTextAutor;
        EditText editTextEditora;
        EditText editTextAno;
        EditText editTextEdicao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastros_de_livros);

            editTextTitulo = findViewById(R.id.editTextTitulo);
            editTextAutor = findViewById(R.id.editTextAutor);
            editTextEditora = findViewById(R.id.editTextEditora);
            editTextAno = findViewById(R.id.editTextAno);
            editTextEdicao = findViewById(R.id.editTextEdicao);
        }

    public void voltarClick(View view){
        finish();
    }

    public void cadastroLivro(View view){
        String titulo = editTextTitulo.getText().toString();
        String autor = editTextAutor.getText().toString();
        String editora = editTextEditora.getText().toString();
        String ano = editTextAno.getText().toString();
        String edicao = editTextEdicao.getText().toString();

        finish();

    }

    public interface OnCadastroLivrosClickListener {
    }

    public cadastros_de_livros(String Titulo, String Autor, String Editora, int Ano, String Edicao) {
        this.editTextTitulo = editTextTitulo;
        this.editTextAutor = editTextAutor;
        this.editTextEditora = editTextEditora;
        this.editTextAno = editTextAno;
        this.editTextEdicao = editTextEdicao;
    }
}