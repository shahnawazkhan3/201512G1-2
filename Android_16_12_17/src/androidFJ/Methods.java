



package androidFJ;

public class Methods {

	
	public void setAge() {
		int age = 23;
		System.out.println("shah" + age);
		
	}
	
	public String  name ;
	
	 public void setName (String setN ) {
		 name = setN;
		
		 
	 }
	 
	 String getName () {
		 return name ;
	 }
	 
	 //// constructor ////////////////
	 
	 Methods () {
		 System.out.println("constructor 1" );
		 
		 }
	 
	 ///// overloding/////
	 
	  public int salary ;
	 public void overloading ( int empSalry) {
		 salary = empSalry ;
	 }
	 public String  bossSalary ;
	 
	 public void overloading (String  bossSl ) {
		 bossSalary = bossSl ;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods obj = new Methods ();
		obj.setAge();
		
		obj.setName("david");
		
		 System.out.println("compny name"  +obj.getName());
		
	}

}
