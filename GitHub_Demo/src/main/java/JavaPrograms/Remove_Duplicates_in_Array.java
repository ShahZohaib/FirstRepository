package JavaPrograms;

import java.util.Scanner;

public class Remove_Duplicates_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		char c[]= s.toCharArray();
		
		boolean b =true;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='0')
			{
				for(int j=i+1;j<c.length;j++)
				{
					if(c[i]==c[j])
					{
						c[j]='0';		
					}
				}
			}
		}
		System.out.println("After Removing Duplicates: ");
		for(int k=0;k<c.length;k++)
		{
			if(c[k]!='0')
			{
				System.out.println(c[k]);
			}
		}
		sc.close();
	}
}
