package br.edu.ifpb.padroes.atv3.musicas.decorator;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.servico.MusicaNaoEncontradaException;

public class TocadorBase implements Tocador{
    @Override
    public void tocarMusica(Musica musica) {
        if(musica == null) throw new MusicaNaoEncontradaException();
            System.out.println("Tocando música: " + musica.titulo());
    }
}
