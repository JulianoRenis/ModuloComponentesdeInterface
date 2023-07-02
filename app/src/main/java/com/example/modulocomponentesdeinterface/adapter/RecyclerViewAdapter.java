package com.example.modulocomponentesdeinterface.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.modulocomponentesdeinterface.R;
import com.example.modulocomponentesdeinterface.model.Produto;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>  {

    private List<Produto> listProdutos;


    public RecyclerViewAdapter(List<Produto> lista) {
        this.listProdutos= lista;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView nomeProduto;
        private final TextView nomePreco;
        private final ImageView imgProduto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeProduto = (TextView) itemView.findViewById(R.id.nameProduto);
            nomePreco = (TextView) itemView.findViewById(R.id.txtPreco);
            imgProduto = (ImageView) itemView.findViewById(R.id.imgList);

        }

    }


    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.item_produto,parent,false);

       return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {

        Produto produto = listProdutos.get(position);
        holder.nomeProduto.setText(produto.getNome());
        holder.nomePreco.setText(produto.getValorDoProduto());
        holder.imgProduto.setImageResource(produto.getImgProduto());
    }

    @Override
    public int getItemCount() {
       return listProdutos.size();
    }
}
