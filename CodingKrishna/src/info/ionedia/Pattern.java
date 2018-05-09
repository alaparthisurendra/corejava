package info.ionedia;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int n=s1.nextInt();
	System.out.println("enter n value");
	
	for(int i=0; i<=n; i++)
	{
		for(int j=0; j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}

	for(int k=n; k>0; k--)
	{
		for(int m=0; m<k; m++)
		{
			System.out.print(m+" ");
		}
		System.out.println();
	}
	
	}

}
