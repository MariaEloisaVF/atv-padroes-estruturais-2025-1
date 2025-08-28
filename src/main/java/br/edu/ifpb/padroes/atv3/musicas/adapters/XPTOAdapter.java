package br.edu.ifpb.padroes.atv3.musicas.adapters;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.xpto.ClientHttpXPTO;
import br.edu.ifpb.padroes.atv3.musicas.xpto.Song;

import java.util.List;

public class XPTOAdapter implements MusicTarget {
    private final ClientHttpXPTO cliente;

    public XPTOAdapter(ClientHttpXPTO cliente){
        this.cliente = cliente;
    }
    @Override
    public List<Musica> listar() {
        List<Song> songs = cliente.findAll();
        return songs.stream()
                .map(song -> new Musica(
                        song.id(),
                        song.title(),
                        song.artist(),
                        song.year(),
                        song.genre()
                )).toList();
    }
}
