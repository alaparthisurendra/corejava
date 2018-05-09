package info.numberofjumpsforathieftocrosswalls;

public class Numberofjumpsthief {
	/*Sample Input 2: 5:1:2:{9,10} ==Here Muthooswamy can jump 5 metres height but slides down by 1 metre. He has 2 walls to jump and the height of each wall is 9 and 10 metres respectively.

	While crossing the first wall, Muthooswamy takes 2 attempts because during the first attempt he jumps 5 metres but slides down by 1 metre since he didn't cross the wall. In the next attempt he jumps 5 more metres from that position and this time he doesn't slide because he crossed the wall in this attempt because 4+5=9 and 9 metres is the actual height of the wall.

	Similarly while crossing the second wall, Muthooswamy takes 3 attempts because during his second attempt on this wall, he slides down by 1 metre since 4+5=9 and the height of the wall is 10 metres. During his third attempt, Muthooswamy was able to escape from ***

	Sample Output 2: 5*/

	public static void main(String[] args) {
		int height[] ={9,10};
        int x=5,y=1, n=2;
		/*int x = 10, y = 1;
		// n=number of walls
		//int n = height.length;
		int n=1;*/
       System.out.println(Jumpcount(x, y, n, height));
	}

	private static int Jumpcount(int x, int y, int n, int[] height) {
		int jumps = 0;
		for (int i = 0; i < n; i++) {
			if (height[i] <= x) {
				jumps++;
				continue;
			}
			// height of wall is greater than up move
			int h = height[i];
			while (h > x) {
				jumps++;
				h = h - (x - y);
			}
			jumps++;
		}
		return jumps;

	}

}
