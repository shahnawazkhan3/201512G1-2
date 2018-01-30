package androidFJ;

public class ModifierTypes {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
//	
//	//////////////////////////Access Control Modifiers /////////////////////////
//	Java provides a number of access modifiers to set access levels for classes, variables, methods and constructors. The four access levels are 
//
//	Visible to the package, the default. No modifiers are needed.
//	Visible to the class only (private).
//	Visible to the world (public).
//	Visible to the package and all subclasses (protected).
//	/////////////////////Non-Access Modifiers //////////////////////////////
//	Java provides a number of non-access modifiers to achieve many other functionality.
//
//	The static modifier for creating class methods and variables.
//
//	The final modifier for finalizing the implementations of classes, methods, and variables.
//
//	The abstract modifier for creating abstract classes and methods.
//
//	The synchronized and volatile modifiers, which are used for threads.
	
	
	
	/////////////////////Java - Access Modifiers/////////////////////
//	
//	
//	Visible to the package, the default. No modifiers are needed.
//	Visible to the class only (private).
//	Visible to the world (public).
//	Visible to the package and all subclasses (protected).

	
	//////////////////////Private Access Modifier - Private/////////////////
//	
//	Visible to the package, the default. No modifiers are needed.
//	Visible to the class only (private).
//	Visible to the world (public).
//	Visible to the package and all subclasses (protected).
//	Default Access Modifier - No Keyword
//	Default access modifier means we do not explicitly declare an access modifier for a class, field, method, etc.
//
//	A variable or method declared without any access control modifier is available to
//	any other class in the same package. The fields in an interface 
//	are implicitly public static final and the methods in an interface are by default public.
	
	
	
	
	
	
	
	////////////////////Java - Non Access Modifiers/////////////////
	
//	ava provides a number of non-access modifiers to achieve many other functionalities.
//
//	The static modifier for creating class methods and variables.
//
//	The final modifier for finalizing the implementations of classes, methods, and variables.
//
//	The abstract modifier for creating abstract classes and methods.
//
//	The synchronized and volatile modifiers, which are used for threads.
	
//	///////////////////////////Static Methods//////////////////
	
	
//	The static keyword is used to create methods that will exist independently of any instances created for the class.
//
//	Static methods do not use any instance variables of any object of the class they are defined in. Static methods take all the data from
//	parameters and compute something from those parameters, with no reference to variables
	
	//////////////////example /////////////////////////////
	
//	 private static int numInstances = 0;
//
//	   protected static int getCount() {
//	      return numInstances;
//	   }
//
//	   private static void addInstance() {
//	      numInstances++;
//	   }
//
//	   ModifierTypes() {
//		   ModifierTypes.addInstance();
//	   }
//
//	   public static void main(String[] arguments) {
//		   
//	      System.out.println("Starting with " + ModifierTypes.getCount() + " instances");
//
//	      for (int i = 0; i < 500; ++i) {
//	         new ModifierTypes();
//	      }
//	      System.out.println("Created " + ModifierTypes.getCount() + " instances");
//	   }
	
	/////////////////////////The Final Modifier////////////////////////////////////
	
//	A final variable can be explicitly initialized only once. A reference variable declared final can never be reassigned to refer to an different object.
//
//	However, the data within the object can be changed. So, the state of the object can be changed but not the reference.
//
//	With variables, the final modifier often is used with static to make the constant a class variable.
	
	
	
//	public class Test {
//		   final int value = 10;
//
//		   // The following are examples of declaring constants:
//		   public static final int BOXWIDTH = 6;
//		   static final String TITLE = "Manager";
//
//		   public void changeValue() {
//		      value = 12;   // will give an error
//		   }
//		}
	///////////////Final Methods///////////////
////	A final method cannot be overridden by any subclasses. 
//	As mentioned previously, the final modifier prevents a method from being modified in a subclass.
	
//	
//	public class Test {
//		   public final void changeName() {
//		      // body of method
//		   }
//		}
	
	
	////////////////////The abstract Modifier///////////////////
	
//	An abstract class can never be instantiated. If a class is declared as abstract then the sole purpose is for the class to be extended.
//
//	A class cannot be both abstract and final (since a final class cannot be extended). If a class contains abstract methods then the class should be declared abstract. Otherwise, a compile error will be thrown.
//
//	An abstract class may contain both abstract methods as well normal methods.
	
	
	
//	abstract class Caravan {
//		   private double price;
//		   private String model;
//		   private String year;
//		   public abstract void goFast();   // an abstract method
//		   public abstract void changeColor();
//		}
	
	
//	////////////////////////////////////Abstract Methods//////////////////////////
//	An abstract method is a method declared without any implementation. The methods body (implementation) is provided by the subclass. Abstract methods can never be final or strict.
//
//	Any class that extends an abstract class must implement all the abstract methods of the super class, unless the subclass is also an abstract class.
//
//	If a class contains one or more abstract methods, then the class must be declared abstract. An abstract class does not need to contain abstract methods.
//
//	The abstract method ends with a semicolon. Example: public abstract sample();
	
	
	

	
}
