package telran.text.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import telran.text.Strings;

class StringsClassTests {

	private static final int N_RUNS = 10000;
	private static final int N_STRINGS = 100;

	@Test
	void testMatches() {
		String[][] data = { 
				{ "David", "david", "match" }, 
				{ "Mark Mark Mark", "Mark", "match" },
				{ "John F", "John Fitzgerald", "match" },
				{ "F John", "Fitzgerald John", "match" },
				{ "John Fitzgerald", "John F", "match" },
				{ "John Fi", "John Fitzgerald", "no match" },
				{ "John K", "John Fitzgerald", "no match" }, 
				{ "Anna Maria", "Laura Maria", "no match" },
				{ "Anna Maria Magdalena", "Anna Magdalena", "match" },
				{ "Anna Maria Magdalena", "Maria Magdalena", "match" },
				{ "Anna Maria Magdalena", "Anna Maria Roberta", "no match" },
				{ "Anna Maria Magdalena", "Anna Magdalena Roberta", "no match" },
				{ "Anna Maria Magdalena", "Anna Magdalena Maria", "no match" }
				};
		for (int i = 0; i < data.length; i++) {
			assertEquals(Strings.matches(data[i][0], data[i][1]), data[i][2]);
		}
	}
	
	@Test
	void sortString() {
		String[] str3 = { "9", "250", "50", "123", "23", "9", "123", "50" };
		String[] expected3 = { "9", "9", "23", "50", "50", "123", "123", "250" };
		Strings.sortStringsAsNumbers(str3);
		assertArrayEquals(expected3, str3);

		String[] str1 = { "9", "250", "50", "123", "23", "5", "123", "0" };
		String[] expected1 = { "0", "5", "9", "23", "50", "123", "123", "250" };
		Strings.sortStringsAsNumbers(str1);
		assertArrayEquals(expected1, str1);

		String[] str2 = { "0" };
		String[] expected2 = { "0" };
		assertArrayEquals(expected2, str2);
	}

	@Test
	void deepCompareTest() {
		String str1 = "123,tT89";
		String str2 = "123,tT89";
		String str3 = "19";
		String str4 = "kugy";
		String str5 = "98Tt,321";
		String str6 = "";
		String str7 = "3,tT";
		int expected1[] = { 8, 0 };
		int expected2[] = { 1, 1 };
		int expected3[] = { 0, 8 };
		int expected4[] = { 0, 0 };
		int expected5[] = { 0, 4 };
		assertArrayEquals(expected1, Strings.deepNoRepeatedCompare(str1, str2));
		assertArrayEquals(expected2, Strings.deepNoRepeatedCompare(str1, str3));
		assertArrayEquals(expected3, Strings.deepNoRepeatedCompare(str1, str5));
		assertArrayEquals(expected4, Strings.deepNoRepeatedCompare(str1, str4));
		assertArrayEquals(expected4, Strings.deepNoRepeatedCompare(str1, str6));
		assertArrayEquals(expected5, Strings.deepNoRepeatedCompare(str1, str7));
		assertArrayEquals(expected2, Strings.deepNoRepeatedCompare(str3, str1));
	}

	@Test
	void joinTest() {
		String array[] = { "Hello", "Vasya" };
		String expected = "Hello Vasya";
		assertEquals(expected, Strings.join(array, " "));
	}

	@Test
	void joinPerformanceTest() {
		String array[] = getBigArray();
		for (int i = 0; i < N_RUNS; i++) {
			Strings.join(array, " ");
		}
	}

	private String[] getBigArray() {
		String res[] = new String[N_STRINGS];
		for (int i = 0; i < res.length; i++) {
			res[i] = "Hello";
		}
		return res;
	}
}