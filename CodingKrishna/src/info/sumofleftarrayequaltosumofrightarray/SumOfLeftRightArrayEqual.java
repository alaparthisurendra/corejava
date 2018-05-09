package info.sumofleftarrayequaltosumofrightarray;

public class SumOfLeftRightArrayEqual {

	public static void main(String[] args) {
		int[] array= {1,4,2,5,3,4};
		int size=array.length;
		System.out.println(findElement(array, size));
	}
	private static int findElement(int[] array, int size) {
		int[] prefix=new int[size];
		prefix[0]=array[0];
		for(int i=1; i<size; i++)
		{
			prefix[i]=prefix[i-1]+array[i];
		}
		
		int[] suffix=new int[size];
		suffix[size-1]=array[size-1];
		for(int i=size-2; i>=0; i--)
		{
			suffix[i]=suffix[i+1]+array[i];
		}
		
		for(int i=0;i<size; i++)
		{
			if(prefix[i]==suffix[i]) {
				return array[i];
			}
		}
		return -1;
	}

}
