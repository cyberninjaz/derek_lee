import java.util.Scanner;
public class RangeofNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		double num1 = sc.nextDouble();
		String op = sc.next();
		int sum=10;
		for (int counter=10; counter<=20; counter+=1) {
			sum=sum+counter;
			System.out.println(counter);
			//Thread.sleep(1000);
		}
		System.out.println(sum);


	}

}
