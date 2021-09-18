package gen;

/*
 *泛型方法 
 */

public class gener {
	public static <M> void printList(M[] inputList) {
		for(M element : inputList) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JavaGuide中文学习");
		Integer[] intList = {1, 2, 3, 4};
		String[] stringList = {"Java", "Guide", "!!!"};
		printList(intList);
		printList(stringList);
	}
	
}
