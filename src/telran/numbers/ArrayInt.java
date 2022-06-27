package telran.numbers;

import java.util.Arrays;

public class ArrayInt {
	
	/**
	 * 
	 * @param ar
	 * @param number
	 * @return new array with added number
	 */
public static int [] addNumber(int ar[], int number) {
	
	int res[] = new int[ar.length+1]; // creates array as the reference to ar.length+1 primitives
	
	//copying from ar to res
	for(int i=0; i<ar.length; i++) {
		res[i] = ar[i];
	}
	res[res.length-1] = number;
	return res;
	
}
public static int [] addNumberQuickly(int ar[], int number) {
	
	int [] res = Arrays.copyOf(ar, ar.length+1);

	res[ar.length] = number;
	return res;
}


/**
 * 
 * @param ar
 * @param index
 * @param number
 * @return new array containing number value at the given index
 */
public static int[] insertNumber(int ar[], int index, int number) {
	
	int res[] = new int[ar.length + 1];
	System.arraycopy(ar, 0, res, 0, index);  
	res[index] = number;
	System.arraycopy(ar, index, res, index + 1, ar.length - index);
	return res;
}


/**
 * 
 * @param ar
 * @param index
 * @return new array with removed number at the given index
 */
public static int[] removeNumber(int ar[], int index) {
	
	
	int res[] = new int[ar.length - 1];
	System.arraycopy(ar, 0, res, 0, index);    
	System.arraycopy(ar, index + 1, res, index, res.length - index);
	return res;
}


/**
 * 
 * @param ar
 * @param number
 * @return if number the given number exists in the given array then returns the index of first occurrence, 
 * otherwise returns -1
 */
public static int indexOf(int ar[], int number) {
	int res = -1;
	for(int i = 0; i < ar.length; i++) {
		if (ar[i] == number) {
			res = i;
			break;
		}
	}
	return res;
}

public static void sort(int[] ar) {
	boolean sorted = true;
	int length = ar.length;
     do {
    	sorted = moveMaxToEnd(ar, length);
    	length--;}
     while(!sorted);
}

public static boolean moveMaxToEnd(int[] ar, int index) {
	boolean sorted = true;
	for(int i = 1; i < ar.length; i++) {
		if(ar[i - 1] > ar[i]) {
			swap(ar,i);
			sorted = false;
		}
	}
return sorted;
}

private static void swap(int[] ar, int index) {
	int tmp = ar[index - 1];
	ar[index - 1] = ar[index];
	ar[index] = tmp;
	
}
/**
 * 	
 * @param ar sorted array
 * @param number
 * @return if the given number exists in the given array then returns the index of first occurence
 * otherwise returns negative value of (index + 1) where index is the index is the one
 * at which the given number should have been
 */
	public static int binaryIndexOf(int[] ar, int number) {
		int left = 0;
		int right = ar.length - 1;
		int middle = ar.length / 2;
		while (left <= right && ar[middle] != number) {
			if (ar[middle] < number) {
				left = middle + 1; //looking for the number will be in right part of the array	
			} else {
				right = middle - 1; //looking for the number will be in the left part of the array
			}
			middle = (left + right) / 2;
		}
		return left > right ? -(left + 1): getFirstIndex(ar, middle, number);
	}
private static int getFirstIndex(int[] ar, int middle, int number) {
	while (middle >=0 && ar[middle]==number) {
		middle--;
	}
	return middle +1;
}
}