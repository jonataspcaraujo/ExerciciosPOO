package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num01, num02;
		
		System.out.println("Insira o primeiro n�mero: ");
		num01=scanner.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		num02=scanner.nextInt();
		
		if ((num01 % num02) == 0)
			System.out.println("Esse n�mero � divis�vel");
		else
			System.out.println("Esse n�mero n�o � divis�vel");
	}


}
