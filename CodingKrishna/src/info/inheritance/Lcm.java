package info.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lcm {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, max,min,x;
		int lcm=1;
		System.out.println("enter num1 value:");
		num1=Integer.parseInt(bf.readLine());
		
		System.out.println("enter num2 value");
		num2=bf.read();
		
		max=num1>num2 ? num1:num2;
		min=num1<num2 ? num1:num2;
		
		for(int i=1;i<=min; i++) {
			x=max*i;
			if(x%min==0)
			{
				lcm=x;
				break;
			}
		}
		System.out.println("lcm:"+lcm);

	}

}
