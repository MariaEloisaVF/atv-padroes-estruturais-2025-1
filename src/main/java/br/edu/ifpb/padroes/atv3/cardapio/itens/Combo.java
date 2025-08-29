package br.edu.ifpb.padroes.atv3.cardapio.itens;

import br.edu.ifpb.padroes.atv3.cardapio.itens.Item;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Item {
    private String nome;
    private String descricao;
    private List<Item> itens;

    public Combo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.itens = new ArrayList<>();
    }

    public void adicionar(Item item){
        itens.add(item);
        //System.out.println(item.getNomeItem() + " foi adicionado ao combo " + nome);
    }

    public void remover(Item item){
        if(itens.contains(item)){
            itens.remove(item);
            //System.out.println(item.getNomeItem() + "foi removido do combo " + nome);
        } else{
            System.out.println(getNomeItem() + " não encontrao no combo " + nome);
        }
    }
    @Override
    public String getNomeItem() {
        return nome;
    }

    @Override
    public String getDescricaoItem() {
        return descricao;
    }
    @Override
    public double getPrecoItem(){
        return itens.stream().mapToDouble(Item::getPrecoItem).sum();
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "+ Combo: " + nome + " (" + descricao + ") - R$" + getPrecoItem());
        for(Item item : itens){
            item.exibir(indentacao + "  ");
        }
    }
}
