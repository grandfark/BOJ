package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2884 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int AM = M - 45;
				
		if (AM < 0) {
			AM += 60;
			H -= 1;
			if (H < 0) {
				H = 23;
			}
		}
		
		System.out.print(H + " " + AM);
				
	}
}
