package exercicios;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Integer valor1 = 10;
		Integer valor2 = 30;
		int comparar;

		if (valor1.equals(valor2)){
		    System.out.println("S�o iguais");
		    
		}else{	
			comparar=valor1.compareTo(valor2);
		if (comparar > 0)
		    		System.out.println("valor1 � maior que valor2");
			else
		    		System.out.println("valor2 � maior que valor1");
		}		
	}
}
