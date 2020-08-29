package com.bin2dec;

import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("NUMBER IN BINARY:");
		String binary = scanner.next();
		while(binary.length()> 8) {
			System.out.print("NUMBER IN BINARY(MAX 8 BITS):");
			binary = scanner.next();
		}
		
		int pot = 0;
		int dec=0;
			for(int i= binary.length()-1; i >= 0; i--) {
				int zeroOne = Character.getNumericValue(binary.charAt(i));
				if(zeroOne != 0 && zeroOne != 1) {
					System.out.print("DIGIT DIFFERENT OF 0 OR 1\n");
					System.exit(0);
				}else {
				dec += Math.pow(2, pot) * zeroOne ;
				pot++;
				}
			}
		System.out.println( binary + " IN DECIMAL IS: " + dec);
	}
}
