package school.cesar.q5;

import java.util.ArrayList;

import java.util.Random;

/*5 - Crie uma classe chamada ComparaListas no pacote school.cesar.q5 que possui
um método estático que compara duas listas não ordenadas de inteiros recebidas
como parâmetros e retorna um conjunto com todos os inteiros que aparecem pelo
menos uma vez em ambas as listas.
Exemplo de input: lista 1: [1, 10, 9, 0, 100, -20, 9, 10], lista2: [5, 9, 0, -10, 1000, 1,
-500, 1, -17, 19], output: [1, 9, 0].
No seu main, faça 10 simulações que gerem duas listas com valores aleatórios
entre -1000 e 1000 e chamem o método implementado por você. Imprima os
resultados na tela.*/

public class ComparaListas {
	
	public static void comparadorDeListas(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
		//secao de setup
		ArrayList<Integer> helper = new ArrayList<Integer>();
		System.out.print("lista1: ");
		System.out.println(lista1);
		System.out.print("lista2: ");
		System.out.println(lista2);
		//secao de execucao
		for (int i:lista1) {
			if (lista2.contains(i) ) {
            helper.add(i);
        	}
		}
		System.out.print("resultado: ");
		System.out.println(helper);
	}
	
	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<Integer> aux1 = new ArrayList<Integer>();
		ArrayList<Integer> aux2 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 8; j++) {
				aux1.add(generator.nextInt(2001)-1000);
			}
			for (int j = 0; j < 8; j++) {
				aux2.add(generator.nextInt(2001)-1000);
			}
			comparadorDeListas(aux1, aux2);
			aux1.clear();
			aux2.clear();
		}
	}
}
