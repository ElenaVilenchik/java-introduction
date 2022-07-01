package telran.numbers;

public class Anagram2 {

		public static boolean isAnagram(String sourceWord, String targetWord){
		
			//if the lengths of the strings are not equal, then stop
			 if (sourceWord.length() != targetWord.length())
				 return false; 
				
			 //if the string contains more than just letters
			 for(int i=0;i<targetWord.length();i++){
				 if(! Character.isLetter(sourceWord.charAt(i)) 
						 || ! Character.isLetter(targetWord.charAt(i))) {
			    	return false;
				 }
			 }
		    int[] strCountTargetWord=getASCIICountArr(sourceWord, targetWord);
		    
		    for(int i=0;i<256;i++){
		        if(strCountTargetWord[i] != 0) {
		            return false;
		        }
		    }
		    return true;
		}

		public static int[] getASCIICountArr(String str1, String str2){
		    char c;
		    //Array size 256 for ASCII
		    int[] strCountArr=new int[256];
		    for(int i=0;i<str1.length();i++){
		        c=str1.charAt(i); 
		        c=Character.toUpperCase(c);
		        strCountArr[(int)c]++;
		        c=str2.charAt(i); 
		        c=Character.toUpperCase(c);
		        strCountArr[(int)c]--;
		    	}
		    return strCountArr;
		}
}