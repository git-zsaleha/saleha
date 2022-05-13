package arrayPractice;

public class Array3 {
	public static void main(String[] args) {
		int twod[][]= {
				{12,24,36,48},{10,20,30,40},{2,4,6,8}
		};
		System.out.println(twod[0][0]);
		System.out.println(twod[2][3]);
		System.out.println(twod.length);
		System.out.println(twod[2][3]);
		int twodd [][]=new int[3][4];
		
		System.out.println(twod[0][0]);
		System.out.println(twod[2][3]);
		twodd [0][0]=9999;
		System.out.println(twodd[0][0]);
		System.out.println(twodd[0][2]);
		
		int twodue[][]=new int [3][];
		twodue[0]=new int [4];
		twodue[1]=new int [2];
		twodue[2]=new int [7];
	}

}
