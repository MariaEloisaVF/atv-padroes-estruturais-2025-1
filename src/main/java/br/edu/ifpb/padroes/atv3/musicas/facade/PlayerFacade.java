package br.edu.ifpb.padroes.atv3.musicas.facade;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.adapters.MusicTarget;
import br.edu.ifpb.padroes.atv3.musicas.decorator.Tocador;

public class PlayerFacade {
    private final MusicTarget musicTarget;
    private final Tocador tocador;

    public PlayerFacade(MusicTarget musicTarget, Tocador tocador){
        this.musicTarget = musicTarget;
        this.tocador = tocador;
    }

    public void tocarTudo(){
        for(Musica musica : musicTarget.listar()){
            tocador.tocarMusica(musica);
        }
    }

    public void tocarPorGenero(String genero){
        musicTarget.listar().stream()
                .filter(m -> m.genero().equalsIgnoreCase(genero))
                .forEach(tocador::tocarMusica);
    }

    public void tocarPorArtista(String artista){
        musicTarget.listar().stream()
                .filter(m -> m.artista().equalsIgnoreCase(artista))
                .forEach(tocador::tocarMusica);
    }
}
