package padroescomportamentais.mediator;

public class Biblioteca implements Setor {

    private static final Biblioteca instancia = new Biblioteca();

    private Biblioteca() {
    }

    public static Biblioteca getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "A Biblioteca vai revisar a reclamacao: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "A Biblioteca agradece a mensagem: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "A Biblioteca vai avaliar a sugestao: " + mensagem;
    }
}

