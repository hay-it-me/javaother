import java.util.Scanner;
public class RandomNumber {
	public static void main(String[] args) {
		int a = 0;
		int b = 101;
		int randomNumber = (int)(a + Math.random() * (b - a));
		
		System.out.println("Guess my number: ");
		
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		while(guess != randomNumber) {
			System.out.println("Incorrect!");
			if(guess < randomNumber) {
				System.out.println("Higher!");
			}
			else {
				System.out.println("Lower!");
			}
			System.out.println("Guess again!");
			guess = input.nextInt();
		}
		
		if(guess == randomNumber) {
			System.out.println("Correct!");
		}
	}
}