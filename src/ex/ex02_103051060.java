package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入正整數n: ");
		int n = scn.nextInt();
		int x=1;
		int i =1;
		while(i<=n){
			x=x*i;
			i++;
		}
		System.out.print("n!為: "+x);
	}

}
