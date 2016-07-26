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

	public Album(String artista, String titulo, int anoLancamento) {
		super();
		this.artista = artista;
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
	}

	public boolean adicionaMusica(Musica m) {
		if (!listaDeMusicas.contains(m)) {
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
		return quantidadeDeFaixas = listaDeMusicas.size();

	}

	public int getDuracaoTotal() {
		
		
		
		for (int i = 0; i < listaDeMusicas.size(); i++) {
			duracaoTotal += listaDeMusicas.get(i).getDuracao();

		} 
		return duracaoTotal;
	}

	public void removeMusica(int faixa) {
		
		listaDeMusicas.remove((faixa-1));

	}

	public Musica getMusica(String titulo) {
		Musica m = null;
		for (int i = 0; i < listaDeMusicas.size(); i++) {
			if (listaDeMusicas.get(i).getTitulo().equals(titulo)){
				m = listaDeMusicas.get(i);
			}
			
		}
		
		return m;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (anoLancamento != other.anoLancamento)
			return false;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	
	

}
