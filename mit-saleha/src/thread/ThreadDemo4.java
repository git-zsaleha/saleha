package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{SingleTon.createObject();});
		es.execute(()->{SingleTon.createObject();});
		
		es.shutdown();
	}
}


class SingleTon{
	private SingleTon() {
		System.out.println("singlton cons called...");
	}
	private static SingleTon single;
	//we get a problem called - Double dip problem
	//using synchronized you restrict the access of this method by multiple threads at the same time
	synchronized public static SingleTon createObject() {
		if(single==null) {
			single=new SingleTon();
		}
		return single;
	}
}
