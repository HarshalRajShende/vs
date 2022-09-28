
import java.util.*;
public class Reverse {
      public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();   
     printReverse(n);
   
   }

   public static void printReverse(int n){
      int r = 0;
      while (n>0) {
         r = r * 10 + n%10;
         n /= 10;
      }
      System.out.print(r);
   }

  
}
