package padroescomportamentais.mediator;

public class Pessoa {

	public String elogiarBiblioteca(String mensagem) {
		return Ouvidoria.getInstancia().receberElogioBiblioteca(mensagem);
	}

	public String reclamarBiblioteca(String mensagem) {
		return Ouvidoria.getInstancia().receberReclamacaoBiblioteca(mensagem);
	}

	public String sugerirBiblioteca(String mensagem) {
		return Ouvidoria.getInstancia().receberSugestaoBiblioteca(mensagem);
	}
}

