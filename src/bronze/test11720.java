package soloboj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bronze11720 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String num = br.readLine();
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}
		System.out.println(sum);
	}
}
