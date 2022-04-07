package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de n�meros da sequ�ncia");
        int n = scanner.nextInt();
        scanner.nextLine();

        //contador de n�meros primos e vari�vel i para usar como �ndice
        int contadorPrimos = 0;
        int i = 1;
        while(contadorPrimos < n) {
            int contadorDivisores = 1;

            //encontre os divisores do n�mero
            for(int j = 2; j <= i; j ++) {
                if(i % j == 0) {
                    contadorDivisores ++;
                }
            }
            //ver se � primo ou n�o
            if(contadorDivisores == 2) {
                contadorPrimos ++;
                System.out.println(i);
            }
            i ++;
        }
    }
}
