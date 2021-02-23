package modular.colorcoder.type;

public enum MajorColor implements IColor {
	WHITE(0), RED(1), BLACK(2), YELLOW(3), VIOLET(4);

	private int index;

	private MajorColor(int index) {
		this.index = index;
	}

	@Override
	public int getIndex() {
		return index;
	}
};
