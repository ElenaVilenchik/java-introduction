package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.SubsequenceLength_NumberConvertor;

class TestsSubsequenceLength_NumberConvertor {

	@Test
	void maxSubsequenceLengthTest() {
				int ar1[] = {1,3,3,2,8,8,8,5,6,6};
				int ar2[] = {1,1,1,1,3,3,2,8,8,8,5,6,6};
				int ar3[] = {1,3,3,2,8,5,6,6,6,6,6,6,6};
				int ar4[] = {1,2,3,4,8,5,6,9,11,6,12,6,14};
				int ar5[] = {};
				int ar6[] = {1};
				int ar7[] = {1,1};
				int ar8[] = {7,9};
							
		assertEquals(3,SubsequenceLength_NumberConvertor.maxSubsequenceLength(ar1));
		assertEquals(4,SubsequenceLength_NumberConvertor.maxSubsequenceLength(ar2));
		assertEquals(7,SubsequenceLength_NumberConvertor.maxSubsequenceLength(ar3));
		assertEquals(1,SubsequenceLength_NumberConvertor.maxSubsequenceLength(ar4));
		assertEquals(0,SubsequenceLength_NumberConvertor.maxSubsequenceLength(ar5));
		assertEquals(1,SubsequenceLength_NumberConvertor.maxSubsequenceLength(ar6));
		assertEquals(2,SubsequenceLength_NumberConvertor.maxSubsequenceLength(ar7));
		assertEquals(1,SubsequenceLength_NumberConvertor.maxSubsequenceLength(ar8));
	}


	@Test
	void NumberConvertorTest() {
	//	int x1 = 0;
		int x2 = 1;
		int x3 = 45;
		int x4 = 100;
		int x5 = 2570;
		
	//assertEquals(Integer.toBinaryString(x1), SubsequenceLength_NumberConvertor.toBinaryStr(x1));
	assertEquals(Integer.toBinaryString(x2), SubsequenceLength_NumberConvertor.toBinaryStr(x2));
	assertEquals(Integer.toBinaryString(x3), SubsequenceLength_NumberConvertor.toBinaryStr(x3));
	assertEquals(Integer.toBinaryString(x4), SubsequenceLength_NumberConvertor.toBinaryStr(x4));
	assertEquals(Integer.toBinaryString(x5), SubsequenceLength_NumberConvertor.toBinaryStr(x5));
	}
}
