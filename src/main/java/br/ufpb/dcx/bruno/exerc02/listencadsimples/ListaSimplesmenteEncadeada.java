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

    public void printIfExist(Node node) {
        Node node2 = procurar(node);
        if (node2 != null) System.out.print(node.dado);
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
