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

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + duracao; result = prime * result + ((titulo ==
	 * null) ? 0 : titulo.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return
	 * true; if (obj == null) return false; if (getClass() != obj.getClass())
	 * return false; Musica other = (Musica) obj; if (duracao != other.duracao)
	 * return false; if (titulo == null) { if (other.titulo != null) return
	 * false; } else if (!titulo.equals(other.titulo)) return false; return
	 * true; }
	 */

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Musica))
			return false;

		Musica musica = (Musica) obj;
		return titulo.equals(musica.getTitulo()) && duracao == (musica.getDuracao()) && genero.equals(musica.getGenero());
	}

}