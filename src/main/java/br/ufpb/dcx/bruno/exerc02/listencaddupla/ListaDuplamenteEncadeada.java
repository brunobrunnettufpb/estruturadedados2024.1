package br.ufpb.dcx.bruno.exerc02.listencaddupla;

import java.util.Iterator;

public class ListaDuplamenteEncadeada<Item> {
    private Node head;
    private Node tail;
    public int n;

    private class Node {
        private Item item;
        private Node next;
        private Node prev;
    }

    public void add(Node node) {
        if (head == null) head = node;
        else {
            Node atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }

            atual.next = node;
            atual.next.prev = atual;
        }

        n++;
    }

    //QUESTÃO 16

    //QUESTÃO 17


    //QUESTÃO 18
}
