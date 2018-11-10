package Main;

import Elements.Element;
import Elements.ElementA;
import Elements.ElementB;
import Elements.ElementC;
import Factory.AbstractFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractFactory myFactory = new AbstractFactory();
		
		myFactory.register("x", new ElementA());
		myFactory.register("y", new ElementB());
		myFactory.register("z", new ElementC());
		
		Element someEC = myFactory.createElement("z");
		Element someEA = myFactory.createElement("x");
		Element someEB = myFactory.createElement("y");
		
		System.out.println(someEC.getName());
		System.out.println(someEA.getName());
		System.out.println(someEB.getName());
		
		System.out.println(someEC.getMessage());
		System.out.println(someEA.getMessage());
		System.out.println(someEB.getMessage());
	}

}
