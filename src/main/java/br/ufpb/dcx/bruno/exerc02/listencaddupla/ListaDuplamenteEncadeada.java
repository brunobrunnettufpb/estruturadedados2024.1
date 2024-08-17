package br.ufpb.dcx.bruno.exerc02.listencaddupla;

public class ListaDuplamenteEncadeada {
    public Node head;

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
    }

    //QUESTÃO 16
    public void addInicio(Node node) {
        if (head == null) head = node;
        else {
            Node atual = head;
            atual.anterior = node;
            node.proximo = atual;

            head = atual;
        }
    }

    //QUESTÃO 17
    public void procurar(Node node) {

    }

    //QUESTÃO 18
    public void remove(Node node) {

    }
}
