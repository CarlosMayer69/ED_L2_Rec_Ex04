package view;

import controller.FatorialDuploController;

public class Principal {

	public static void main(String[] args) {
		
		
		int n = 5; // Aqui podemos substituir por n�mero(s) inteiro(s)
		//positivo(s) �mpar(es), conforme desejado.
		//int n = 3; TESTE
		//int n = 4; TESTE
		
		FatorialDuploController fd = new FatorialDuploController();
		
        if (n % 2 == 0) {
            System.out.println("O n�mero precisa ser �mpar.");
            return;
        }

        long fatorialDuplo = fd.calcularFatorialDuplo(n);
        
        System.out.println("Fatorial duplo de " + n + " �: " + fatorialDuplo);
    }
}


