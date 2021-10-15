package gen;

/**
 * 泛型接口实现
 */

public class generic_impl<T> implements generic_interface<T>{

	@Override
	public T m1() {
		System.out.println("m1()");
		System.out.println("m1()");
		return null;
	}

	public static void printClass(Object obj){
		System.out.println("该类的接口：");
		for(int i = 0; i < obj.getClass().getInterfaces().length; i++){
			System.out.println(obj.getClass().getInterfaces()[i]);
		}

	}
	
	public static void main(String[] args) {
		generic_impl<String> implementer = new generic_impl<String>();		

//		implementer.m1();
		printClass(implementer);

	}
}
