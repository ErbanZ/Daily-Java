package gen;

//此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
//在实例化泛型类时，必须指定T的具体类型

/**
 * 泛型类
 */
public class generic_class<T> {

	private T key;

	public generic_class(T key) {
      this.key = key;
	}

	public T getKey() {
      return key;
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generic_class<Integer> genericInteger = new generic_class<Integer>(123456);
		System.out.println(genericInteger.getKey());
	}
	
}
