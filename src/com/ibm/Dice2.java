package com.ibm;

import java.util.Random;

public class Dice2 {

	public static void main(String[] args) {
		Random r = new Random();
		int n[] = new int[4];
		for(int i=1;i<=10;i++) {
			for(int a=0;a<n.length;a++) {
				n[a] = r.nextInt(6)+1;
				System.out.print(n[a]+" ");
			}
			
			if(n[0] != n[1] && n[0] != n[2] && n[0] != n[3] && n[1] != n[2] && n[1] != n[3] && n[2] != n[3]) {
				System.out.print("*");
		}
			System.out.println(" ");
	}

}
}
