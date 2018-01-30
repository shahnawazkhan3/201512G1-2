package androidFJ;

class Calculation{
	double a,b,c;
	
}
class addition extends Calculation{
	
	
	public void add(double x, double y){
		a=x;
		b=y;
		
		c=a+b;
		System.out.println("addition: "+c);
	}
	public void setdata(double x,double f){
		this.a=a;
		this.b=f;
		}
	
	public void getdata(){
		c=a-b;
		System.out.println("Substraction"+c);
	}
	
}







public class Inheritence16_12_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addition obj =new addition();

obj.add(5.5, 7);
	obj.setdata(6.6,2);
	obj.getdata();
	
	}

}
