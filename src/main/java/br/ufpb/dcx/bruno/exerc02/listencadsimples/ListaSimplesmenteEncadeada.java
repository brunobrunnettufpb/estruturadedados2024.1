package br.ufpb.dcx.bruno.exerc02.listencadsimples;

public class ListaSimplesmenteEncadeada {
    Node head;

    public void add(Node newNode) {
        if (head == null) head = newNode;
        else {
            Node atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = newNode;
        }
    }

    //QUESTÃO 13
    public void addInicio(Node newNode) {

        if (head == null) head = newNode;
        else {
            newNode.proximo = head;
            head = newNode;
        }
    }

    //QUESTÃO 14
    public Node procurar(Node node) {
        Node atual = head;

        while (atual != null) {
            if (atual.dado == node.dado) return atual;
            atual = atual.proximo;
        }

        return null;
    }

    //QUESTÃO 15
    public void remove(Node node) {
        if (head != null) {
            if (head.dado == node.dado) head = head.proximo;
            else {
                Node atual = head;

                while (atual.proximo != null) {
                    if (atual.proximo.dado == node.dado) atual.proximo = atual.proximo.proximo;
                    else atual = atual.proximo;
                }
            }
        }
    }

    public String toString() {
        Node atual = head;
        String str = "";

        while (atual != null) {
            str += (atual.dado + " ");
            atual = atual.proximo;
        }

        return str;
    }
}