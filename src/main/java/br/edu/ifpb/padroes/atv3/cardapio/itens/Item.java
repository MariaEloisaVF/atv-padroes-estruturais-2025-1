package br.edu.ifpb.padroes.atv3.cardapio.itens;

import br.edu.ifpb.padroes.atv3.musicas.adapters.MusicTarget;

public interface Item {
    String getNomeItem();
    String getDescricaoItem();
    double getPrecoItem();
    void exibir(String identacao);
}
