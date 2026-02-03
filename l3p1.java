class Lab3p1{

	static int i=0;
  	public static void display(){
		System.out.println(i);
	}	
	public int show(){

		return i;
		}
}
class B extends Lab3p1{
	
	static int neu=1;
	public static void display(){
	
		System.out.println(i+neu);
		}
	public int show(){


		return i+neu;
		}

	public void pear1(){
		System.out.println("I  am B child of A");	
	}
}
class Main{
	public static void main(String[]  args){
		B b=new B();
		b.display();
		b.pear1();
	}
}
