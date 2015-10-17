package corejava07_04.inheritAndPoly.interfaces;

class Upcase extends StringProcessor {
	public String process(Object input) { // Covariant return
		return ((String) input).toUpperCase();
	}
}