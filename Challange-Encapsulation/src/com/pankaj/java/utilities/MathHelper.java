package com.pankaj.java.utilities;

public class MathHelper {
	
	public static double addValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 + d2;
	}

	public static double subsValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 - d2;
	}

	public static double mulValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 * d2;
	}

	public static double divValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 / d2;
	}
}
