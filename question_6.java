import java.util.Scanner;

public class question_6 {
	
	public static float check(int n) {
		  float sum = 1;
		  for(float i = 2; i <= n; i++) {
			  if(i % 2 == 0) {
				  
			   sum = sum - (1 / i);
			  }
			  else if(i % 2 != 0) {
				  sum = sum + (1 / i);
			  }
		  }
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		float total_sum = check(n);
		
		System.out.println(total_sum);

		
	}

}
