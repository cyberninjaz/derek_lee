import java.util.Scanner;
public class CountingUp {

	public static void main(String[] args) throws InterruptedException { 
		int sum=0;
		for (int counter=2; counter<=50; counter+=2) {
			sum=sum+counter;
			System.out.println(counter);
			Thread.sleep(1000);
		}
		System.out.println(sum);

	}

}
