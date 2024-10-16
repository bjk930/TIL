package com.lect.ex08_decimalFormat;

import java.text.DecimalFormat;

public class Ex01 {
	public static void main(String[] args) {
		double number= 1234567.8889;
		//#,0,.,%,E(������)
		DecimalFormat df1=new DecimalFormat("000000000.00000");
		DecimalFormat df2=new DecimalFormat("#########.#####");
		System.out.println(df1.format(number));
		System.out.println(df2.format(number));
		DecimalFormat df3=new DecimalFormat("#,###.##");
		System.out.println(df3.format(number));
		DecimalFormat df4=new DecimalFormat("#.#%");
		System.out.println(df4.format(number));
		DecimalFormat df5=new DecimalFormat("#.#####E00");
		System.out.println(df5.format(number));
	}
}
