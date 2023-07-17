package JavaPrograms;

import java.util.Scanner;

public class String_Palindrome {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
 		System.out.println("Enter String: ");
 		String s = sc.nextLine();
 		
 		char a[]=s.toCharArray();
 		
 		int i = 0,j = a.length-1;
 		boolean b = true;
 		while(i<=j)
 		{
 			if(a[i]!=a[j])
 			{
 				b=false;
 			}
 			i++;
 			j--;
 		}
 		if(b)
 		{
 			System.out.println("It is a palindrome");
 		}
 		else
 		{
 			System.out.println("Not a palindrome");
 		}
 		sc.close();
	}
}
