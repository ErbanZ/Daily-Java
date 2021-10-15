package javabase;
import java.util.Comparator;

/**
 * @Author max.zhang
 * @Date 2021/10/15 11:42
 * @Description 比较器
 */
public class myComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer int1, Integer int2){
		// 升序
//		return int1 - int2;
		// 降序
		return int2 - int1;
	}

}
