package com.example.modulocomponentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.modulocomponentesdeinterface.adapter.RecyclerViewAdapter;
import com.example.modulocomponentesdeinterface.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class IFoodActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private List<Produto>  listaProdutos= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifood);

        criarProdutos();
        recyclerView = findViewById(R.id.rcView);
        recyclerView2 = findViewById(R.id.rv2);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(listaProdutos);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerViewAdapter);


        RecyclerViewAdapter recyclerViewAdapter2 = new RecyclerViewAdapter(listaProdutos);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setAdapter(recyclerViewAdapter2);
    }

    public void criarProdutos(){
        int imgAir = R.drawable.produto;
        int imgArroz = R.drawable.arros;
        int imgFeijao = R.drawable.feijao;
        int imgoleo = R.drawable.oleo;
        int imgmacarrao = R.drawable.macarrao;
        int imgPicanha = R.drawable.picanha;


        Produto produtos= new Produto("Air Fryer ","R$ 599.56",imgAir);
        this.listaProdutos.add(produtos);

        produtos= new Produto("Arroz ","R$ 12.90",imgArroz);
        this.listaProdutos.add(produtos);

        produtos= new Produto("Feijão ","R$ 5.99",imgFeijao);
        this.listaProdutos.add(produtos);

        produtos = new Produto("Óleo ","R$ 7.99",imgoleo);
        this.listaProdutos.add(produtos);

        produtos= new Produto("Macarrão ","R$ 8.99",imgmacarrao);
        this.listaProdutos.add(produtos);

        produtos= new Produto("Picanha ","R$ 1000000.00",imgPicanha);
        this.listaProdutos.add(produtos);
    }
}