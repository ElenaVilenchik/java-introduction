package telran.text;

public class Strings {
	/**
	 * 
	 * @param str1 ASCII string with no repeated symbols
	 * @param str2 ASCII string with no repeated symbols
	 * @return array with two numbers
	 * first - number of the symbols of the str2 that exist in str1 at the indexes
	 * second - number of the symbols of the str2 that exist in str1 at the different
	 */
	
	public static int[] deepNoRepeatedCompare(String str1, String str2) {
		int[] strCountArr=new int[2];
		int 	numberIdenticalIndexes = 0, 
				numberDifferentIndexes = 0;
		
		if (str1.equals(str2)) {
			numberIdenticalIndexes = str1.length();
		} else {
		
		for (int i = 0; i<str1.length(); i++) {
			for (int j = 0; j<str2.length(); j++){
				if((str2.charAt(j) == str1.charAt(i))) {
					if (str1.indexOf(str1.charAt(i)) == str2.indexOf(str2.charAt(j)))
						numberIdenticalIndexes++;
						else numberDifferentIndexes++;	
			}
		}
	}}
		
		strCountArr[0] = numberIdenticalIndexes;
		strCountArr[1] = numberDifferentIndexes;
		return strCountArr; 
	}
}

