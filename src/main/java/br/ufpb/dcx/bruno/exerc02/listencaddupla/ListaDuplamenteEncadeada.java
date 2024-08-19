package br.ufpb.dcx.bruno.exerc02.listencaddupla;

public class ListaDuplamenteEncadeada<Dado> {
    private Node head = null;
    private Node tail = null;
    private Node current;
    private int n = 0;

    private class Node {
        private Dado dado;
        private Node next = null;
        private Node prev = null;

        private Node(Dado dado) {
            this.dado = dado;
        }
    }

    public void add(Dado dado) {
        Node newNode = new Node(dado);

        if (head == null) head = newNode;
        else {
            current = head;
            while (current.next != null) current = current.next;
            newNode.prev = current;
            current.next = newNode;
        }

        n++;
    }

    //QUESTÃO 16: Inserir no início de uma lista duplamente encadeada.
    public void addInicio(Dado dado) {
        Node newNode = new Node(dado);

        if (head == null) head = newNode;
        else {
            current = head;

            current.prev = newNode;
            newNode.next = current;
            head = newNode;
        }

        n++;
    }


    //QUESTÃO 17: Procurar um dado dentro de uma lista duplamente encadeada sem sentinelas.
    public Dado get(Dado dado) {
        if (head == null) return null;
        else {
            current = head;

            while (current != null && current.dado != dado) current = current.next;
            if (current == null) return null;
            else return current.dado;
        }
    }

    //QUESTÃO 18: Procurar um dado dentro de uma lista duplamente encadeada sem sentinelas e removê-lo da lista.
    public Dado getAndRemove(Dado dado) {
        if (head == null) return null;
        else {
            current = head;

            while (current != null && current.dado != dado) current = current.next;
            if (current != null) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                n--;
                return current.dado;
            }
            else return null;
        }
    }

    public int size() { return n; }

    public String toString() {
        current = head;
        String str = "";

        while (current != null) {
            str += (current.dado + " ");
            current = current.next;
        }

        return str;
    }
}
