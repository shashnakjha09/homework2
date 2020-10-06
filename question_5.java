import java.util.Scanner;

public class question_5 {

	public static void main(String[] args) {
  		Scanner s = new Scanner(System.in);
  		int n = s.nextInt();

		float sum = 1;
		
		float count = 2;
		
		while(count<=n) {
			
			sum =  (sum + ((1 / count)));
			count++;
			
		}
		System.out.println(sum);
	}

}
