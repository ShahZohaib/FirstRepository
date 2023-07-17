package JavaPrograms;

import java.util.Scanner;

public class Find_Duplicates_in_Array {
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
				int count=0;
				for(int j=i+1;j<c.length;j++)
				{
					if(c[i]==c[j])
					{
						count++;
						b=false;
						c[j]='0';		
					}
				}
				if(count>0)
				{
					System.out.println(c[i]+" occured "+count+" times");
					
				}
			}
		}
		if(b)
		{
			System.out.println("No Duplicates Found");
		}
	}
}
