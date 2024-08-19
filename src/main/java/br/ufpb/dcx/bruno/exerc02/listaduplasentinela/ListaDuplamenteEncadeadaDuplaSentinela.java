package br.ufpb.dcx.bruno.exerc02.listaduplasentinela;

public class ListaDuplamenteEncadeadaDuplaSentinela<Dado> {


    private class Node {
        private Dado dado;
        private Node next = null;
        private Node prev = null;

        private Node(Dado dado) {
            this.dado = dado;
        }
    }
}
