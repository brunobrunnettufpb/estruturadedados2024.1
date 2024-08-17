package br.ufpb.dcx.bruno.exerc02.listencadsimples;

import org.junit.jupiter.api.Test;

public class ListaSimplesmenteEncadeadaTest {
    @Test
    void testaListaSimples() {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();

        lista.add(5);
        lista.add(10);
        lista.add(20);
        lista.add(40);

        lista.printList();
    }
}
