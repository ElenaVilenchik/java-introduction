package telran.numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class AnagramTest {

	@Test
	void testIsAnagram() {
		assertTrue(Anagram.isAnagram("anagramm", "nagarmam"));
		assertTrue(Anagram.isAnagram("aaanagramm", "nagarmmaaa"));
		assertTrue(Anagram.isAnagram("AnagraMm", "grmmNaaa"));
		assertFalse(Anagram.isAnagram("anagramm", "nagaraZm"));
		assertFalse(Anagram.isAnagram("anag", "nagaramm"));
		assertFalse(Anagram.isAnagram("a", ""));
		assertFalse(Anagram.isAnagram("an121agramm", "an211agramm"));
		assertFalse(Anagram.isAnagram("!anagramm", "anagra.mm"));
	}
}
