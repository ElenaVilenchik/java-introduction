package telran.numbers;

public class IntegerPrimitives {

	public static byte getMaxByte() {
		byte res = 1;
		while (res > 0) {
			res = (byte)(res * 2);
		}
		return (byte)(res - 1);
	}

	public static byte getMinByte() {
		
		return (byte) (getMaxByte() +1);
	}

	public static int getLengthByte() {
		return getLength(8);
	}

	public static char getMaxChar() {
		char res = 1;
		while (res > 0) {
			res = (char)(res * 2);
			
		}
		return (char) (res - 1);
	}

	public static char getMinChar() {
		
		return (char) (getMaxChar() +1);
	}

	public static int getLengthChar() {
		return getLength(16);
	}

	public static short getMaxShort() {
		short res = 1;
		while (res > 0) {
			res = (short)(res * 2);
		}
		return (short)(res - 1);
	}

	public static short getMinShort() {
		
		return (short) (getMaxShort() +1);
	}

	public static int getLengthShort() {
		return getLength(16);
	}

	public static int getMaxInt() {
		int res = 1;
		while (res > 0) {
			res = (int)(res * 2);
		}
		return (int)(res - 1);
	}

	public static int getMinInt() {
		
		return (int) (getMaxInt() +1);
	}

	public static int getLengthInt() {
		
		return getLength(32);
	}

	public static long getMinLong() {
		return getMaxLong() +1;
	}

	public static long getMaxLong() {
		long res = 1;
		while (res>0) {
			res = res * 2;
		}
		return res - 1;
	}

	public static int getLengthLong() {
		// TODO Auto-generated method stub
		// 1. solution of copy\paste
		// bonus solution with call the method getLength with passing some value
		return getLength(64);
	}
	
/**
 * @param (long x) is your number
 * @return length of any type 
 */
	private static int getLength(long x) {
   
	return (int) Math.ceil(x/8);}
}