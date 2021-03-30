package test;

/*It is possible to implements several interfaces at the same time*/
public class ImplementClass implements InterfaceClass1,InterfaceClass2 {
	
	private String value;

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public void method1() {
		
	}

	@Override
	public Boolean method2() { 
		return false;
	}

}
