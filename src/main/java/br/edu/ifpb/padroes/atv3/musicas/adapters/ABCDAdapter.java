package br.edu.ifpb.padroes.atv3.musicas.adapters;

import br.edu.ifpb.padroes.atv3.musicas.abcd.ClienteHttpABCD;
import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;

import java.util.List;

public class ABCDAdapter implements MusicTarget {
    private final ClienteHttpABCD cliente;

    public ABCDAdapter(ClienteHttpABCD cliente){
        this.cliente = cliente;
    }
    @Override
    public List<Musica> listar() {
        return cliente.listarMusicas();
    }
}
