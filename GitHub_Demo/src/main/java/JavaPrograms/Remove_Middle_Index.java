package JavaPrograms;

import java.util.Scanner;

public class Remove_Middle_Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		int len = sc.nextInt();
		int []a= new int[len];
		System.out.println("Enter Numbers: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Select Number to remove: ");
		int sel_num = sc.nextInt();
		int index =-1;
		for(int j=0;j<a.length;j++)
		{
			if(sel_num==a[j])
			{
				index=j;
			}
		}
		if(index>0)
		{
			for(int k=index;k<a.length-1;k++)
			{
				a[k]=a[k+1];
			}
		}
		System.out.println("Array After Removing Element:");
		for(int l =0;l<a.length-1;l++)
		{
			System.out.println(a[l]);
		}
		sc.close();
	}
}
