package test;

/* Reference Passage Example
 * The rule in java is as follow :
 * - The argument is an object, then it is a reference passage.
 * - The argument is a primitive type, then is a value passage.
 * */
public class Main {

	public static void main(String[] args) {
		
		BeanClass beanClassInstance = new BeanClass(false); // isActive variable in BeanClass is set to false
		System.out.println(beanClassInstance); // Result : BeanClass [isActive=false]
		
		new MetierClass(beanClassInstance); // When beanClassInstance is passed as an argument, this is passing the reference to a position in memory
											//  isActive variable is set true		
		System.out.println(beanClassInstance); // Result : BeanClass [isActive=true] 

	}

}
