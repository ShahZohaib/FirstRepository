package JavaPrograms;

public class ARMSTRONG {
	 public static void main(String[] args) {
		System.out.println("Armstrong,Palindrome,perfect numbers: ");
		for(int i=1;i<=1000;i++)
		{
		int temp = i;
		int count =0,sum=0;
		while(temp>0)
		{
			temp = temp/10;
			count++;
		}
		temp = i;
		while(temp!=0)
		{
			int digit = temp%10;
			int fact =1;
			for(int j=1;j<=count;j++)
			{
				fact*=digit;
			}
			sum = sum+fact;
			temp=temp/10;
		}
		if(sum==i)
		{
		//	System.out.println("Armstrong: "+i);
			temp=i;
			int result =0,digit=0;
			while(temp!=0)
			{
				digit= temp%10;
				result=(result*10)+digit;
				temp=temp/10;
			}
			if(result==i)
			{
			//	System.out.println("Palindrome: "+i);
				sum =0;
				temp=i;
			for(int k=1;k<temp;k++)
			{
				if(i%k==0)
				{
					sum+=k;
				}
			}
			if(sum==i)
			{
				System.out.println(i);
			}
			}
		}
	   }
	 }
	 
}
