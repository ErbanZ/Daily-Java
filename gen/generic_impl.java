package gen;

public class generic_impl<T> implements generic_interface<T>{

	@Override
	public T m1() {
		System.out.println("m1()");
		System.out.println("m1()");
		return null;
	}
	
	public static void main(String[] args) {
		generic_impl<String> implementer = new generic_impl<String>();		
		
		implementer.m1();
	}
}
