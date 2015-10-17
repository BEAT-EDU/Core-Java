package corejava07_09.inheritAndPoly.interfaces;

public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		// Implementations are completely interchangeable:
		serviceConsumer(new Implementation2Factory());
	}
} /*
 * Output: Implementation1 method1 Implementation1 method2 Implementation2
 * method1 Implementation2 method2
 */// :~