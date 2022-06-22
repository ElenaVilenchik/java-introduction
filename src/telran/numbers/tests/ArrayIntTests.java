package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.ArrayInt;

class ArrayIntTests {

	@Test
	void referenceTest() {
		int ar[] = {1, 2, 3, 4};
		int ar1[] = ar;
		ar1[1] = 100;
		assertEquals(100,ar[1]);
	}
	
	
	@Test
	void addNumberTest() {
		int expected[] = {1, 2, -10, 20};
		int ar[] = {1, 2, -10};
		
		assertArrayEquals(expected,ArrayInt.addNumber(ar,20));
		assertArrayEquals(expected,ArrayInt.addNumberQuickly(ar,20));
	}
	

	@Test
	void insertNumberTest() {
		int expected[] = {1, 2, -10, 20};
		int ar[] = {1, 2, 20};
		assertArrayEquals(expected, ArrayInt.insertNumber(ar, 2, -10));	
	}
	
	
	@Test
	void removeNumberTest() {
		int expected1[] = {1, 20};
		int expected2[] = {2, 20};
		int expected3[] = {1, 2};
		int ar[] = {1, 2, 20};
		assertArrayEquals(expected1, ArrayInt.removeNumber(ar, 1));
		assertArrayEquals(expected2, ArrayInt.removeNumber(ar, 0));
		assertArrayEquals(expected3, ArrayInt.removeNumber(ar, 2));
}
	
	
	@Test
	void indexOfTest() {
		int ar[] = {1, 2, 20, 2};
		assertEquals(1, ArrayInt.indexOf(ar, 2));
		assertEquals(0, ArrayInt.indexOf(ar, 1));
		assertEquals(-1, ArrayInt.indexOf(ar, 10));
	}
	
	
	@Test
	void maxSubsequenceLengthTest() {
				int ar1[] = {1,3,3,2,8,8,8,5,6,6};
				int ar2[] = {1,1,1,1,3,3,2,8,8,8,5,6,6};
				int ar3[] = {1,3,3,2,8,5,6,6,6,6,6,6,6};
				int ar4[] = {1,2,3,4,8,5,6,9,11,6,12,6,14};
				int ar5[] = {};
				int ar6[] = {1};
							
		assertEquals(3,ArrayInt.maxSubsequenceLength(ar1));
		assertEquals(4,ArrayInt.maxSubsequenceLength(ar2));
		assertEquals(7,ArrayInt.maxSubsequenceLength(ar3));
		assertEquals(1,ArrayInt.maxSubsequenceLength(ar4));
		assertEquals(0,ArrayInt.maxSubsequenceLength(ar5));
		assertEquals(1,ArrayInt.maxSubsequenceLength(ar6));
	}
}