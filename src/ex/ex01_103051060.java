package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入正整數n: ");
		int n = scn.nextInt();
		int x = 1;
		for(int i =1;i<=n;i++){
			x=x*i;
		}
		System.out.print("n!為: "+x);
	}

}
