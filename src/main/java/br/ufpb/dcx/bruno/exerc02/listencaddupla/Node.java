package br.ufpb.dcx.bruno.exerc02.listencaddupla;

public class Node {
    public int dado;
    public Node anterior;
    public Node proximo;

    public Node(int dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}
