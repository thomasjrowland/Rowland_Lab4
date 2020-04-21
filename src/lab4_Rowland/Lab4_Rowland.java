package lab4_Rowland;

import java.util.Scanner;

public class Lab4_Rowland {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Learn your squares and cubes!");
		boolean keepGoing = true;

		while (keepGoing) {
			System.out.print("Enter an integer: ");

			int userNum = scnr.nextInt();
			System.out.println();
			System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s\n", "=======", "=======", "======");
			for (int i = 1; i <= userNum; i++) {

				int square = (i * i);
				int cube = (i * i * i);

				System.out.printf("%-10d %-10d %-10d", i, square, cube);
				System.out.println();
			} 
			System.out.println();
			System.out.print("Would you like to continue? ");
			keepGoing = scnr.next().startsWith("y");
			System.out.println();
		}
	}
}