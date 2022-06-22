package telran.numbers;

import java.util.Arrays;

/**
 * 
 * @author User
 *application should print out 7 random numbers in the range [1-49]
 */
public class SportLotoAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res[] = new int[7];		
		for(int i = 0; i < 7; i++) {
			res[i] = getRandomNumber(1,49);
			for (int j=0;j<i;j++)
            {
                if (res[i] == res[j])
                {
                    i--;
                }
            }		
		}
		System.out.println(Arrays.toString(res));
	}
	
	//random number in the range [min - max]
private static int getRandomNumber(int min, int max) {
	return (int) (min + (Math.random() * (max - min + 1)));
	}
}
