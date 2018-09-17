package com.dev.core.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Factorial_using_BigDecimal {

	public static void main(String[] args) {
		Factorial_using_BigDecimal t = new Factorial_using_BigDecimal();
		System.out.println("enetr the number");
		int num = Integer.parseInt(new Scanner(System.in).nextLine());
		
	t.fibo(num);

	}

	private void fibo(int num) {
	BigDecimal i = new BigDecimal(0);
	BigDecimal j = new BigDecimal(1);
if(num>1) {
	for(int a=1;a<=num;a++) {
		BigDecimal temp = new BigDecimal(0);
    temp=i.add(j);
	i=j;
	
	j=temp;
	
	System.out.println(temp+" ");
	}
}
		
	}

}
