package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.numbers.TictactoeGame.*;

import org.junit.jupiter.api.Test;

import telran.numbers.TictactoeGame;

class TictactoeGameTests {

	@Test
	void gameIsNotOverTest() {
		char matrix[][] = {
				{Z, E, X},
				{X, Z, E},
				{E, E, E}
				};
		assertEquals(0, TictactoeGame.tictactoeMove(matrix, 0, 2, Z));
		assertEquals(0, TictactoeGame.tictactoeMove(matrix, 2, 0, X));
		assertEquals(0, TictactoeGame.tictactoeMove(matrix, 2, 1, Z));
	}
	
	@Test
	void gameIsOverDrawTest() {
		char matrix1[][] = {
				{Z, X, Z},
				{Z, X, X},
				{E, Z, X}
				};
		char matrix2[][] = {
				{Z, X, Z},
				{Z, Z, X},
				{X, E, X}
				};
		char matrix3[][] = {
				{Z, X, Z},
				{Z, X, E},
				{X, Z, X}
				};
		assertEquals(3, TictactoeGame.tictactoeMove(matrix1, 2, 0, X));
		assertEquals(3, TictactoeGame.tictactoeMove(matrix2, 2, 1, Z));
		assertEquals(3, TictactoeGame.tictactoeMove(matrix3, 1, 2, Z));
	}
	
	@Test
	void gameIsOverFullRowTest() {
		char matrix1[][] = {
				{Z, E, Z},
				{Z, X, X},
				{X, Z, X}
				};
		char matrix2[][] = {
				{Z, X, Z},
				{E, X, X},
				{X, Z, X}
				};
		char matrix3[][] = {
				{Z, X, Z},
				{Z, Z, X},
				{X, E, X}
				};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix1, 0, 1, Z));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix2, 1, 0, X));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix3, 2, 1, X));
	}
	
	@Test
	void gameIsOverFullColumnTest() {
		char matrix[][] = {
				{Z, X, Z},
				{Z, Z, X},
				{X, Z, X}
				};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix, 0, 2, X));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix, 0, 1, Z));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix, 2, 0, Z));
		
	}
	
	@Test
	void gameIsOverFullLeftDiagonalTest() {
		char matrix[][] = {
				{E, Z, Z},
				{Z, X, X},
				{X, Z, X}
				};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix, 0, 0, X));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix, 0, 0, Z));
	}
	
	@Test
	void rgameIsOverFullRightDiagonalTest() {
		char matrix[][] = {
				{X, X, Z},
				{Z, Z, X},
				{E, Z, X}
				};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix, 2, 0, Z));
		assertEquals(3, TictactoeGame.tictactoeMove(matrix, 2, 0, X));
	}
	
	@Test
	void gameIsOverTest() {
		char matrix[][] = {
				{'0', 'x','0'  },
				{'0', '0', 'x'},
				{'0', '0', 'x'}
				};
		assertEquals(1, TictactoeGame.tictactoeMove(matrix, 2, 0, Z));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix, 0, 2, X));
	}
}
