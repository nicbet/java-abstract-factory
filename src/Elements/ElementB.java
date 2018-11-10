package Elements;

public class ElementB extends Element{

	@Override
	public Element create() {
		return (new ElementB());
	}
	public ElementB() {
		this.message = "I'm an ElementB";
	}
}
