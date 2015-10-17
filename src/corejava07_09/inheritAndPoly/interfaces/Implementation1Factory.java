package corejava07_09.inheritAndPoly.interfaces;

class Implementation1Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation1();
	}
}