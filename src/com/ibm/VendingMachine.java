package com.ibm;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int i = 1;
		int m = 0;
		while(i>0) {
		System.out.println("請投幣或選擇飲料(a,b或c),或輸入0結束:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		switch(line){
		case "1" :
		 m = m + 1;
		System.out.println("目前餘額:"+ m);
		break;
		case "5" :
			 m = m + 5;
			System.out.println("目前餘額:"+ m);
			break;
		case "10" :
			 m = m + 10;
			System.out.println("目前餘額:"+ m);
			break;
		case "a" :
			 m = m - 15;
			System.out.println("目前餘額:"+ m);
			break;
		case "b" :
			 m = m - 20;
			System.out.println("目前餘額:"+ m);
			break;
		case "c" :
			 m = m - 30;
			System.out.println("目前餘額:"+ m);
			break;
		case "0" :
			i=0;
			System.out.println("Bye");
		
		}
		}
		
	}

}
