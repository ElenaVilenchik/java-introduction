package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.Anagram2;

class Anagram2Test {
		@Test
		void testIsAnagram() {
			assertTrue(Anagram2.isAnagram("anagramm", "nagarmam"));
			assertTrue(Anagram2.isAnagram("aaanagramm", "nagarmmaaa"));
			assertTrue(Anagram2.isAnagram("AnagraMm", "grmmNaaa"));
			assertFalse(Anagram2.isAnagram("anagramm", "nagaraZm"));
			assertFalse(Anagram2.isAnagram("anag", "nagaramm"));
			assertFalse(Anagram2.isAnagram("a", ""));
			assertFalse(Anagram2.isAnagram("a", "sss"));
			assertFalse(Anagram2.isAnagram("an121agramm", "an211agramm"));
			assertFalse(Anagram2.isAnagram("!anagramm", "anagram"));
		}
	}