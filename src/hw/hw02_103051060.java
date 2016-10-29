package hw;
/*
讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
 * Date: 2016/10/24
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n，將輸出1+2+3+…+m<=n的最大整數m: ");
		int n=scn.nextInt();
		int x=0;//總值
		int m=1;
		for(int i=1 ; x<=n ; i++){			//i多一圈
			x=x+i;										//x才剛好停
			m=i;
		}
		m=m-1;										//因此要把多算的一圈減回來
		System.out.print("m="+m);
	}
}
