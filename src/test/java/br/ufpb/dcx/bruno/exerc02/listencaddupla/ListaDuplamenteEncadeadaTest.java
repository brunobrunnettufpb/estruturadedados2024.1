package br.ufpb.dcx.bruno.exerc02.listencaddupla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaDuplamenteEncadeadaTest {
    @Test
    public void testaListaDupla() {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.add(5);
        lista.add("Dez");
        lista.add(10);
        lista.add(20);
        lista.add(50);
        lista.addInicio("Cem");
        System.out.println(lista);
        assertEquals(6, lista.size());

        System.out.println("Pegou: " + lista.get(10));

        System.out.println("Pegou e removeu: " + lista.getAndRemove(20));
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Lista: " + lista);
    }
}
