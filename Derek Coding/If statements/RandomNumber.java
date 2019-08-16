import java.util.Scanner;
public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int secret = (int) (100*Math.random());
		int guess = -1;
		int counter = 0;
		while (guess !=secret) {
			System.out.print("Guess?"); 
			guess = sc.nextInt();
			counter++;
			if (guess>secret) {
				System.out.println("Too High");
			}
			if (guess<secret) {
				System.out.println("Too Low");
			}
			if (guess==secret) {
				System.out.println("Correct!");
				System.out.print(counter); 
				System.out.println(" Guesses taken");
				
			}
			
		}

	}

}


