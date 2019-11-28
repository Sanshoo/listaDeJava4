package school.cesar.q4;

import java.security.InvalidParameterException;

import java.util.ArrayList;

import java.util.Scanner;

public class ContadorDeLetras {
	
	static String contadorDeLetras(String alvo) {
		//secao de validacao
		for (int a = 0; a < alvo.length(); a++) {
			if (alvo.charAt(a) == ' ') {
				
			}
			else if (alvo.charAt(a) < 48 || alvo.charAt(a) < 65  && alvo.charAt(a) > 57 || alvo.charAt(a) > 90 && alvo.charAt(a) < 97 || alvo.charAt(a) > 122) {
				throw new InvalidParameterException("Erro: Parametro Invalido");
			}
		}
		//secao de setup
		String storageOne = new String();
		ArrayList<Integer> storageTwo = new ArrayList<Integer>();
		boolean copycheck = false; 
		//secao de execucao
		for (int a = 0; a < alvo.length(); a++) {
			for (int b = 0; b < storageOne.length();  b++) {
				if (alvo.charAt(a) == storageOne.charAt(b)) {
					copycheck = true;
					storageTwo.set(b, (storageTwo.get(b) + 1));
				}
			}
			if (copycheck == false) {
				storageOne = storageOne + alvo.charAt(a);
				storageTwo.add(1);
			}
			copycheck = false;
		}
		//secao de setup (do retorno)
		String retorno = new String();
		//secao de execucao (do retorno)
		retorno = "A frase " + alvo + " contem: \n";
		for (int a = 0; a < storageOne.length(); a++) {
			if (storageOne.charAt(a) == ' ') {
				retorno = retorno + storageTwo.get(a) + " instancias do caractere de espaco\n";
			}
			else {
				retorno = retorno + storageTwo.get(a) + " instancias do caractere " + storageOne.charAt(a) + "\n";
			}
		}
		return retorno;
	}
	
	public static void main(String[] args) {
		System.out.println("Digite aqui a frase que vc quer que seja contabilizada: ");
		Scanner myscan = new Scanner(System.in);
		String frase = myscan.nextLine();
		myscan.close();
		System.out.println(contadorDeLetras(frase));
	}
		
}
