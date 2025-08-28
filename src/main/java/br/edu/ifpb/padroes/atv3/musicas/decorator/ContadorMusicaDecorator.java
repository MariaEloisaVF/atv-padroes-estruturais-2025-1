package br.edu.ifpb.padroes.atv3.musicas.decorator;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;

public class ContadorMusicaDecorator implements Tocador{
    private final Tocador tocador;
    private int totalMusicasTocadas = 0;

    public ContadorMusicaDecorator(Tocador tocador){
        this.tocador = tocador;
    }
    @Override
    public void tocarMusica(Musica musica) {
        tocador.tocarMusica(musica);
        totalMusicasTocadas++;
    }

    public int getTotalMusicasTocadas(){
        return totalMusicasTocadas;
    }
}
