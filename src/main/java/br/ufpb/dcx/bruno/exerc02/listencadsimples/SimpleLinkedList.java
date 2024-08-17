package br.ufpb.dcx.bruno.exerc02.listencadsimples;

public class SimpleLinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) head = newNode;
        else {
            Node current = head;
            while (current != null) {
                current = current.next;
            }
            current.next = newNode;

            //teste
        }
    }
}
