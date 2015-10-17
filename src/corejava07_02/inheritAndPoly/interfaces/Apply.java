package corejava07_02.inheritAndPoly.interfaces;

public class Apply {
	public static void process(Processor p, Object s) {
		System.out.print("Using Processor " + p.name());
		System.out.print(p.process(s));
	}

	public static String s = "Disagreement with beliefs is by definition incorrect";

	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
} /*
 * Output: Using Processor Upcase DISAGREEMENT WITH BELIEFS IS BY DEFINITION
 * INCORRECT Using Processor Downcase disagreement with beliefs is by definition
 * incorrect Using Processor Splitter [Disagreement, with, beliefs, is, by,
 * definition, incorrect]
 */// :~