package Class;

public class ClassDemoNonSub {
	void met() {
		ClassDemo obj=new ClassDemo();
		//System.out.println(obj.pri);//- CLASS SCOPE
		System.out.println(obj.nomod);// - PACKAGE SCOPE
		System.out.println(obj.pro);//- RELATION SCOPE
		System.out.println(obj.pub);//- GLOBAL SCOPE
	}

}
