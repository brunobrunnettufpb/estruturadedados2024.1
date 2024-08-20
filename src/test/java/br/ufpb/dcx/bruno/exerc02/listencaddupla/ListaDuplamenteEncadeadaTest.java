package br.ufpb.dcx.bruno.exerc02.listencaddupla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaDuplamenteEncadeadaTest {
    @Test
    public void testaListaDupla() {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.add(20);
        lista.add(50);
        lista.addInicio("Cem");
        System.out.println(lista);
        System.out.println("Tamanho: " + lista.size());
        assertEquals(3, lista.size());

        System.out.println("Pegou: " + lista.get(50));

        System.out.println("Pegou e removeu: " + lista.getAndRemove(50));
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Lista: " + lista);

        System.out.println("Pegou e removeu: " + lista.getAndRemove("Cem"));
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Lista: " + lista);

        System.out.println("Pegou e removeu: " + lista.getAndRemove(20));
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Lista: " + lista);

    }
}
