package Factory;

import java.util.HashMap;
import java.util.Map;

import Elements.Element;

public class AbstractFactory {
	Map<String, Element> registeredElements;
	
	public Element createElement(String which) {
		if (registeredElements.containsKey(which)) {
			return registeredElements.get(which).create();
		} else {
			throw new RuntimeException("Type " + which + " unknown to Factory!");
		}
	}
	
	public void register(String token, Element e) {
		this.registeredElements.put(token, e);
	}
	
	public AbstractFactory() {
		this.registeredElements = new HashMap<String, Element>();
	}
}
