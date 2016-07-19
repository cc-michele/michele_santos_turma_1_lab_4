package lab04;

//Código gerado pelos monitores da disciplina e revisado pelos professores


import static org.junit.Assert.*;
import org.junit.Test;

import lab04.Musica;

public class MusicaTest {

	@Test
	public void testMusica() {
		Musica chandelier = new Musica("Chandelier", 3, "Pop");
		Musica elasticHeart = new Musica("Elastic Heart", 3, "Pop");
		Musica cellophane = new Musica("Cellophane", 4, "Pop");

		assertEquals("Chandelier", chandelier.getTitulo());
		assertEquals(3, chandelier.getDuracao());
		assertEquals("Pop", chandelier.getGenero());

		assertEquals("Elastic Heart", elasticHeart.getTitulo());
		assertEquals(3, elasticHeart.getDuracao());
		assertEquals("Pop", elasticHeart.getGenero());

		assertEquals("Cellophane", cellophane.getTitulo());
		assertEquals(4, cellophane.getDuracao());
		assertEquals("Pop", cellophane.getGenero());

		Musica chandelierRemix = new Musica("Chandelier", 3, "Pop");
		assertTrue(chandelier.equals(chandelierRemix));
		assertFalse(chandelier.equals(cellophane));
	}



	@Test
	public void testEquals() {
		Musica chandelier = new Musica("Chandelier", 3, "Pop");
		Musica elasticHeart = new Musica("Elastic Heart", 3, "Pop");
		Musica cellophane = new Musica("Cellophane", 4, "Pop");
		

		assertTrue(chandelier.equals(new Musica("Chandelier", 3, "Pop")));
		assertTrue(chandelier.equals(new Musica("Chandelier", 3, "Pop-rock")));
		assertNotEquals(elasticHeart, chandelier);
		assertNotEquals(elasticHeart, cellophane);
		
	}
}