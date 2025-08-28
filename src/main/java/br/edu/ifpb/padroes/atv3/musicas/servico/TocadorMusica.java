package br.edu.ifpb.padroes.atv3.musicas.servico;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.adapters.MusicTarget;

import java.util.List;

public class TocadorMusica {

    private final MusicTarget musicaTarget;

    public TocadorMusica(MusicTarget musicaTarget){
        this.musicaTarget = musicaTarget;
    }

    public void tocarTodas(){
        //List<Musica> musicas = musicaTarget.listar();
        for(Musica musica: musicaTarget.listar()){
            tocarMusica(musica);
        }
    }
    public void tocarMusica(Musica musica) {
        if (musica == null)
            throw new MusicaNaoEncontradaException();

        System.out.println("Tocando musica: " + musica.titulo());
    }

}
