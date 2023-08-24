package Assignment1;
import java.util.*;
public class double_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n=s.nextInt();
       
       int row=1;
       
       int nsp1=n-1; // outer space
       int nsp2=-1;  // inner space
       int nst=1; 
       
       int rowval=1;
       
       while(row<=n) {
    	   
    	   // outer space Print
    	   
    	    int i=1;
    	    while(i<=nsp1) {
    	    	System.out.print(" "+" ");
    	    	i++;
    	    }
    	    
    	    // Left star Print
    	    
    	    int j=1;
    	    
    	    int val=rowval;
    	   
    	    while(j<=nst) {
    	    	System.out.print(val+" ");
    	    	val--;
    	    	j++;
    	    }
    	   
    	    
    	    // inner space Print
    	    
    	    int k=1;
    	    while(k<=nsp2) {
    	    	System.out.print(" "+" ");
    	    	k++;
    	    }
    	    
    	    // Right Star
    	    
    	    int l=1;
    	    val++;
    	    
    	    if(row==1 || row==n) {
    	    	l=2;
    	    }
    	    
    	    while(l<=nst) {
    	    	System.out.print(val+" ");
    	    	val++;
    	    	l++;
    	    }
    	    
    	    // Preparation for the Next Row
    	    
    	    if(row< (n/2)+1) {
    	    	nsp1 -=2;
    	    	nsp2+=2;
    	    	nst++;
    	    	rowval++;
    	    }else {
    	    	nsp1+=2;
    	    	nsp2-=2;
    	    	nst--;
    	    	rowval--;
    	    }
    	    
    	    row=row+1;
    	    System.out.println();
    	    
       }
       
       
	}

}
