package day17staticblock;

public class Sb02 {
	 
	int x=10;//instance variable obje olmadan ulasilamaz
	
	
	public static void main(String[] args) {
		Sb02 obj = new Sb02();
		System.out.println(obj.x);

	}
	static {
		int x=20;
		System.out.print(x+" ");
	}
	
	
}
