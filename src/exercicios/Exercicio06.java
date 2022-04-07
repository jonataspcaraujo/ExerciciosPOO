package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome, sobrenome, iniciais, dia, mes, ano;
		
		System.out.println("Insira o primeiro nome: ");
		nome=scanner.nextLine();
		System.out.println("Insira o último nome: ");
		sobrenome=scanner.nextLine();
		
		iniciais = nome.charAt(0) +". "+ sobrenome.charAt(0) + ".";
		
		System.out.println("Insira o dia de nascimento: ");
		dia=scanner.nextLine();
		System.out.println("Insira o mês de nascimento: ");
		mes=scanner.nextLine();
		System.out.println("Insira o ano de nascimento: ");
		ano=scanner.nextLine();
		
		System.out.println(nome + " " + sobrenome + ", "+ iniciais+ ", "+ dia+"/"+mes+"/"+ano + ".");
		
	}

}
