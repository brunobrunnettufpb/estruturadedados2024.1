package br.ufpb.dcx.bruno.exerc02.listaduplasentinela;

public class ListaDuplamenteEncadeada<Dado> {
    private Node current;
    private Node sentry;
    private int n;

    public ListaDuplamenteEncadeada() {
        sentry = new Node(null);
        sentry.next = sentry;
        sentry.prev = sentry;
        n = 0;
    }

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

        newNode.next = sentry;
        newNode.prev = sentry.prev;
        sentry.prev.next = newNode;
        sentry.prev = newNode;

        n++;
    }

    //QUESTÃO 20: Inserir no início de uma lista duplamente encadeada com sentinela, informe se escolheu usar uma ou duas sentinelas.
    public void addInicio(Dado dado) {
        Node newNode = new Node(dado);

        newNode.next = sentry.next;
        newNode.prev = sentry;
        sentry.next = newNode;
        sentry.next.prev = newNode;

        n++;
    }

    //QUESTÃO 21: Procurar um dado dentro de uma lista duplamente encadeada com sentinelas. Informe se escolheu usar uma ou duas sentinelas.
    public Dado get(Dado dado) {
        if (sentry.next == null) return null;
        else {
            current = sentry.next;
            while (current != null && current != sentry && current.dado != dado) current = current.next;

            if (current == null || current == sentry) return null;
            return current.dado;
        }
    }

    //QUESTÃO 22: Procurar um dado dentro de uma lista duplamente encadeada com sentinelas e removê-lo da lista.
    //QUESTÃO 23: Procurar umd ado dentro de uma lista duplamente encadeada com sentinelas e mover o dado para o início da lista.

    public int size() { return n; }

    public String toString() {
        current = sentry.next;
        String str = "";

        while (current != null && current != sentry) {
            str += (current.dado + " ");
            current = current.next;
        }

        return str;
    }
}
