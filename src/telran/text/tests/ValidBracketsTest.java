package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.text.ValidBrackets;

class ValidBracketsTest {

	@Test
	void validBrackets() {
		String[] data = { 
				"aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd )",
				" (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd )",
				"[()]{}{[()()]()} " };
		
		for (int i = 0; i < data.length; i++) {
			assertTrue(ValidBrackets.hasaValidBrackets(data[i]));
		}
	}

	@Test
	void invalidBrackets() {
		String[] data = {

				")dfgswfgsf(",

				"[werwert(wert{ wrtw] wertrt)",

				"[d (fff ] gjfgjf )",

				"aaaaaa (sdfsdfdsf[dfd(f)f]" };
		
		for (int i = 0; i < data.length; i++) {
			assertFalse(ValidBrackets.hasaValidBrackets(data[i]));
		}
	}
}
