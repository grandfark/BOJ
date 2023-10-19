package bronze;

import java.util.Scanner;

public class test2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A * (B % 10)); // 5
		System.out.println(A * ((B / 10) - ((B / 100)*10))); // 38 - 5 -> 8 => 38-30
		System.out.println(A * (B / 100));//3
		System.out.println(A * B);
		
	}
}
