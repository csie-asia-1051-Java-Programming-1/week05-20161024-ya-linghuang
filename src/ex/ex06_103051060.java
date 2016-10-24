package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 103051060 黃雅鈴
 */

public class ex06_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data={10,20,90,70,30};
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
		for(int i = 0; i < data.length; i++){
		System.out.println(data[i]);
		}
	}

}
