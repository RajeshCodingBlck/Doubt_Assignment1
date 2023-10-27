import java.util.*;
public class Main {
    public static void main(String args[]) {
      
        Scanner s= new Scanner(System.in);

        int t= s.nextInt();

        while(t>0){

            int n= s.nextInt();

            int [] arr= new int[n];

            for(int i=0; i<n;i++){

                 arr[i]= s.nextInt();
            }

            for(int i=0; i<n;i++){

                for(int j=1; j<n-i;j++){
                   
                    String left= Integer.toString(arr[j-1]);

                    String right= Integer.toString(arr[j]);

                    String ans1= left+right;
                    String ans2= right+left;

                    if(ans1.compareTo(ans2)<0){
                        
                        int temp=arr[j];
                        arr[j]=arr[j-1];

                        arr[j-1]=temp;
                    }

                }

                

              


            }

            for(int i=0; i<n;i++){

                    System.out.print(arr[i]);
                }
            System.out.println();
            t--;
        }
    }
}
