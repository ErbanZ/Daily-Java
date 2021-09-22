package Javabase;
import Javabase.color;

/**
 * switch 语句中使用枚举常量
 * @author max.zhang
 *
 */
public class JudgeData {

	public void printcolor(color col) {
		switch(col) {
		case BLACK:
			System.out.println("1");
			break;
		case WHITE:
			System.out.println("2");
			break;
		case RED:
			System.out.println("NOTHING");
			break;
		}
	}
	
	public static void main(String[] args) {
		JudgeData jd = new JudgeData();
		jd.printcolor(color.RED);
	}
}
