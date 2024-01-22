package soloboj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bronze10818 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] numberlist = new int [N];
		
		String[] inputNumbers = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			numberlist[i] = Integer.parseInt(inputNumbers[i]);
		}
		
		Arrays.sort(numberlist);
		
		for(int i = 0; i < N; i++) {
			
		}
		System.out.println(numberlist[0]+" "+numberlist[N-1]);
	}
}
