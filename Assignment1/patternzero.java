package Assignment1;
import java.util.*;
public class patternzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		
		int row=1;
		
		int nst=1;
		
		 while(row<=n) {
			 
			 // star
			  
			 int i=1;
			 
			 while(i<=nst) {
//				 System.out.print("*"+"\t");
				 
				 if(i==1 || i==nst) {
					 System.out.print(row+" ");
				 }else {
					 System.out.print(0+" ");
				 }
				 i++;
			 }
			 
			 // Preparation for the Next Row
			 
			  nst=nst+1;
			  row=row+1;
			  System.out.println();
		 }
	}

}
