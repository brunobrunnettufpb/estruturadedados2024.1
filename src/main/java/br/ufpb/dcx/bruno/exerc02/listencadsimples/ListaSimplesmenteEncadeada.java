package br.ufpb.dcx.bruno.exerc02.listencadsimples;

public class ListaSimplesmenteEncadeada<Item> {
    private Node head;
    private Node tail;
    private Node atual;
    private int n = 0;


    private class Node {
        private Item item;
        private Node next = null;
        private Node prev = null;

        private Node(Item dado) {
            this.item = dado;
        }
    }

    public void add(Item item) {
        Node newNode = new Node(item);

        n++;
    }

    //QUESTÃO 13

    //QUESTÃO 14


    //QUESTÃO 15


    public String toString() {
        atual = head;
        String str = "";

        while (atual != null) {
            str += (atual.item + " ");
            atual = atual.next;
        }

        return str;
    }
}