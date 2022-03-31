package br.ufjf.dcc196.chelgomes.livraria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListasLivrosAdapter extends RecyclerView.Adapter <ListasLivrosAdapter.ListarLivrosHolder>{

    private final List<livro> listarLivros;
    private OnListarLivrosClickListener listener;

    public ListasLivrosAdapter(List<livro> livrosList) {
        this.listarLivros = livrosList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ListarLivrosHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context ctx = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View livrosListView = inflater.inflate(R.layout.activity_cadastros_de_livros, parent, false);
        ListarLivrosHolder viewHolder = new ListarLivrosHolder(livrosListView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListarLivrosHolder holder, int position) {
        holder.textViewEdicao.setText(listarLivros.get(position).getEdicao());
        holder.textViewEditora.setText(listarLivros.get(position).getEditora());
        holder.textViewAno.setText(listarLivros.get(position).getAno());
        holder.textViewAutor.setText(listarLivros.get(position).getAutor());
        holder.textViewTitulo.setText(listarLivros.get(position).getTituloLivro());

    }


    @Override
    public int getItemCount() {
        return listarLivros.size();
    }

    public class ListarLivrosHolder extends RecyclerView.ViewHolder {
        private TextView textViewEdicao;
        private TextView textViewAno;
        private TextView textViewEditora;
        private TextView textViewAutor;
        private TextView textViewTitulo;


        public ListarLivrosHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.textViewTitulo);
            textViewAno = itemView.findViewById(R.id.textViewAno);
            textViewEdicao = itemView.findViewById(R.id.textViewEdicao);
            textViewEditora = itemView.findViewById(R.id.textViewEditora);
            textViewAutor = itemView.findViewById(R.id.textViewAutor);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onListarLivrosClick(itemView, getAdapterPosition());
                    Toast.makeText(v.getContext(), "Click" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public interface OnListarLivrosClickListener {
        void onListarLivrosClick(View source, int position);

    }
}
