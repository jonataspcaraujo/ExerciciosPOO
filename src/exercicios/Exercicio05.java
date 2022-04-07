package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome, sobrenome, iniciais;
		
		System.out.println("Insira o primeiro nome: ");
		nome=scanner.nextLine();
		System.out.println("Insira o último nome: ");
		sobrenome=scanner.nextLine();
		
		iniciais = nome.charAt(0) +". "+ sobrenome.charAt(0) + ".";
		System.out.println(nome + " " + sobrenome + ", "+ iniciais);
		
	}

}
