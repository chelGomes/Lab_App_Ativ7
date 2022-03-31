package br.ufjf.dcc196.chelgomes.livraria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView recyclerViewLivros;
    private LinearLayoutManager layoutManager;
    private ListasLivrosAdapter listasLivrosAdapter;
    private ItemTouchHelper.SimpleCallback touchHelper;
    private List<livro> livrosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       livrosList = new ArrayList<livro>() {{
            add(new livro("Calculo A", "Diva Marilia Flemming", "Pearson", 2006, "3"));
            add(new livro("Calculo B", "Diva Marilia Flemming", "Pearson", 2017, "7"));
            add(new livro("Fisica 1", "Hugh D. Young", "Pearson", 2012, "5"));
            add(new livro("Introducao a Programação com Python", "Nilo Ney Coutinho Menezes",
                    "novatec", 2019, "1"));
            add(new livro("Projeto de Algoritmos c++", "Nivio Zivaini",
                    "Cengage Learning", 2012, "2"));
            add(new livro("Organização e Projetos de Computadores", "David A. Patterson",
                    "LTC", 2009, "5"));

        }};

        recyclerViewLivros = findViewById(R.id.recyclerViewLivros);
        layoutManager = new LinearLayoutManager(this);
        recyclerViewLivros.setLayoutManager(layoutManager);
        listasLivrosAdapter = new ListasLivrosAdapter(livrosList);
        recyclerViewLivros.setAdapter(listasLivrosAdapter);

        touchHelper = new ItemTouchHelper.SimpleCallback(ItemTouchHelper.ACTION_STATE_IDLE, ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                livrosList.remove(viewHolder.getAdapterPosition());
                listasLivrosAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        };
        new ItemTouchHelper(touchHelper).attachToRecyclerView((recyclerViewLivros));
    }

    public void clickAcervo (View view){
        Intent acervoIntent = new Intent(getApplicationContext(), Acervo.class);
        startActivity(acervoIntent);
    }
    public void clickLivros (View view){
        Intent livrosIntent = new Intent(getApplicationContext(), cadastros_de_livros.class);
        startActivity(livrosIntent);
    }
    public void clickCliente (View view){
        Intent clienteIntent = new Intent(getApplicationContext(), cadastros_de_cliente.class);
        startActivity(clienteIntent);
    }

    public void clickObjetivo (View view){
        Intent objetivo_aplicativoIntent = new Intent(getApplicationContext(), Objetivo_Aplicativo.class);
        startActivity(objetivo_aplicativoIntent);
    }
}