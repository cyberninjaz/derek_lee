import java.util.Scanner;
public class IfStatements {

	public static void main(String[] args) {
		System.out.println("Enter your age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if (age>12) {
		System.out.println("You are old!");
		}
		else {
		System.out.println("You are a baby");
		}
	}

}
