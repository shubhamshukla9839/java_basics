package operators;

public class binary1 {


    public static void main(String[] args){
		System.out.println("===== Bitwise Operators =====");
		
		System.out.println("4 & 5 = " + (4 & 5)); // 4
		/*
		 * 				1 0 0
		 * 				& & &
		 * 				1 0 1
		 * 				-----
		 * 				1 0 0 = 4
		 */
		
		System.out.println("4 | 5 = " + (4 | 5)); // 5
		/*
		 * 				1 0 0
		 * 				| | |
		 * 				1 0 1
		 * 				-----
		 * 				1 0 1 = 5
		 */
		
		System.out.println("4 ^ 5 = " + (4 ^ 5)); // 1
		/*
		 * 				1 0 0
		 * 				^ ^ ^
		 * 				1 0 1
		 * 				-----
		 * 				0 0 1 = 1
		 */
		
		System.out.println("~1 = " + ~1);
		System.out.println(Integer.toBinaryString(1));		// 00000001
		System.out.println(Integer.toBinaryString(-2));		// 11111110
		System.out.println((byte)0b11111110);				// -2
		System.out.println((byte)0b10000000);				// -128 = -(2 ^ 7)
		System.out.println((byte)0b11000000);				// -64 = -(2 ^ 7) + (2 ^ 6) 
		
		
		System.out.println("5 = " + 0b101);
		System.out.println("5 >> 1 = " + (0b101 >> 1));
		System.out.println("5 in binary format = " + Integer.toBinaryString(5));
		System.out.println("2 in binary format = " + Integer.toBinaryString(2));	// 10
		
		
		System.out.println("5 = " + 0b101);					// 000000101
		System.out.println("5 >>> 1 = " + (0b101 >>> 1));	// 000000010
		
		final int negativeByteValue = 0b11111111111111111111111110000000;
		System.out.println("-128 = " + negativeByteValue);					// 11111111111111111111111110000000
		System.out.println("-128 >>> 1 = " + (negativeByteValue >>> 1));	// 01111111111111111111111111000000
		System.out.println("-128 >> 1 = " + (negativeByteValue >> 1));		// 11111111111111111111111111000000
		
		
		System.out.println("5 = " + 0b101);
		System.out.println("5 << 1 = " + (0b101 << 1));
		System.out.println("5 in binary format = " + Integer.toBinaryString(5));
		System.out.println("10 in binary format = " + Integer.toBinaryString(10));

		
		System.out.println("10 * 2 = 10 << 1 = " + (10 << 1));	// x << y = x * (2 ^ y) 
		System.out.println("10 / 2 = 10 >> 1 = " + (10 >> 1));	// x >> y = x / (2 ^ y)
		
		System.out.println();
	}
}