package telran.numbers;

public class Anagram2 {

		public static boolean isAnagram(String sourceWord, String targetWord){
		
			//if the lengths of the strings are not equal, then stop
			 if (sourceWord.length() != targetWord.length())
				 return false; 
				
			 //if the string contains more than just letters
			 for(int i=0;i<sourceWord.length();i++){
				 if(! Character.isLetter(sourceWord.charAt(i)) 
						 || ! Character.isLetter(targetWord.charAt(i))) {
			    	return false;
				 }
			 }
		    int[] strCountTargetWord=getASCIICountArr(sourceWord + targetWord);
		    
		    for(int i=0;i<256;i++){
		        if(strCountTargetWord[i] % 2 != 0) {
		            return false;
		        }
		    }
		    return true;
		}

		public static int[] getASCIICountArr(String str){
		    char c;
		    //Array size 256 for ASCII
		    int[] strCountArr=new int[256];
		    for(int i=0;i<str.length();i++){
		        c=str.charAt(i); 
		        c=Character.toUpperCase(c);
		        strCountArr[(int)c]++;
		    	}
		    return strCountArr;
		}
}