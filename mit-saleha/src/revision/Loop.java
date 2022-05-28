package revision;

public class Loop {

     public static void main(String[] args) {
    	 int i=10;
    	 
		while(i>0) {
			System.out.println("saleha"+i);
		}
		do {
			System.out.println("loop is still executed..");
		}
		while(i<10);
		do {
			System.out.println("do while i value is....."+i);
			i++;
			
		}while(i<10);
	}
}
