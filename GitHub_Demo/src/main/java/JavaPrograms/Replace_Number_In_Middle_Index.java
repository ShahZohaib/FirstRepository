package JavaPrograms;

import java.util.Scanner;

public class Replace_Number_In_Middle_Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		int len = sc.nextInt();
		int [] a = new int[len];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt(); 
		}
		System.out.println("Select Number to Change: ");
		int select_num = sc.nextInt();
		int index = -1;
		for(int i=0;i<a.length;i++)
		{
			if(select_num == a[i])
			{
				index=i;
			}
		}
		if(index>0)
		{
			for(int k=a.length-1;k>index;k--)
			{
				a[k]=a[k-1];
			}
		}
		System.out.println("Enter the value you want: ");
		a[index]=sc.nextInt();
		for(int l =0;l<a.length;l++)
		{
			System.out.println(a[l]);
		}
		sc.close();
	}
}
