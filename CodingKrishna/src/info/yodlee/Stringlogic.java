package info.yodlee;

public class Stringlogic {

	public static void main(String[] args) {
		String name="input of str";
		Stringlogic s1=new Stringlogic();
		System.out.println(s1.method(name));
	}

	private String method(String name) {
		char[] ch=name.toCharArray();
		//System.out.println(ch.length);
		for(int i=0; i< ch.length;i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
				char temp=ch[k];
				ch[k]=ch[i-1];
				ch[i-1]=temp;
			}
			
		}
		return new String(ch);
		
	}

}
