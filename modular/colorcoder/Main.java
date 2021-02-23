package modular.colorcoder;

import modular.colorcoder.colorpair.ColorPair;
import modular.colorcoder.type.MajorColor;
import modular.colorcoder.type.MinorColor;

public class Main {
	static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = ColorPair.getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.toString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = ColorPair.getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}
	
	static void printColorCode() {
		System.out.println("Color pair:");
		for (int i = 1; i <= 25; i++) {
			System.out.println(i + " " + ColorPair.getColorFromPairNumber(i).toString());
		}
	}

	public static void main(String[] args) {
		testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
		testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
		printColorCode();
	}
}
