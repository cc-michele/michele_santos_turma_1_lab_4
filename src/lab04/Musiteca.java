package lab04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

public class Musiteca {
	private Set<Album> meusAlbuns = new HashSet<Album>();
	private Set<Album> albunsFavoritos = new HashSet<Album>();
	private HashMap <String, Playlist> playlist = new HashMap<String, Playlist>();
	int qtdFavoritos, qtdAlbuns;

	public boolean addAlbum(Album alb) {
		if (alb == null ){
			return false;
		}
		if (meusAlbuns.add(alb)) {
			return true;
		}
		return false;
	}
	public boolean addAlbum(String artista, String titulo, int ano) throws Exception {
		Album alb = new Album(artista, titulo, ano);
		if (meusAlbuns.add(alb))
			return true;
		return false;
	}

	public boolean contemAlbum(Album alb) {
		if (meusAlbuns.contains(alb)) {
			return true;
		}

		return false;
	}
	
	public boolean removeAlbum(Album alb) {
		if (alb == null) {
			return false;
		}
		return meusAlbuns.remove(alb);
	}

	public boolean removeAlbum(String tituloAlbum) {
		for (Album album : meusAlbuns) {
			if (album.getTitulo().equals(tituloAlbum)) {
				meusAlbuns.remove(album);
				return true;
			}
		}
		return false;

	}


	public boolean addAosFavoritos(Album alb) {
		if (alb == null) {
			return false;
		} else if (contemAlbum(alb) && !albunsFavoritos.contains(alb)) {
			albunsFavoritos.add(alb);
			return true;

		}
		return false;
	}
	

	public boolean addAosFavoritos(String tituloAlbum) {
		for (Album album : albunsFavoritos) {
			if (album.getTitulo().equals(tituloAlbum)) {
				albunsFavoritos.add(album);
				return true;
			}
		}
		return false;
	}

	public boolean removeDosFavoritos(Album alb){
		if(alb == null){
			return false;
		}
		return albunsFavoritos.remove(alb);
	}
	
	public boolean removeDosFavoritos(String tituloAlbum){
		for (Album album : albunsFavoritos) {
			if (album.getTitulo().equals(tituloAlbum)) {
				albunsFavoritos.remove(album);
				return true;
			}
		}
		return false;
	}

	
	public int getQtdFavoritos() {

		qtdFavoritos = albunsFavoritos.size();

		return qtdFavoritos;
	}

	public int getQtdAlbuns() {

		this.qtdAlbuns = meusAlbuns.size();

		return qtdAlbuns;
	}

	public boolean criaPlaylist(String nomePlaylist) throws Exception {
		if (nomePlaylist == null || nomePlaylist.trim().isEmpty()){
			return false;
		}
		else if (!contemPlaylist(nomePlaylist)) {
			
			Playlist playlist = new Playlist(nomePlaylist);
			
			 this.playlist.put(nomePlaylist, playlist);
			return true;
		}

		return false;
	}

	public boolean contemPlaylist(String nomePlaylist) {
		if ((playlist.containsKey(nomePlaylist))) {
			return true;
		}
		return false;
	}

	public boolean addNaPlaylist(String nomePlaylist, String nomeAlbum, int faixa) throws Exception {

		if (!playlist.containsKey(nomePlaylist)) {
			return false;
		}
		Iterator<Album> it = meusAlbuns.iterator();
		while (it.hasNext()) {
			Album alb = (Album) it.next();
			playlist.get(nomePlaylist).adicionaMusica(alb.getMusica((faixa)));
			return true;
		}
		return false;
	}

	public int getTamPlaylist(String nomePlaylist) {

		return playlist.get(nomePlaylist).getTamanho();
	}

	public boolean contemNaPlaylist(String nomePlaylist, String nomeMusica) {

		if (contemPlaylist(nomePlaylist)){
			return playlist.get(nomePlaylist).contemMusica(nomeMusica);
		}
		
		return false;
	}
}
