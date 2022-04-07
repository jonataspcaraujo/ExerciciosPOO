package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num01, num02;
		
		System.out.println("Insira o primeiro número: ");
		num01=scanner.nextInt();
		System.out.println("Insira o segundo número: ");
		num02=scanner.nextInt();
		
		if ((num01 % num02) == 0)
			System.out.println("Esse número é divisível");
		else
			System.out.println("Esse número não é divisível");
	}


}
