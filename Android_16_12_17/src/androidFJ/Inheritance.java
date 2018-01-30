package androidFJ;

public class Inheritance {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		home obj = new home ();
		obj.setHomeLength(55);
	
		System.out.println("home length " + obj.getName());
	}

}


class home extends Inheritance {
	 
	public int lenght ;
	
   public	void setHomeLength (int setLenth) {
	   lenght = setLenth;
  	} 
    int getName () {
    	return lenght;
    }
}
