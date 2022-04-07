package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static boolean eDivisivel(int n, int divisor) {
		return n%divisor==0;
	}

	public static boolean ePrimo(int n)	{ 
		int quantidade=0;
		for(int i=1; i<=n; i++){
			if (eDivisivel(n,i))
				quantidade++;
		}
		if (quantidade==2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Insira o número: ");
		num=scanner.nextInt();
		if (ePrimo(num))
			System.out.println("Esse número é primo");
		else
			System.out.println("Esse número não é primo");
	}

}
