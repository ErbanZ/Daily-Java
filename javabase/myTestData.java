package javabase;

class Demo{
	public static void print123(){
		System.out.println(123);
	}

}

public class myTestData {
	public static void printClassName(Object obj){
		System.out.println("类名：" + obj.getClass().getName());
		System.out.println("父类：" + obj.getClass().getSuperclass().getName());

		System.out.println("该对象接口：");
		for(int i = 0; i < obj.getClass().getInterfaces().length; i++){
			System.out.println(obj.getClass().getInterfaces()[i]);
		}
	}


	public static void main(String[] args) {

//		DataClass data1 = new DataClass();
//		System.out.println("name: " + data1.name);
//		System.out.println("age: " + data1.age);
//		System.out.println("website: " + data1.WEBSITENAME);
//		System.out.println("URL: " + data1.URL);

//		Demo d = new Demo();
//		System.out.println(d);
//		System.out.println(d.toString());

//		String s = new String("123");
//		printClassName(d);
//		System.out.println(s);

		int[] arr = new int[10];

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;

		for(int i : arr){
//			System.out.println(i);
			continue;
		}

		int[][] arr2 = new int[3][3];
		for(int i = 0; i < arr2.length; i++){
			for(int j = 0; j < arr2[0].length; j++){
//				System.out.print(arr2[i][j] + "\t");
				continue;
			}
//			System.out.println();
			continue;
		}

		int[][] arr3 = new int[3][];
		arr3[0] = new int[3];
		arr3[1] = new int[4];
		arr3[2] = new int[5];
		for(int[] i : arr3){
			for(int j : i){
				System.out.print(j + "\t");
			}
			System.out.println();
		}



	}

}
