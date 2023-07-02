package com.example.modulocomponentesdeinterface.model;

import android.widget.ImageView;

public class Produto {

    String nome;
    String valorDoProduto;
    int imgProduto;



    public Produto(String nome, String valorDoProduto, int imgProduto) {
        this.nome = nome;
        this.valorDoProduto = valorDoProduto;
        this.imgProduto = imgProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(String valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public int getImgProduto() {
        return imgProduto;
    }

    public void setImgProduto(int imgProduto) {
        this.imgProduto = imgProduto;
    }
}