package Day26_ForEachLoop;

import java.util.*;

import java.util.Arrays;

public class WarmUpTask {

	public static void main(String[] args) {

		/*
		 * 1. write a program that can check if two Strings are build out of same
		 * letters Ex: if str1 = "aabbbc"; str2 ="cab"; output: true
		 * 
		 * if str1 ="abcd"; str2 ="abc"; output: false
		 */

		String a = "aabbc", b = "cabbacbaccab";

		String a1 = ""; // to store all non duplicate values from a.

		for (int j = 0; j < a.length(); j++) {
			for (int i = 0; i < a.length(); i++) {
				if (!a1.contains(a.substring(j, j + 1))) {
					a1 += a.substring(j, j + 1);
				}
			}
		}
		System.out.println(a1);

		String b1 = "";

		for (int k = 0; k < b.length(); k++) {
			for (int m = 0; m < b.length(); m++) {
				if (!b1.contains(b.substring(k, k + 1))) {
					b1 += b.substring(k, k + 1);
				}
			}
		}
		System.out.println(b1);

		char[] ch1 = a1.toCharArray();
		System.out.println(Arrays.toString(ch1));

		char[] ch2 = b1.toCharArray();
		System.out.println(Arrays.toString(ch2));

		System.out.println("\n=============================\n");

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));

		System.out.println("\n=============================\n");

		String str1 = Arrays.toString(ch1);
		String str2 = Arrays.toString(ch2);

		if (str1.equals(str2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println("\n=============================\n");

		
		// solution 2

		String str3 = "aaabbbccc", str4 = "cccaaabbb";

		str3 = new TreeSet<String>(Arrays.asList(str3.split(""))).toString();
		str4 = new TreeSet<String>(Arrays.asList(str4.split(""))).toString();
		System.out.println(str3.contentEquals(str4));
	}

}
