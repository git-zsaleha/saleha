package condition;

public class CondDemo2 {
	public static void main(String[] args) {
		String date="07 february 2022";
	    String month=date.substring(3,6);
	    System.out.println(month);
		
	    if(month.equals("feb")) {
	    	System.out.println("february month....");
	    }
	    else if(month.equals("jan")) {
	    	System.out.println("january month....");
	    } 
	    else if(month.equals("mar")) {
	    	System.out.println("march month....");
	    }
	    else {
	    	System.out.println("wait i am yet to check....");
	    }
	}

}
