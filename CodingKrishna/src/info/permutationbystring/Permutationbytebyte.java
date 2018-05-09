/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.permutationbystring;

import java.util.ArrayList;
import java.util.List;


public class Permutationbytebyte {
    
    public List<String> Permutations(String s)
    {
        List<String> result=new ArrayList<String>();
        Permutation("", s, result);
        return result;
    }

    private void Permutation(String prefix, String suffix, List<String> result) {
        if(suffix.length()==0)
        {
            result.add(prefix);
        }
        else
        {
            for(int i=0; i<suffix.length();i++)
            {
                Permutation(prefix+suffix.charAt(i), suffix.substring(0, i)+
                        suffix.substring(i+1, suffix.length());
            }
        }
      
    }
    
    
}
