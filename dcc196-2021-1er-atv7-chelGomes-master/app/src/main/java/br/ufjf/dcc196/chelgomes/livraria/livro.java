package br.ufjf.dcc196.chelgomes.livraria;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class livro extends AppCompatActivity {
    private String tituloLivro;
    private String autor;
    private String editora;
    private Integer ano;
    private String edicao;


    public livro(String tituloLivro, String autor, String editora, Integer ano, String edicao) {
        this.tituloLivro = tituloLivro;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
    }



    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastros_de_livros);
    }

}