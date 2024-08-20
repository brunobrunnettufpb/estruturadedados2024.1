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

        newNode.prev = tail;
        if (tail == null) head = newNode;
        else tail.next = newNode;
        tail = newNode;

        n++;
    }

    //QUESTÃO 16: Inserir no início de uma lista duplamente encadeada.
    public void addInicio(Dado dado) {
        Node newNode = new Node(dado);

        newNode.next = head;
        if (head == null) tail = newNode;
        else head.prev = newNode;
        head = newNode;

        n++;
    }


    //QUESTÃO 17: Procurar um dado dentro de uma lista duplamente encadeada sem sentinelas.
    public Dado get(Dado dado) {
        if (head == null) return null;
        else {
            current = head;

            while (current != null && current.dado != dado) {
                current = current.next;
                /*System.out.println("DEBUG DADO: " + current.dado);
                System.out.println("DEBUG ATUAL: " + current);
                System.out.println("DEBUG PROXIMO: " + current.next);*/
            }
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
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                else if (current == tail){
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                }
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

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
