package JavaPrograms;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Reverse: ");
		int num = sc.nextInt();
		
		int temp = num;
		int result = 0,digit=0;
		while(temp!=0)
		{
			digit = temp%10;
			result = (result*10)+digit;
			temp = temp/10;
		}
		System.out.println("Reverse of "+ num+" is "+ result);
		
		System.out.println("Enter Number to check Prime Number: ");
		int num1 = sc.nextInt();
		for(int j=1;j<num1;j++)
		{
		boolean b = true;
		for(int i=2;i<j;i++)
		{
			if(j%i==0)
			{
				b = false;
			}
		} 
		if(b)
		{
			System.out.println(j);
		}
	  }
	}
}
