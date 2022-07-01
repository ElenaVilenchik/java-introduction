package telran.numbers;

public class SubsequenceLength_NumberConvertor {
	private static final int Base = 2;

	/**
	 * 
	 * @param arr of integers
	 * @return the length of longest sub-sequence, consisting of repeating number

	For example, if input is
	    1,3,3,2,8,8,8,5,6,6
	the result is 3 - the length of longest subsequence 8,8,8

	The non-repeating number would  be considered as "subsequence of length 1".
	The result for empty array would be 0
	 */

	public static int maxSubsequenceLength(int[] arr){
		int arL = arr.length;
		
		return arL > 1 ? LongSubsequence(arr, arL) : ShortSubsequence(arL);
	}
		
	private static int LongSubsequence(int[] arr, int lengh) {
		int temp = 1;
		int Len = 1;
		for(int i = 1; i < lengh; i++) {	
			if (arr[i-1] == arr[i]) {
				temp++;
				if (Len < temp) Len = temp; }
			else temp = 1;}
		return Len;
	}

		private static int ShortSubsequence(int lengh) {	
		
			return lengh == 0 ? 0 : 1;
	}

/**
 *@param non-negative integer number
 * @return String with binary form of the given number 
 */

	public static String toBinaryStr(int number)  {
		String res = "";
		int remind;
		while(number != 0){  
          remind = number % Base;  
          res = remind + res;  
          number = number / Base;  
		}
		return res;
	}
}

