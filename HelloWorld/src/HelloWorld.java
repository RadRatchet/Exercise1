import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		HelloUser helloUser = new HelloUser(name);
		helloUser.greetUser();
	}

}
