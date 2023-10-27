import java.util.*;
public class Main {
    public static void main(String args[]) {
      
      Scanner s= new Scanner(System.in);

      String str= s.next();

      int fre=1;

      String ans="";

      for(int i=1; i<str.length();i++){

          if(str.charAt(i)== str.charAt(i-1)){
              fre++;
          }else{
              ans = ans+ str.charAt(i-1)+fre;
              fre=1;

          }
      }

      ans =   ans+  str.charAt(str.length()-1)+ fre;

      System.out.println(ans);


    }
}
