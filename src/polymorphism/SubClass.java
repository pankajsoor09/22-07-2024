package polymorphism;

public class SubClass extends SuperClass {
	
void display (String msg) {
		
		System.out.println("display(String) in superclass");
		System.out.println("Message is :"+msg);
}

void print () {
	System.out.println("print() in subClass");
}
 
public static void main(String[] args) {
	SuperClass obj = new SuperClass();
	obj.display("hello");
	
	obj = new SubClass();// up casting
	obj.display("hi");
	if(obj instanceof SubClass) // it is true so it will do down casting
		
		((SubClass)obj).print();// down casting
}
}