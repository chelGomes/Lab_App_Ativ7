package br.ufjf.dcc196.chelgomes.livraria;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class cliente extends AppCompatActivity {

    private Integer id;
    private String nome;
    private String cpf;

    public cliente(Integer id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastros_de_cliente);
    }
}