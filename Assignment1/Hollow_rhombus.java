import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner s= new Scanner(System.in);

        int n= s.nextInt();


      int row=1;

      int nst=n;

      int nsp=n-1;


      while(row<=n){
       

        // outer space

         int i=1;

         while(i<=nsp){
             System.out.print(" ");
             i++;
         }


         // Star Print

         if(row==1 || row==n){

             int j=1;

             while(j<=nst){

                 System.out.print("*");
                 j++;
             }
         }else{
             
           System.out.print("*");


            int j=1;

            while(j<=n-2){

                System.out.print(" ");
                j++;
            }

            System.out.print("*"); 


         }


         // Preparation for Next Row

          nsp=nsp-1;
          row=row+1;

          System.out.println();


      }



    }
}
