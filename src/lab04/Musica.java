package lab04;



public class Musica {

	String titulo;
	int duracao;
	String genero;

	public int getDuracao() {
		return duracao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public Musica(String titulo, int duracao, String genero) throws Exception {

		stringInvalido(titulo);
		stringInvalido(genero);
		duracaoInvalida(duracao);

		this.titulo = titulo;
		this.duracao = duracao;
		this.genero = genero;
	}

	private void stringInvalido(String s) throws Exception {
		if (s == null || s.trim().equals("")) {
			throw new Exception("String invalida");
		}

	}

	private void duracaoInvalida(int i) throws Exception {

		if (i < 0 || i == 0) {
			throw new Exception("Duracao invalida");
		}
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Musica))
			return false;

		Musica musica = (Musica) obj;
		return titulo.equals(musica.getTitulo()) && duracao == (musica.getDuracao());
	}

}
