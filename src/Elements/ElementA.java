package Elements;

public class ElementA extends Element {

	@Override
	public Element create() {
		return (new ElementA());
	}
	
	public ElementA() {
		this.message = "I'm an ElementA";
	}

}
