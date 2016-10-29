package hw;
/*
設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000
 * Date: 2016/10/24
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入正整數n，將輸出m(n的m次方會大於10000): ");
		int n = scn.nextInt();
		int m=1;
		int sum=0;	
		for(int i=1 ; sum<=10000 ; i++){		//i會多算一圈  
			sum=(int)Math.pow(n, m);				//EX. n=10，算到sum=10000 仍進入 i=5的迴圈算，此時 sum=100000才符合停止條件，而m=5(但此時為4次方而已)
			m=i;
		}
		m=m-1;													//因此要把多算那圈減掉
		System.out.println("m= "+m);
	}

}
