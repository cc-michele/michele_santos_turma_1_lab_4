package lab04;

import java.util.HashSet;

public class Playlist {

	private String nomePlaylist;
	private HashSet<Musica> musicasPlaylist = new HashSet<Musica>();

	public Playlist(String nomePlaylist) throws Exception {
		//verificaNome(nomePlaylist);
		this.nomePlaylist = nomePlaylist;
	}
	/*private void verificaNome(String nome) throws Exception {
		if (nomePlaylist == null || nomePlaylist.trim().equals("")) {
			System.out.println("entrou na exception");
			throw new Exception("Nome da playlist nao pode ser nulo ou vazio.");
		}

	}*/

	public String getNomePlaylist() {
		return this.nomePlaylist;
	}

	public Musica getMusica(String nomeMusica) {
		for (Musica musica : musicasPlaylist) {
			if (musica.getTitulo().equals(nomeMusica)) {
				return musica;
			}
		}
		return null;
	}

	public boolean adicionaMusica(Musica musica) {
		return this.musicasPlaylist.add(musica);
	}

	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}

	public boolean removeMusica(String nameMusic) {
		for (Musica musica : musicasPlaylist) {
			if (musica.getTitulo().equals(nameMusic)) {
				musicasPlaylist.remove(musica);
			}
		}
		return false;
	}

	public int getTamanho() {
		return musicasPlaylist.size();
	}

	public boolean contemMusica(String nameMusic) {
		for (Musica musica : this.musicasPlaylist) {
			if (musica.getTitulo().equalsIgnoreCase(nameMusic)) {
				return true;
			}
		}
		return false;
	}

}
