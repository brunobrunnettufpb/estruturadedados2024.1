package br.ufpb.dcx.bruno.exerc02.listencadsimples;

public class ListaSimplesmenteEncadeada {
    Node head;

    public void add(int dado) {
        Node newNode = new Node(dado);

        if (head == null) head = newNode;
        else {
            Node atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = newNode;
        }
    }

    public void printList() {
        Node atual = head;

        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
    }
}

/*public class SimpleLinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) head = newNode;
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}*/
