
public class question_3 {
	
//	 public static void armstrong (double num) {
//		
//		int total = 0;
//		
//		int count = 0;
//		
//		while(num !=0) {
//			double rem = (num/10);
//		}
//	}

	public static void main(String[] args) {
		
		  int count  = 0,a,temp;
		  for(int n1 = 1; n1 <= 500; n1++) {

		  temp = n1;
		  
		  while(n1 != 0) {
			  
			   a = n1 % 10;
			   n1 = n1/10;
			   count  = count + (a*a*a);
		  } 
		  
		  if(temp == count) {
			  System.out.println(n1);
			  
		  }
		 	}
	}
		
	}


