package br.ufpb.dcx.bruno.exerc02.listencadsimples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListaSimplesmenteEncadeadaTest {
    @Test
    void testaListaSimples() {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada<>();

        //lista.add(5);
        //lista.add("Dez");
        //lista.add(10);
        //lista.add(20.0);
        //lista.add(50);
        lista.addInicio(100);
        System.out.println(lista);
        //assertEquals(2, lista.size());

        System.out.println("Pegou: " + lista.get(50));

        System.out.println("Pegou e removeu: " + lista.getAndRemove(5));
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Lista: " + lista);

    }
}
