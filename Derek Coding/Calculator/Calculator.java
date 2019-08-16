import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("Hello\nworld");
		System.out.print("Cool");
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter a number:");
		double num1 = sc.nextDouble();
		String op = sc.next();
		double num2 = sc.nextDouble();
		if (op.equals ("+")) { 
			System.out.println (num1+num2);
			}
		if (op.equals ("-")) { 
			System.out.println (num1-num2);
		}
		if (op.equals ("*")) { 
			System.out.println (num1*num2);
		}
		if (op.equals ("/")) { 
			System.out.println (num1/num2);
		}
	}

}
