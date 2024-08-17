package br.ufpb.dcx.bruno.exerc02.listencadsimples;

import org.junit.jupiter.api.Test;

public class ListaSimplesmenteEncadeadaTest {
    @Test
    void testaListaSimples() {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();

        Node node1 = new Node(5);
        Node node2 = new Node(10);
        Node node3 = new Node(20);
        Node node4 = new Node(40);
        Node node5 = new Node(100);

        lista.add(node1);
        lista.add(node2);
        lista.add(node3);
        lista.add(node4);
        lista.addInicio(node5);

        lista.printList();

        System.out.println();
        lista.printIfExist(new Node(20));

        System.out.print("\n\n");
        lista.remove(new Node(20));
        lista.printList();
    }
}
