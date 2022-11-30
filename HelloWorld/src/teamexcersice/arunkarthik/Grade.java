package teamexcersice.arunkarthik;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter percentage marks:");
		int per = scan.nextInt();

		if (per <= 100 && per >= 90) {
			System.out.println("Grade A");
		} else if (per <= 89 && per >= 80) {
			System.out.println("Grade B");
		} else if (per <= 79 && per >= 70) {
			System.out.println("Grade C");
		} else if (per < 70) {
			System.out.println("Fail");
		}
		scan.close();
	}
}