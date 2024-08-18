package br.ufpb.dcx.bruno.exerc02.listencadsimples;

import org.junit.jupiter.api.Test;

public class ListaSimplesmenteEncadeadaTest {
    @Test
    void testaListaSimples() {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada<>();

        Node node1 = new Node("Teste");
        Node node2 = new Node(10);
        Node node3 = new Node(20.0);
        Node node4 = new Node(40);
        Node node5 = new Node(100);

        lista.add(node1);
        lista.add(node2);
        lista.add(node3);
        lista.add(node4);
        lista.addInicio(node5);

        System.out.println(lista);
        lista.remove(20);
    }
}
