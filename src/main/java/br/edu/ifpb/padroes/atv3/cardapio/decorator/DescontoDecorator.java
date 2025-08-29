package br.edu.ifpb.padroes.atv3.cardapio.decorator;

import br.edu.ifpb.padroes.atv3.cardapio.itens.Item;

public class DescontoDecorator implements Item {
    private Item item;
    private double desconto;

    public DescontoDecorator(Item item, double desconto){
        this.item = item;
        this.desconto = desconto;
    }
    @Override
    public String getNomeItem() {
        return item.getNomeItem() + " (com desconto!)";
    }

    @Override
    public String getDescricaoItem() {
        return item.getDescricaoItem();
    }

    @Override
    public double getPrecoItem() {
        return item.getPrecoItem() * (1 - desconto);
    }

    @Override
    public void exibir(String identacao) {
        System.out.println(identacao + "_ " + getNomeItem() + " - R$" + getPrecoItem() + " (desconto aplicado)");
        item.exibir(identacao+ "  ");
    }
}
