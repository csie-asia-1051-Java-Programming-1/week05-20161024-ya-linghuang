package hw;
/*
有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣
 * Date: 2016/10/24
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw05_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n (1＜n＜21)，將繪出方陣: ");
		int n =scn.nextInt();
		int data [][]= new int[n][n];
		int num = 1;
		if(n>1&&n<21){
			for(int i=0 ; i<=(n-2) ; i++){																	//左上排給值
				int k=i;
				for(int j=0 ; j<=i ; j++){
					data[k][j]=num;
					num+=1;
					k=k-1;
				}
			}
			for(int j=0 ; j<=(n-1) ; j++){																	//右下排給值
				int k=j;
				for(int i=(n-1) ; i>=j ; i--){
					data[i][k]=num;
					num+=1;
					k=k+1;
				}
			}
			for(int i=0 ; i<n ; i++){																	//列出方陣
				for(int j=0 ; j<n ; j++){
					System.out.print(data[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
		else{
			System.out.println("請輸入1＜n＜21範圍內的值!");
		}
	}
}
