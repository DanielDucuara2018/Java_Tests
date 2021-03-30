package test;

/* Abstract classes can be purely abstract or not.
 * It's not possible to define instances of an abstract class.
 * Abstract classes can contain 
 * - Abstract Methods
 * - Not Abstract Methods
 * - Attributes with their getters and setters 
 */
public abstract class AbstractClass {
	
	protected String value; // When heritage is used, it's neccessary to define attributes as protected. Only mother and children classes can see and use these attributes.
							// if an attribute is defined as private, only mother class can see and use this attribute
							// if an attribute is defined as public all classes can see and use this attribute.

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public abstract void method1(); // Abstract Methods do not specify body

	public Boolean method2() { // Not Abstract Methods specify body
		return false;
	}

}
