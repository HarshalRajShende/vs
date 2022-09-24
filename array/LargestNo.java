package array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class LargestNo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String arr[]=new String[n];

      for(int i=0;i<n;i++) arr[i]=sc.next();

      Arrays.sort(arr,(s1,s2) -> (s2).compareTo(s1));
      for(int i=0; i<n; i++)System.out.println(arr[i]);

      String ret="";
      for(int i=0;i<n;i++)
         ret+=arr[i];  

       if(arr[0].charAt(0)=='0')
      {
        System.out.println("0");
        return;
        }

      System.out.println(ret);
	}
}
