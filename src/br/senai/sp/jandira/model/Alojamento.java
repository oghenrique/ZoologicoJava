package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Alojamento {

    List<Mamifero> alojamentoMamimefero = new ArrayList<>();

    List<Felino> alojamentoFelino = new ArrayList<>();

    List<Ave> alojamentoAve = new ArrayList<>();

    public void adicionarAveAlojamento(Ave ave){
        alojamentoAve.add(ave);
    }

    public void adicionarMamiferoAlojamento(Mamifero mamifero){
        alojamentoMamimefero.add(mamifero);
    }
    public void adicionarFelinoAlojamento(Felino felino){
        alojamentoFelino.add(felino);
    }

}
