package corejava07_09.inheritAndPoly.interfaces;

class Implementation2Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation2();
	}
}