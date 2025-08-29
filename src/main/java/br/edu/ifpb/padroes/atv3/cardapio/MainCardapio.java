package br.edu.ifpb.padroes.atv3.cardapio;

import br.edu.ifpb.padroes.atv3.cardapio.decorator.DescontoDecorator;
import br.edu.ifpb.padroes.atv3.cardapio.itens.Combo;
import br.edu.ifpb.padroes.atv3.cardapio.itens.Item;
import br.edu.ifpb.padroes.atv3.cardapio.itens.ItemIndividual;

public class MainCardapio {
    public static void main(String[] args){
        Item coca = new ItemIndividual("Coca-Cola", "350ml gelada", 5.0);
        Item batata = new ItemIndividual("Batata frita", "Porção pequena", 8.0);
        Item burger = new ItemIndividual("Hambúrguer", "Picanha com queijo", 20.0);

        Combo combo1 = new Combo("Combo Clássico", "Hamburguer + Batata + Coca");
        combo1.adicionar(coca);
        combo1.adicionar(batata);
        combo1.adicionar(burger);
        System.out.println("COMBO 1");
        combo1.exibir("");

        Item comboPromocional = new DescontoDecorator(combo1, 0.1);

        System.out.println("\n --- Cardápio ---\n");
        coca.exibir("");
        batata.exibir("");
        burger.exibir("");
        combo1.exibir("");
        System.out.println("COMBO PROMOCIONAL");
        comboPromocional.exibir("");

        Combo combo2 = new Combo("Combo Clássico^2", "Dois combos Clássicos");
        combo2.adicionar(combo1);
        combo2.adicionar(combo1);
        System.out.println("COMBO 2");
        combo2.exibir("");
    }
}
