package lab04;

public class Perfil {
	private String nomeUsuario;
	private Musiteca musitecaUsuario;

	public Perfil(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
		this.musitecaUsuario = new Musiteca();
	}

	public boolean adicionaAlbum(Album album) {
		try {
			return musitecaUsuario.addAlbum(album);
		} catch (Exception e) {
			System.out.println("Erro na adicao do album");
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean adicionaAlbum(String artista, String titulo, int ano) {
		try {
			return musitecaUsuario.addAlbum(artista, titulo, ano);
		} catch (Exception e) {
			System.out.println("Erro na adicao do album");
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean removeAlbum(Album album) {
		try {
			return musitecaUsuario.removeAlbum(album);
		} catch (Exception e) {
			System.out.println("Erro na remocao do album");
		    System.out.println(e.getMessage());
			
			return false;
		}
	}

	public boolean removeAlbum(String tituloAlbum) {
		try {
			return musitecaUsuario.removeAlbum(tituloAlbum);
		} catch (Exception e) {
			System.out.println("Erro na remocao do album");
		    System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean adicionaFavorito(Album album) {
		try {
			return musitecaUsuario.addAosFavoritos(album);
		} catch (Exception e) {
			System.out.println("Erro ao favoritar album");
		    System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean adicionaFavorito(String tituloAlbum) {
		try {
			return musitecaUsuario.addAosFavoritos(tituloAlbum);
		} catch (Exception e) {
			System.out.println("Erro ao favoritar album");
		    System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean removeFavorito(Album album) {
		try {
			return musitecaUsuario.removeDosFavoritos(album);
		} catch (Exception e) {
			System.out.println("Erro ao remover album dos favoritos");
		    System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean removeFavorito(String tituloAlbum) {
		try {
			return musitecaUsuario.removeDosFavoritos(tituloAlbum);
		} catch (Exception e) {
			System.out.println("Erro ao remover album dos favoritos");
		    System.out.println(e.getMessage());
			return false;
		}
	}

	public int getQtdAlbuns() {
		return musitecaUsuario.getQtdAlbuns();
	}

	public int getQtdFavoritos() {
		return musitecaUsuario.getQtdFavoritos();
	}

	public boolean criaPlaylist(String nomePlaylist) {
		try {
			return musitecaUsuario.criaPlaylist(nomePlaylist);
		} catch (Exception e) {
			System.out.println("Erro ao criar playlist");
		    System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean adicionaNaPlaylist(String nomePlaylist, String nomeAlbum, int faixaAlbum) {
		try {
			return musitecaUsuario.addNaPlaylist(nomePlaylist, nomeAlbum, faixaAlbum);
		} catch (Exception e) {
			System.out.println("Erro ao adicionar musica na playlist.");
			System.out.println(e.getMessage());
			return false;
		}
	}


	public boolean buscaMusicaPlaylist(String nomePlaylist, String nomeMusica) {
		try {
			return musitecaUsuario.contemNaPlaylist(nomePlaylist, nomeMusica);
		} catch (Exception e) {
			System.out.println("Erro ao pesquisar musica");
		    System.out.println(e.getMessage());
			return false;
		}
	}

	
	public boolean buscaPlaylist(String nomePlaylist) {
		return musitecaUsuario.contemPlaylist(nomePlaylist);
	}

	public int getTamanhoPlaylist(String nomePlaylist) {
		try {
			return musitecaUsuario.getTamPlaylist(nomePlaylist);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}

	}

	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	public void setNomeUsuario(String novoNome) {
		this.nomeUsuario = novoNome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((musitecaUsuario == null) ? 0 : musitecaUsuario.hashCode());
		result = prime * result + ((nomeUsuario == null) ? 0 : nomeUsuario.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Perfil)) {
			return false;
		}
		Perfil perfil = (Perfil) obj;
		return (perfil.getNomeUsuario().equalsIgnoreCase(this.nomeUsuario)
					&& perfil.musitecaUsuario.equals(this.musitecaUsuario)); 
		}
	
}
