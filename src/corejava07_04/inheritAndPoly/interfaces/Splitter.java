package corejava07_04.inheritAndPoly.interfaces;

import java.util.Arrays;

class Splitter extends StringProcessor {
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
} /*
 * Output: Using Processor Upcase IF SHE WEIGHS THE SAME AS A DUCK, SHE’S MADE
 * OF WOOD Using Processor Downcase if she weighs the same as a duck, she’s made
 * of wood Using Processor Splitter [If, she, weighs, the, same, as, a, duck,,
 * she’s, made, of, wood]
 */// :~