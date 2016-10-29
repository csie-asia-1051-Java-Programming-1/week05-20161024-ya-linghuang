package hw;
/*
讓使用者輸入一正整數n，計算1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
 * Date: 2016/10/24
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw04_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一正整數n，將輸出1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]之結果: ");
		int n = scn.nextInt();
		double sum=0;												//小數點後位數會越來越多用double
		int x=(2*n-1);
		for(int i=1 ; i<=x ; i+=2){
			sum=sum+(double)1/(i*(i+1));				//注意i是int要轉double
		}
		System.out.println("結果為: "+sum);
	}

}
