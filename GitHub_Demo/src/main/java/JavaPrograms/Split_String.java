package JavaPrograms;

import java.util.Scanner;

public class Split_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		char c []=s.toCharArray();
		System.out.println("Enter Character: ");
		char key = sc.next().charAt(0);
		
		int count=1;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==key && c[i+1]!=key)
			{
				count++;
				
			}
		}
		String []  arr = new String[count];
		int index=0;
		String temp="";
		for(int j=0;j<c.length;j++)
		{
			if(c[j]==key)
			{
				index++;
				temp="";
			}
			else
			{
				temp=temp+c[j];
				arr[index]=temp;
			}
		}
		System.out.println("String after split");
		for(int l=0;l<arr.length;l++)
		{
			System.out.println(arr[l]);
		}
		
	}
}
