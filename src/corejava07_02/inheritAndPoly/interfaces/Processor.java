package corejava07_02.inheritAndPoly.interfaces;

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}

	Object process(Object input) {
		return input;
	}
}