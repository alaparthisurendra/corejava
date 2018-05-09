package info.filereading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileReadLineByLine {
	static Map<String, Integer> hashMap= new HashMap<String, Integer>();
	static BufferedReader bf=null;

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("C:\\Users\\user\\Desktop\\surendra.txt");
		bf=new BufferedReader(fileReader);
		
		String read=bf.readLine();
         while(read !=null)
         {
        	 String[] words=read.toLowerCase().split("");
        	 for(String s:words)
        	 {
        	 if(hashMap.containsKey(s)) 
        		 {
        		 hashMap.put("s", hashMap.get(s)+1);
        		 }
        	 else
        	 {
        		 hashMap.put("s", 1);
        	 }
        		 }
         }
	}

}
