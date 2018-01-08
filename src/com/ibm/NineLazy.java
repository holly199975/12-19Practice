package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		for(int i= 1;i <= 9;i++) {
			for(int n = 2;n <= 9;n++) {
				if(i>3 && i<9) {
					System.out.print(" "+"..."+"\t");
				}else
				System.out.print(n+"*"+i+"="+(n*i)+"\t");
			}
			System.out.println();
		}
		
	}

}
