package corejava07_02.inheritAndPoly.interfaces;

class Upcase extends Processor {
	String process(Object input) { // Covariant return
		return ((String) input).toUpperCase();
	}
}