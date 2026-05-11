package padroescomportamentais.mediator;

public class Ouvidoria {

	private static final Ouvidoria instancia = new Ouvidoria();

	private Ouvidoria() {
	}

	public static Ouvidoria getInstancia() {
		return instancia;
	}

	public String receberElogioBiblioteca(String mensagem) {
		return "A Ouvidoria agradece seu contato.\n"
				+ "A Biblioteca respondeu sua demanda conforme mensagem a seguir.\n"
				+ ">>" + Biblioteca.getInstancia().receberElogio(mensagem);
	}

	public String receberReclamacaoBiblioteca(String mensagem) {
		return "A Ouvidoria agradece seu contato.\n"
				+ "A Biblioteca respondeu sua demanda conforme mensagem a seguir.\n"
				+ ">>" + Biblioteca.getInstancia().receberReclamacao(mensagem);
	}

	public String receberSugestaoBiblioteca(String mensagem) {
		return "A Ouvidoria agradece seu contato.\n"
				+ "A Biblioteca respondeu sua demanda conforme mensagem a seguir.\n"
				+ ">>" + Biblioteca.getInstancia().receberSugestao(mensagem);
	}
}

