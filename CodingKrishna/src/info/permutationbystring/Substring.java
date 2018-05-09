/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.permutationbystring;

public class Substring {
    
    public static void main(String[] args)
    {
      System.out.println( Method("suri"));
    }
   
    public static String Method(String s1)
            
    {
        String suri;
       
            
        if(s1.length()==0)
        {
            return null;
        }
        else
        {
            suri=s1.substring(0)+s1.substring(1);
        }
        return suri;
}
    
   
}
