package polymorphism;

public class Child extends Parent { // method overriding inheritance is must 
	//string show(string msg)  cannot take same method ..with different return type ... method over loading  in child.
	
	void show () {
		
		System.out.println("show() in child class !");
		
	}
	
	void display() {
		System.out.println("display () in child class!");
	}
	
	public static void main (String[] args) {
		
		Parent parent = new Parent ();
		parent.show();
		
		//parent = new Child(); needs to write ..because it creates child obj . no compile error but get error in run time
		parent = new Child(); // object is created at run time but check parent class for reference in compile time .upcasting implicit(automatically)
		
		parent.show(); // parent  specific .. it is in parent class 
		
		if (parent instanceof Child) /* parent = new Child(); is not created then it can be used . if it return true then down casting needed
		 but it return false no need to do down casting..if  parent = new Child(); commented or not created in this pro .if (parent instanceof Child) 
		 will check child obj is created or not ..if it is created it return true and down casting is done and if child obj is not created then it will
		 return false and no further execution is done */
			
		//parent.display(); // child specific ...error .. check in parent class no method found in compile time need down casting
		
		((Child)parent).display(); // down casting, explicit casting
		
	}

}
