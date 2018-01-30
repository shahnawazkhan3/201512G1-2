package androidFJ;


class parentclass{
	
	parentclass(){
		
		System.out.println("Default Constructor");
	}
	
	int a,b;
	parentclass(int a, int b){
		this.a=a;
		this.b=b;
		
		int c=a+b;
		System.out.println("Parameter of constructor"+c);
		
	}
	
}
public class Overloading16_12_17new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parentclass obj=new parentclass();
parentclass obj1=new parentclass(2,4);

	}

}
