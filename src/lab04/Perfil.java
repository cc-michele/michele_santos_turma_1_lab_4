package lab04;

public class Perfil {
	private String nomeUsuario;
	private Musiteca musiteca;
	
	public Perfil (String nomeUsuario){
		this.nomeUsuario = nomeUsuario;
		this.musiteca = new Musiteca();
		
	}
	
	public boolean adicionaAlbum(Album album) {
		return musiteca.addAlbum(album);
	}
}
