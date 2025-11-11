package pekan7_2511532025;

import java.util.Scanner;

public class BilanganPrima_2511532025 {

	public static boolean IsPrime(int n) {
		int factors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factors++;
			}
		}
		return (factors  == 2);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input nilai n = ");
		int a = input.nextInt();
		if (IsPrime(a)) {
			System.out.println(a + " bilangan prima");
		} else {
			System.out.println(a + " bukan bilangan prima");
		}
	}

}
