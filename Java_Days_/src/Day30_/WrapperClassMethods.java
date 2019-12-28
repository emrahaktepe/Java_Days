package Day30_;

public class WrapperClassMethods {

	/*
	 * Max_Value Min_Value parse methods ValueOf methods
	 */

	public static void main(String[] args) {

//		max_value: returns the maximum value of the primitive

		int maximum = Integer.MAX_VALUE;
		System.out.println(maximum + "\n");

		double maxDouble = Double.MAX_VALUE;
		System.out.println(maxDouble + "\n");

		byte maxByte = Byte.MAX_VALUE;
		System.out.println(maxByte + "\n");

		long maxLong = Long.MAX_VALUE;
		System.out.println(maxLong + "\n");

		char maxChar = Character.MAX_VALUE;
		System.out.println(maxChar + "\n");

//		min_value: returns the minimum value of the primitive

		int minInt = Integer.MIN_VALUE;
		System.out.println(minInt + "\n");

		double minDouble = Double.MIN_VALUE;
		System.out.println(minDouble + "\n");

		byte minByte = Byte.MIN_VALUE;
		System.out.println(minByte + "\n");

	//	parse methods: convers String values to primitives, returns values as primitive

	// parseInt("StringValue"): takes the string and converts it to an int primitive

		Integer num1 = Integer.parseInt("123"); // auto boxing
		System.out.println(num1 + 1);

		int num2 = Integer.parseInt("125");
		System.out.println(num2 + 1);

	// parseByte("StringValue"): takes the string and converts it to a byte
	// primitive

		int num3 = Byte.parseByte("19");
		System.out.println(num3 - 1);

		byte num4 = Byte.parseByte("19");
		System.out.println(num4 + 3);

	// parseShort("StringValue"): takes the string and converts it to a short
	// primitive

		short num5 = Short.parseShort("543");
		System.out.println(num5 + 3);

	// parseLong("StringValue"): takes the string and converts it to a long
	// primitive

		Long num6 = Long.parseLong("4444");
		System.out.println(num6);

	// parseFloat("StringValue"): takes the string and converts it to a float
	// primitive

		float num7 = Float.parseFloat("101.9");
		System.out.println(num7);

		float num8 = Float.parseFloat("10.3f");
		System.out.println(num8);

	// parseDouble("StringValue"): takes the string and converts it to a double
	// primitive

		float num9 = (float) Double.parseDouble("77.7");
		System.out.println(num9);

	// parseBoolean("StringValue"): takes the string and converts it to a boolean
	// primitive

		boolean B = Boolean.parseBoolean("trUe");
		System.out.println(B);

		Boolean D = Boolean.parseBoolean(" 10 > 9");
		System.out.println(D + "\n");

		int A1 = Byte.parseByte("19");
		Integer A2 = (int) Byte.parseByte("19");

		Short A3 = (short) Double.parseDouble("10.9");

	// ValueOf methods: converts String value to Wrapper class values

		int z = Integer.valueOf("333"); // unboxing
		System.out.println(z);

		Integer z1 = Integer.valueOf("3333"); // none
		Integer z2 = (int) Integer.valueOf("44444"+3); // auto boxing
		System.out.println(z2);
		
		
		boolean R1 = !Boolean.valueOf("tRuE"); 	//unboxing
		System.out.println(R1); // valueOf method ignores the case sensitivity
		
		int totalNum = 100;
		String stR = ""+totalNum;
		System.out.println(stR + 1);

	}
}
