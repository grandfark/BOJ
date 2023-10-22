package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test9498 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int score = Integer.parseInt(st.nextToken());
		
		if(score <= 100 && score >= 90) {
			System.out.println("A");
		}else if (score < 90 && score >=80) {
			System.out.println("B");
		}else if (score < 80 && score >=70) {
			System.out.println("C");
		}else if (score < 70 && score >=60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
