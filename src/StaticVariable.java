/**
 * 
 */
import com.zubiri.*;
import com.zubiri.school.Person;
/**
 * @author ik013043z1
 *
 */
public class StaticVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		
		System.out.println("The value of the counter without creating any person is " +Person.counter);
		
		Person person1;
		
		System.out.println("TThe value of the counter when i created an object without invoking the constructor " +Person.counter);
		
		person1 = new Person();
		
		System.out.println("The value of the counter when i created an object an invoked the constructo " +Person.counter);
		
		Person person2 = new Person();
		
		System.out.println("The value of the counter when i have created another Person object " +Person.counter);
		
		
		*/
		
		Person person0 = new Person();
		
		System.out.println("The value of the counter without creating any person is " + (person0.getCounter()-1));
		
		Person person1;
		
		System.out.println("The value of the counter when i created an object without invoking the constructor " +(person0.getCounter()-1));
		
		person1 = new Person();
		
		System.out.println("The value of the counter when i created an object an invoked the constructor " +(person0.getCounter()-1));
		
		Person person2 = new Person();
		
		System.out.println("The value of the counter when i have created another Person object " +(person0.getCounter()-1));
	}

}
