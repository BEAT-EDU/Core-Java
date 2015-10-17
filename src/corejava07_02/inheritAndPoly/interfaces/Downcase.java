package corejava07_02.inheritAndPoly.interfaces;

class Downcase extends Processor {
	String process(Object input) {
		return ((String) input).toLowerCase();
	}
}