package br.edu.ifpb.padroes.atv3.musicas.proxy;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.adapters.MusicTarget;

import java.util.List;

public class MusicaServiceProxy implements MusicTarget {
    private final MusicTarget musicTarget;
    private List<Musica> cache;

    public MusicaServiceProxy(MusicTarget musicTarget){
        this.musicTarget = musicTarget;
    }
    @Override
    public List<Musica> listar() {
        if(cache != null) return cache;
        cache = musicTarget.listar();
        return cache;
    }
}
