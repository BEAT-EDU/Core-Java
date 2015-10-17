package corejava07_04.inheritAndPoly.interfaces;

public class HighPass extends Filter {
	double cutoff;

	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}

	public Waveform process(Waveform input) {
		return input;
	}
} // /:~