package telran.numbers;

/**
 * 
 * @author User
 *application should print out 7 random nuvbers in the range [1-49]
 */
public class SportLotoAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//random number in the range [min - max]
private static int getRandomNumber(int min, int max) {
	return (int) (min + Math.random() * (max - min +1));
	// (int)???
}
}
