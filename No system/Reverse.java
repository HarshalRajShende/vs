
import java.util.*;
public class Reverse {
      public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();   
     printReverse(n);
     System.out.println(isPalindrome(n));
   
   }

   public static void printReverse(int n){
      // for negative values
      int flag = n<0 ? -1:1;
      n = n*flag;
      
       
       long r=0;      
      while(n>0){
          r = r*10+ n%10; 
          n/=10;
      } 
      
      // for over 32bit, i.e. long type
      if(r<=Integer.MIN_VALUE || r>=Integer.MAX_VALUE){
         System.out.println(0);
         return;
      }
          
          
        System.out.println((int)r*flag);  
    
   }

   public static boolean isPalindrome(int x) {
        
      if( x<0 || (x!=0 && x%10==0) ) return false;
      if(x<10) return true;
      
      
      int r=0;
      while(r<x){
          r = r*10 + x%10;
          x/=10;
      }
      
      // even digits r==x
      // odd digits  (r/10)==x
      // O(half no of digits)
      return (r==x || (r/10)==x);
  }

  
}
