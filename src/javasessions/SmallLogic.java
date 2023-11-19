package javasessions;

public class SmallLogic {
	public void m1() {
		System.out.println("from m1");
	}
	public  int m2() {
		System.out.println("from m2");
	    int  a=4;
	    int b =9;
	    int c =a+b*35;
		return c;
	}
	public boolean check() {
		System.out.println("check element is prsent or not");
		return false;
	}
	public static void main(String[] args) {
		SmallLogic sl = new SmallLogic();
		
		System.out.println(sl.m2());
	}

}
