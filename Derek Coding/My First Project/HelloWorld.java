import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello\nworld");
		System.out.print("Cool");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		double num1 = sc.nextDouble();
		String op = sc.next();
		double num2 = sc.nextDouble();
		if (op.equals ("+")) { 
			System.out.println (num1+num2);
			}
	}

}
