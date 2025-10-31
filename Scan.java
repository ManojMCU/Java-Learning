package acessModifier1;

import java.util.Scanner;

public class Scan {
	static void  add(int a, int b) {
		int c = a+b;
		System.out.println("added value:"+c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name:");
		String a1 = sc.nextLine();
        System.out.println("Name:"+a1);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter float");
        float c = sc.nextFloat();
        System.out.println("enter boolean");
        boolean d = sc.nextBoolean();
        add(a,b);
	}

}
