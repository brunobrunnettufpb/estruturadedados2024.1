package br.ufpb.dcx.bruno.exerc02.listencaddupla;

public class ListaDuplamenteEncadeada {
    private Node head;
    private Node tail;
    public int N;

    public void add(Node node) {
        if (head == null) head = node;
        else {
            Node atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = node;
            atual.proximo.anterior = atual;
        }

        N++;
    }

    //QUESTÃO 16
    public void addInicio(Node node) {
        if (head == null) head = node;
        else {
            Node antigo = head;
            antigo.anterior = node;
            node.proximo = antigo;
            head = node;
        }

        N++;
    }

    //QUESTÃO 17
    public Node procurar(int dado) {
        Node node = null;

        if (head != null) {
            Node atual = head;

            if (atual.dado == dado) node = atual;
            else {
                while (atual.proximo != null) {
                    atual = atual.proximo;
                    if (atual.dado == dado) node = atual;
                }
            }
        }

        return node;
    }

    //QUESTÃO 18
    public void remove(Node node) {
        if (head != null) {
            if (head.equals(node)) head = head.proximo;
            else {
                Node atual = head;
                while (atual.proximo != null) {
                    atual = atual.proximo;
                    if (atual.dado == node.dado) {

                        N--;
                    }
                }
            }
        }
    }
}
