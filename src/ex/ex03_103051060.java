package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入正整數n: ");
		int n = scn.nextInt();
		long x =0;
		for(int i = 1; i<=n;i++){
			x=x+(int)Math.pow(2,i);
		}
		System.out.print("值為: "+x);
	}

}
