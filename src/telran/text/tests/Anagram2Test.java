package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.Anagram2;
import telran.text.Strings;

class Anagram2Test {
		@Test
		void testIsAnagram() {
			assertTrue(Anagram2.isAnagram("anagramm", "nagarmam"));
			assertTrue(Anagram2.isAnagram("aaanagramm", "nagarmmaaa"));
			assertFalse(Anagram2.isAnagram("AnagraMm", "grNnnaaa"));
			assertFalse(Anagram2.isAnagram("anagramm", "nagaraZm"));
			assertFalse(Anagram2.isAnagram("anag", "nagaramm"));
			assertFalse(Anagram2.isAnagram("a", "!"));
			assertFalse(Anagram2.isAnagram("!", "s"));
			assertFalse(Anagram2.isAnagram("an121agramm", "an211agramm"));
			assertFalse(Anagram2.isAnagram("!anagramm", "anagram"));
		}
		void isAnagramTests() {
			String str1 = "Hello";
			String str2 = "Helll";
			String str3 = "eloHl";
			String str4 = "Hel";
			assertTrue(Anagram2.isAnagram(str1, str3));
			assertFalse(Anagram2.isAnagram(str1, str2));
			assertFalse(Anagram2.isAnagram(str1, str4));
			assertTrue(Anagram2.isAnagram(str1, str1));
		}
	}