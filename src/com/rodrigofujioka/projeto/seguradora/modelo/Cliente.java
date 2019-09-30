package com.rodrigofujioka.projeto.seguradora.modelo;

import com.rodrigofujioka.projeto.seguradora.tiposenumerados.TipoPessoa;

public class Cliente {

    private int codigo;
    private String nome;
    private TipoPessoa tipoPessoa;


    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", nome=" + nome + ", tipoPessoa=" + tipoPessoa + "]";
    }


    public Cliente() {
        // TODO Auto-generated constructor stub
    }


    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }


    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


}
