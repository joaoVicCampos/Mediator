package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeitorTest {

    @Test
    void deveElogiarBiblioteca() {
        Leitor leitor = new Leitor();
        assertEquals("A Ouvidoria agradece seu contato.\nA Biblioteca respondeu sua demanda conforme mensagem a seguir.\n"
                        + ">>A Biblioteca agradece a mensagem: Atendimento excelente",
                leitor.elogiarBiblioteca("Atendimento excelente"));
    }

    @Test
    void deveReclamarBiblioteca() {
        Leitor leitor = new Leitor();
        assertEquals("A Ouvidoria agradece seu contato.\nA Biblioteca respondeu sua demanda conforme mensagem a seguir.\n"
                        + ">>A Biblioteca vai revisar a reclamacao: Falta de livros de arquitetura",
                leitor.reclamarBiblioteca("Falta de livros de arquitetura"));
    }

    @Test
    void deveSugerirBiblioteca() {
        Leitor leitor = new Leitor();
        assertEquals("A Ouvidoria agradece seu contato.\nA Biblioteca respondeu sua demanda conforme mensagem a seguir.\n"
                        + ">>A Biblioteca vai avaliar a sugestao: Estender horario de estudo",
                leitor.sugerirBiblioteca("Estender horario de estudo"));
    }
}

