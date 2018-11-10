package Elements;

abstract public class Element {
	String message = "I am the abstract class";
	
	public String getName() {
		return this.getClass().getName();
	}
	
	abstract public Element create();
	
	public String getMessage() {
		return message;
	}
}
