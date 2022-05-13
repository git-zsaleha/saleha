package Class;

	public class ClassDemoSub1 extends ClassDemo{//we have created a class which is subclass of another class 
		void met() {
			//System.out.println(pri);//- CLASS SCOPE
			System.out.println(nomod);
			System.out.println(pro);
			System.out.println(pub);
		}
	}

	//sub class 
	class Bird{} //-class
	class Eagle extends Bird{}//- subclass - inheritance


