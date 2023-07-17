package JavaPrograms;

import java.util.Scanner;

public class Word_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		char c[]=s.toCharArray();
		int count=1;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')
			{
				if(i!=0 && i!=c.length-1)
				{
					count++;
				}
				if(i!=c.length-1)
				{
					if(c[i]==c[i+1])
					{
						count--;
					}
				}
			}
		}
		System.out.println("Total Words in a string: "+count);
		sc.close();
	}
}
