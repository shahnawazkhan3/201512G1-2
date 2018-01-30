package androidFJ;


class One {
	
public void One(){
	System.out.println("No parameter");
}
int x,y;
public void One(int a, int b){
	System.out.println("int , int");
}
double c;int d;
public void One (double c, int d){
	this.c=c;
	this.d=d;
	System.out.println("double , int");
	
}
}
public class MethodOverloading16_12_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
One obj =new One();
obj.One();
obj.One(2,1);
obj.One(2.2,1);
	}

}
