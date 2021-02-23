package modular.colorcoder.colorpair;

import modular.colorcoder.colors.Colors;
import modular.colorcoder.type.IColor;
import modular.colorcoder.type.MajorColor;
import modular.colorcoder.type.MinorColor;

public class ColorPair {
	private MajorColor majorColor;
	private MinorColor minorColor;

	public ColorPair(MajorColor major, MinorColor minor) {
		majorColor = major;
		minorColor = minor;
	}

	public MajorColor getMajor() {
		return majorColor;
	}

	public MinorColor getMinor() {
		return minorColor;
	}

	public static ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = (MajorColor) fromIndex(MajorColor.values(),
				zeroBasedPairNumber / Colors.MINOR_COUNT);
		MinorColor minorColor = (MinorColor) fromIndex(MinorColor.values(),
				zeroBasedPairNumber % Colors.MINOR_COUNT);
		return new ColorPair(majorColor, minorColor);
	}

	public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * Colors.MINOR_COUNT + minor.getIndex() + 1;
	}

	public static IColor fromIndex(Object[] values, int index) {
		for (Object obj : values) {
			IColor color = (IColor) obj;
			if (color.getIndex() == index) {
				return color;
			}
		}
		return null;
	}

	public String toString() {
		String colorPairStr = Colors.MAJOR[majorColor.getIndex()];
		colorPairStr += " ";
		colorPairStr += Colors.MINOR[minorColor.getIndex()];
		return colorPairStr;
	}
};