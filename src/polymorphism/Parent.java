package polymorphism;

// Methodoverriding

public class Parent {

	void show() {
		System.out.println("show() in parent class !!"); //parent cannot be stored in child
	}
	
}
/*polymorphism 

static -- method overloading = same name different signature..return type doesn't matter...static -- at compile time


dynamic -- method overriding --dynamic at run time, object is created at run time,,same signature
*/

/*primitive
 * int a = 10 
 * float f = a // widening , implicit  int stores in float
 * int b = (int ) f ; // narrowing , explicit
 * 
 * byte -> short -> int -> long // widening
 * 
 * long -> int -> short -> byte // narrowing
 * 
 *  byte -> short -> int -> float -> double // widening
 * double -> float -> int -> short -> byte // narrowing
 * 
 * Reference 
 * class type 
 * 
 * Parent obj  = new parent ();
 * obj = new Child (); //implicit casting upcasting......create child object obj holds child
 * Child demo = (Child) obj; // down casting 
 * 
 * instance of  operator : 
 * 
 * op1 instanceof op2 if it is true then do down casting
 * 
 * 
 */
