package br.ufpb.dcx.bruno.exerc02.listencadsimples;

public class ListaSimplesmenteEncadeada<Dado> {
    private Node head = null;
    private Node tail = null;
    private Node current;
    private int n = 0;


    private class Node {
        private Dado dado; //DADO QUE O NÓ RECEBE
        private Node next = null; //VAI INDICAR QUAL O PRÓXIMO DESSE NÓ

        private Node(Dado dado) {
            this.dado = dado; //ADICIONA
        }
    }

    public void add(Dado dado) { //ADD NO FIM DA LISTA
        Node newNode = new Node(dado);

        current = tail;
        tail = newNode;

        if (current == null) head = tail;
        else current.next = tail;

        n++;
    }

    //QUESTÃO 13: Inserir no início de uma lista simplesmente encadeada.
    public void addInicio(Dado dado) { //ADD NO INÍCIO DA LISTA
        Node newNode = new Node(dado);

        current = head;
        head = newNode;

        if (current == null) tail = head;
        else head.next = current;

        n++;
    }

    //QUESTÃO 14: Procurar um dado dentro de uma lista simplesmente encadeada.
    public Dado get(Dado dado) {
        current = head;

        while (current != null && current.dado != dado) current = current.next;

        if (current == null) return null;
        return current.dado;
    }

    //QUESTÃO 15: Procurar um dado dentro de uma lista simplesmente encadeada e removê-lo da lista.
    public Dado getAndRemove(Dado dado) {
        if (head == null) return null;

        current = head;
        if (head.dado == dado) {
            head = head.next;
            n--;
            return current.dado;
        }
        else {
            if (head == tail) {
                head = null;
                tail = null;
                n--;
                return current.dado;
            }
            else {
                while (current.next != null && current.next.dado != dado) current = current.next;
                if (current.next != null) {
                    Dado retornaDado;
                    if (current.next == tail) {
                        tail = current;
                        retornaDado = tail.dado;
                    }
                    else {
                        retornaDado = current.next.dado;
                        current.next = current.next.next;
                    }

                    n--;
                    return retornaDado;
                }
            }
        }

        return null;
    }

    public boolean isEmpty() { return n == 0; }
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