package JavaPrograms;

import java.util.Scanner;

public class Trim_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		char c[]=s.toCharArray();
		
		int pre=0,post=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				break;
			}
			else
			{
				pre++;
			}
		}
		for(int j=c.length-1;j>0;j--)
		{
			if(c[j]!=' ')
			{
				break;
			}
			else
			{
				post++;
			}
		}
		int size = c.length-pre-post;
		char ch[] = new char[size];
		for(int k=0;k<ch.length;k++)
		{
			ch[k]=c[k+pre];
		}
		System.out.println("String after trim");
		for(int l=0;l<ch.length;l++)
		{
			System.out.print(ch[l]);
		}
	}
}
