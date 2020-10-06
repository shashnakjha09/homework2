
public class question_7_5 {

	public static void main(String[] args) {
                
		int n = 5,i,j;
        
 	     for(i = 1; i <= n; i++) {
 	    	 
 	    	 for( j = 0; j < (2*(n-i)); j++) {
 	    		 System.out.print(" ");
 	    	 }
             for(j = 0; j < (2*i-1); j++) {
            	   
  	    		 System.out.print(i);
             }
             System.out.println();
	}

}

}
