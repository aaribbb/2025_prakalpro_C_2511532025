package pekan4;

import java.util.Scanner;

public class LatIf1 {

	public static void main(String[] args) {
		double IPK;
		Scanner Input = new Scanner(System.in);
		System.out.print("Input IPK anda: ");
		IPK = Input.nextDouble();
		Input.close();
		if (IPK>2.75) {
			System.out.println("Anda Lulus Sangat Memuaskan dengan IPK " + IPK);
		}
	}

}
