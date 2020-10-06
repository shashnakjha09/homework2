import java.util.Scanner;

public class Queation_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		int j=0;
		int max=0;
		int min = 0;
		
		while(j<n)
		{
			int input1 = sc.nextInt();
			if(input1 > max) {
				max = input1;
			}
			else if (input1 < max) {
				min = input1;
			}
			j++;
	    }
		
		System.out.println(max);
		System.out.println(min);

	}

}
