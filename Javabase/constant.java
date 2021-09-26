package Javabase;

/**
 * to: https://www.cnblogs.com/dolphin0520/p/3736238.html
 * @author max.zhang
 * 
 */
public class constant {

	public static void main(String[] args) {
		myTestconstant constant1 = new myTestconstant();
		myTestconstant constant2 = new myTestconstant();
		
		System.out.println(constant1.i);
		System.out.println(constant1.j);
		System.out.println(constant2.i);
		System.out.println(constant2.j);


	}


}

class myTestconstant {
	// final的作用是用来保证变量不可变
	public final double i = Math.random();
	
	// static作用于成员变量用来表示只保存一份副本
	public static double j = Math.random();
}
