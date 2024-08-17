package br.ufpb.dcx.bruno.exerc02.listencadsimples;

public class ListaSimplesmenteEncadeada {
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
