package bronze;

import java.io.IOException;
import java.util.Scanner;

public class test2439 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();
		
		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
