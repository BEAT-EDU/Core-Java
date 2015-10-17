package corejava07_02.inheritAndPoly.interfaces;

import java.util.Arrays;

class Splitter extends Processor {
	String process(Object input) {
		// The split() argument divides a String into pieces:
		return Arrays.toString(((String) input).split(" "));
	}
}