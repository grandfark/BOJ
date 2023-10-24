package bronze;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class test2338 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
	
		BigDecimal A = sc.nextBigDecimal();
		BigDecimal B = sc.nextBigDecimal();
		
		BigDecimal plus = A.add(B);
		BigDecimal minus = A.subtract(B);
		BigDecimal multi = A.multiply(B);
		
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multi);
	}
}
