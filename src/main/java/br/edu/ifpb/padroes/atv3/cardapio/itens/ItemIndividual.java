package br.edu.ifpb.padroes.atv3.cardapio.itens;

import br.edu.ifpb.padroes.atv3.cardapio.itens.Item;

public class ItemIndividual implements Item {
    private String nome;
    private String descricao;
    private double preco;

    public ItemIndividual(String nome, String descricao, double preco){
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNomeItem() {
        return nome;
    }

    @Override
    public String getDescricaoItem() {
        return descricao;
    }

    public double getPrecoItem() {
        return preco;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "_ " + nome + " (" + descricao + ") -R$" +preco);
    }
}
