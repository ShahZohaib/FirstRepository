package JavaPrograms;

import java.util.Scanner;

public class Character_Occurance {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		
		char c[]= s.toCharArray();
		
		System.out.println("Enter character to find the occurance: ");
		
		char key = sc.next().charAt(0);
		int count=0;
		
		for(int i=0;i<c.length;i++)
		{
			if(key==c[i])
			{
				count++;
			}
		}
		System.out.println(key+" Occured "+ count+" times");
	}
}
