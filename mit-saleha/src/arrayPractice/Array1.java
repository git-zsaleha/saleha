package arrayPractice;

public class Array1 {
	//Create an array of 5 floats and calculate their sum.
	/*public static void main(String[] args) {
		float[] marks= {5.5f,10.0f,15.5f,20.5f,25.5f};
		float sum=0;
		for(float element:marks) {
			sum= sum+element;
			
		}
		System.out.println("The value of sum is.."+sum);
	}
}*/
	//Given number is peresent or not in the array.
	public static void main(String[] args) {
		float[] marks= {5.5f,10.0f,15.5f,20.5f,25.5f};
		float num=15.7f;
		boolean IsAnArray=false;
		
		for(float element:marks) {
			if(num==element) {
				IsAnArray=true;
				break;
			}
			
		}
		if(IsAnArray) {
			System.out.println("The value is peresent in the array");
		}
		else {
		System.out.println("The value is not peresent in the array");
		}
	}
}

	
