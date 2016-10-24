package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex06_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("有多少學生: ");
		int num= scn.nextInt();
		int [] data=new int[num];
		System.out.println("請輸入學號: ");
		for(int i= 0; i<data.length; i++){
			data[i]=scn.nextInt();
		}
		int x=0;
		for(int j =0 ; j< data.length; j++){
		for(int i = 1; i < data.length; i++){
			if(data[i-1]>data[i]){
				continue;
			}
			else if(data[i-1]<data[i]){
				x=data[i-1];
				data[i-1]=data[i];
				data[i]=x;
			}
		}
		}
		System.out.println("學號大至小為: ");
		for(int i = 0; i < data.length; i++){
		System.out.println(data[i]);
		}
	}

}
