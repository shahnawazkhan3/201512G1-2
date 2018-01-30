package androidFJ;

 class Bike{
	
	public void gear(){
		System.out.println("This is gear method");
		
	}
	
	public void run(){
		System.out.println("Bike is running");
	}
	
	Bike(){
		System.out.println("Bike is created");
	}
}

class Biker extends Bike{
	
	@Override
	public void gear(){
	super.gear();
		System.out.println("gear is changed");
	}
}


public class Abstraction16_12_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Biker obj=new Biker();
obj.gear();

	}

}
