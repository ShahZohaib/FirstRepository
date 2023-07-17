package JavaPrograms;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		
		int count =0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count++;
				System.out.println(c[i]);
			}
		}
		System.out.println("Total Vowels in array: "+count);
		
	}
}
