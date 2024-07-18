package primenumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println("Is it prime number: " + isPrimeNumber(number));
		System.out.println("Linear version: " + methodLinear(number));
		
		sc.close();
	}
	
	static List<Integer> methodLinear(int n) {
		
		List<Integer> primeNumbers = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			if (isPrimeNumber(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}
	
	static boolean isPrimeNumber(int n) {
		int dividers = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				dividers++;
			}
		}
		if (dividers == 2) {
			return true;
		}
		return false;
	}
}