/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.permutationbystring;

import java.util.Scanner;

public class NumbertoBinary {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        System.out.print("enter your value");
        numberToBinary(n);
        System.err.println("sucess");
}

    private static String numberToBinary(int n) {
        String rev="";
        if(n==0 && n<=0)
        {
            return null;
        }
        while(n>0)
        {
            int rem = n%2;
            rev=rem+rev;
            n=n/2;  
        }
       return rev;
    }
}
