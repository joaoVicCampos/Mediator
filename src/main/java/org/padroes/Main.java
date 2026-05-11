package org.padroes;

import padroescomportamentais.mediator.Leitor;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();

        System.out.println(leitor.elogiarBiblioteca("Atendimento excelente"));
        System.out.println();
        System.out.println(leitor.reclamarBiblioteca("Falta de livros de arquitetura"));
        System.out.println();
        System.out.println(leitor.sugerirBiblioteca("Estender horario de estudo"));
    }
}