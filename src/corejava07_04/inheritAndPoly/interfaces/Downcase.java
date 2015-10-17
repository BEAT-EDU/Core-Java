package corejava07_04.inheritAndPoly.interfaces;

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}