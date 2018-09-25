import java.util.Scanner;
public class Evenodd {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n <= 10) {
			System.out.println("Enter a number");
			int x = sc.nextInt();
			if (x % 2 == 0) {
				System.out.println("Your number is even"); 
			}
			else {
				System.out.println("Your number is odd"); 
				}
			n = n + 1;
		}
	}
}