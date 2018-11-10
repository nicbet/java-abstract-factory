package Elements;

public class ElementC extends Element {

	@Override
	public Element create() {
		return (new ElementC());
	}

	public ElementC() {
		this.message = "I'm an ElementC";
	}
}
