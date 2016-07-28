package lab04;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {

	String artista;
	String titulo;
	int anoLancamento;
	ArrayList<Musica> listaDeMusicas = new ArrayList<Musica>();
	int duracaoTotal, quantidadeDeFaixas;
	Iterator<Musica> it = listaDeMusicas.iterator();

	private String getTitulo() {

		return titulo;
	}

	private String getArtista() {
		return artista;
	}

	private int getAnoLancamento() {
		return anoLancamento;
	}

	public Musica getMusica(String titulo) throws Exception {

		Musica aux = null;
		for (Musica musica : listaDeMusicas) {
			if (musica.getTitulo().equals(titulo)) {
				aux = musica;
			}
		}
		return aux;
	}

	public Album(String artista, String titulo, int anoLancamento) throws Exception {
		Musica aux = new Musica("Titulo", 1, "genero");
		listaDeMusicas.add(0, aux);

		artistaInvalido(artista);
		this.artista = artista;
		tituloInvalido(titulo);
		this.titulo = titulo;
		anoInvalido(anoLancamento);
		this.anoLancamento = anoLancamento;
	}

	private void artistaInvalido(String s) throws Exception {
		if (s == null || s.trim().equals("")) {
			throw new Exception("Artista do album nao pode ser nulo ou vazio.");
		}

	}

	private void tituloInvalido(String s) throws Exception {
		if (s == null || s.trim().equals("")) {
			throw new Exception("Titulo do album nao pode ser nulo ou vazio.");

		}
	}

	private void anoInvalido(int ano) throws Exception {
		if (ano < 1900) {
			throw new Exception("Ano de lancamento do album nao pode ser inferior a 1900.");

		}
	}

	public boolean adicionaMusica(Musica m) {
	
		if (m == null) {
			return false;
		}
		else if (!listaDeMusicas.contains(m)) {
			listaDeMusicas.add(m);
			return true;
		}

		return false;
	}

	public boolean contemMusica(String titulo) {

		for (int i = 0; i < listaDeMusicas.size(); i++) {
			if (listaDeMusicas.get(i).titulo.equals(titulo)) {

				return true;

			}

		}

		return false;
	}

	public int quantidadeFaixas() {
		return quantidadeDeFaixas = (listaDeMusicas.size()-1);

	}

	public int getDuracaoTotal() {

		for (Musica musica : listaDeMusicas) {

			duracaoTotal += musica.getDuracao();
		}
		duracaoTotal --;

		return duracaoTotal;
	}

	public void removeMusica(int faixa) {

		listaDeMusicas.remove((faixa));

	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Album))
			return false;
		Album album = (Album) obj;
		return artista.equals(album.getArtista()) && titulo.equals(getTitulo()) && anoLancamento == getAnoLancamento();
	}

}