package Javabase;

/**
 * switch 语句中使用枚举常量
 * @author max.zhang
 *
 */
public class JudgeData {

	/*
	 * 使用switch case判断颜色
	 */
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
		default:
			System.out.println("None");
		}
	}

	public static int num(int row, int col){
		if (col == 1 || row == col){
			return 1;
		}
		int cur_num = num(row-1, col-1) + num(row-1, col);
		return cur_num;
	}

	public static void format(int rows){
		for (int i = 1; i <= rows; i++){
			for (int j = 1; j <= rows-i; j++){
				System.out.print("\t");
			}
			for (int j = 1; j <= i; j++){
				System.out.print(num(i, j) + " " + "\t");
			}

		System.out.println();
		}
	}

	public static void main(String[] args) {
		JudgeData jd = new JudgeData();
//		jd.printcolor(color.RED);
//		Calendar calendar = Calendar.getInstance();
		
//		int dayofdate = calendar.get(Calendar.DAY_OF_MONTH);
//		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
//		System.out.println("星期" + week);

//		// 打印乘法表
//		Scanner input = new Scanner(System.in);		
//		int len = input.nextInt();
//		for (int i = 1; i <= len; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + "x" + i + "=" + i*j + "\t");
//			}
//			System.out.println();
//		}
		
//		int[] numL = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int[] numR = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//		// for
//		for (int i = 0; i < numL.length; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(numR[j] + "x" + numL[i] + "=" + numL[i]*numR[j] + "\t");
//			}
//			System.out.println();
//		}
//
//		// foreach
//		for (int i : numL) {
//			for (int j : numR) {
//				if (j <= i) {
//					System.out.print(j + "x" + i + "=" + i*j + "\t");
//				}
//			}
//			System.out.println();
//		}

		format(7);

	}
}
