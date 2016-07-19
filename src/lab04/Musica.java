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

	public Musica(String titulo, int duracao, String genero) {

		this.titulo = titulo;
		this.duracao = duracao;
		this.genero = genero;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Musica))
			return false;

		Musica musica = (Musica) obj;
		return titulo.equals(musica.getTitulo()) && duracao == (musica.getDuracao());
	}

}
