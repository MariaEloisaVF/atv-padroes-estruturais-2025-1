package br.edu.ifpb.padroes.atv3.musicas.decorator;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;

import java.util.HashMap;
import java.util.Map;

public class ArtistaMaisTocadoDecorator implements Tocador{

    private Tocador tocador;
    private final Map<String, Integer> artistas = new HashMap<>();

    public ArtistaMaisTocadoDecorator(Tocador tocador){
        this.tocador = tocador;
    }
    @Override
    public void tocarMusica(Musica musica) {
        tocador.tocarMusica(musica);
        artistas.merge(musica.artista(), 1, Integer::sum);
    }

    public String artistaMaisTocado(){
        return artistas.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Nenhum artista por enquanto");
    }
}
