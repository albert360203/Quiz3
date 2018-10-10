package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.Card;
import pkgCore.Deck;
import pkgException.DeckException;

class DeckTest {

	@Test
	void getRemaining_Test1() throws DeckException {
		Deck d1 = new Deck();
		Card c1 = d1.Draw();
		int i = d1.getRemaining(c1.geteRank());
		
		assertTrue(i==3);
	}
	
	@Test
	void getRemaining_Test2() throws DeckException {
		Deck d1 = new Deck();
		Card c1 = d1.Draw();
		int i = d1.getRemaining(c1.geteSuit());
		
		assertTrue(i==12);
	}

}
