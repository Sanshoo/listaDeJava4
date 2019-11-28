package school.cesar.q2;

import java.security.InvalidParameterException;

import java.util.Scanner;

public class ConversorMorse {
	
	static String conversorMorseChar(String morse) {
		//secao de validacao
		for (int i = 0; i < morse.length(); i++) {
			if (morse.charAt(i) != ' ' && morse.charAt(i) != '.' && morse.charAt(i) != '-') {
				throw new InvalidParameterException("Erro: Parametro Invalido");
			}
		}
		//secao de setup
		String bigStor = new String();
		String smalStor = new String();
		int currIndexStor = 0;
		//secao de execucao
		for (int i = 0; i < morse.length(); i++) {
			if (morse.charAt(i) == ' ') { // se for espaco ele detecta o fim de um codigo de letra e passa pro decode
				smalStor = smalStor + morseToChar(morse.substring(currIndexStor, i));
				if (morse.charAt(i+1) == ' ') { // se for espaco duplo ele detecta o fim de uma frase e manda tudo pro bigStor
					bigStor = bigStor + smalStor + " ";
					smalStor = "";
					currIndexStor = i+2; //atualizando o novo Index da proxima palavra
					i = i+1; 
				}
				else {
					currIndexStor = i+1; //atualizando o novo index da proxima letra
				}
			}
		}
		smalStor = smalStor + morseToChar(morse.substring(currIndexStor, morse.length()));
		bigStor = bigStor + smalStor;
		return bigStor;
	}
	
	static String conversorCharMorse (String morse) {
		//secao de validacao
		for (int a = 0; a < morse.length(); a++) {
			if (morse.charAt(a) == ' ') {
				
			}
			else if (morse.charAt(a) < 48 || morse.charAt(a) < 65  && morse.charAt(a) > 57 || morse.charAt(a) > 90 && morse.charAt(a) < 97 || morse.charAt(a) > 122) {
				throw new InvalidParameterException("Erro: Parametro Invalido");
			}
		}
		//secao de setup
		String bigStor = new String();
		//secao de execucao
		for (int i = 0; i < morse.length(); i++) {
			if (morse.charAt(i) == ' ') {
				bigStor = bigStor + "  ";
			}
			else {
				bigStor = bigStor + charToMorse(Character.toString(morse.charAt(i))) + " ";
			}
		}
		return bigStor;
	}
	
	static String charToMorse(String morsechar) {
		if (morsechar.equals("a")) {
			return ".-";
		}
		else if (morsechar.equals("b")) {
			return "-...";
		}
		else if (morsechar.equals("c")) {
			return "-.-.";
		}
		else if (morsechar.equals("d")) {
			return "-..";
		}
		else if (morsechar.equals("e")) {
			return ".";
		}
		else if (morsechar.equals("f")) {
			return "..-.";
		}
		else if (morsechar.equals("g")) {
			return "--.";
		}
		else if (morsechar.equals("h")) {
			return "....";
		}
		else if (morsechar.equals("i")) {
			return "..";
		}
		else if (morsechar.equals("j")) {
			return ".---";
		}
		else if (morsechar.equals("k")) {
			return "-.-";
		}
		else if (morsechar.equals("l")) {
			return ".-..";
		}
		else if (morsechar.equals("m")) {
			return "--";
		}
		else if (morsechar.equals("n")) {
			return "-.";
		}
		else if (morsechar.equals("o")) {
			return "---";
		}
		else if (morsechar.equals("p")) {
			return ".--.";
		}
		else if (morsechar.equals("q")) {
			return "--.-";
		}
		else if (morsechar.equals("r")) {
			return ".-.";
		}
		else if (morsechar.equals("s")) {
			return "...";
		}
		else if (morsechar.equals("t")) {
			return "-";
		}
		else if (morsechar.equals("u")) {
			return "..-";
		}
		else if (morsechar.equals("v")) {
			return "...-";
		}
		else if (morsechar.equals("w")) {
			return ".--";
		}
		else if (morsechar.equals("x")) {
			return "-..-";
		}
		else if (morsechar.equals("y")) {
			return "-.--";
		}
		else if (morsechar.equals("z")) {
			return "--..";
		}
		else if (morsechar.equals("1")) {
			return ".----";
		}
		else if (morsechar.equals("2")) {
			return "..---";
		}
		else if (morsechar.equals("3")) {
			return "...--";
		}
		else if (morsechar.equals("4")) {
			return "....-";
		}
		else if (morsechar.equals("5")) {
			return ".....";
		}
		else if (morsechar.equals("6")) {
			return "-....";
		}
		else if (morsechar.equals("7")) {
			return "--...";
		}
		else if (morsechar.equals("8")) {
			return "---..";
		}
		else if (morsechar.equals("9")) {
			return "----.";
		}
		else if (morsechar.equals("0")) {
			return "-----";
		}
		else {
			throw new InvalidParameterException("Erro: Parametro Invalido");
		}
	}
	
	static String morseToChar(String morsechar) {
		if (morsechar.equals(".-")) {
			return "a";
		}
		else if (morsechar.equals("-...")) {
			return "b";
		}
		else if (morsechar.equals("-.-.")) {
			return "c";
		}
		else if (morsechar.equals("-..")) {
			return "d";
		}
		else if (morsechar.equals(".")) {
			return "e";
		}
		else if (morsechar.equals("..-.")) {
			return "f";
		}
		else if (morsechar.equals("--.")) {
			return "g";
		}
		else if (morsechar.equals("....")) {
			return "h";
		}
		else if (morsechar.equals("..")) {
			return "i";
		}
		else if (morsechar.equals(".---")) {
			return "j";
		}
		else if (morsechar.equals("-.-")) {
			return "k";
		}
		else if (morsechar.equals(".-..")) {
			return "l";
		}
		else if (morsechar.equals("--")) {
			return "m";
		}
		else if (morsechar.equals("-.")) {
			return "n";
		}
		else if (morsechar.equals("---")) {
			return "o";
		}
		else if (morsechar.equals(".--.")) {
			return "p";
		}
		else if (morsechar.equals("--.-")) {
			return "q";
		}
		else if (morsechar.equals(".-.")) {
			return "r";
		}
		else if (morsechar.equals("...")) {
			return "s";
		}
		else if (morsechar.equals("-")) {
			return "t";
		}
		else if (morsechar.equals("..-")) {
			return "u";
		}
		else if (morsechar.equals("...-")) {
			return "v";
		}
		else if (morsechar.equals(".--")) {
			return "w";
		}
		else if (morsechar.equals("-..-")) {
			return "x";
		}
		else if (morsechar.equals("-.--")) {
			return "y";
		}
		else if (morsechar.equals("--..")) {
			return "z";
		}
		else if (morsechar.equals(".----")) {
			return "1";
		}
		else if (morsechar.equals("..---")) {
			return "2";
		}
		else if (morsechar.equals("...--")) {
			return "3";
		}
		else if (morsechar.equals("....-")) {
			return "4";
		}
		else if (morsechar.equals(".....")) {
			return "5";
		}
		else if (morsechar.equals("-....")) {
			return "6";
		}
		else if (morsechar.equals("--...")) {
			return "7";
		}
		else if (morsechar.equals("---..")) {
			return "8";
		}
		else if (morsechar.equals("----.")) {
			return "9";
		}
		else if (morsechar.equals("-----")) {
			return "0";
		}
		else {
			throw new InvalidParameterException("Erro: Parametro Invalido");
		}
	}
	
	//teste . ..-  ..- ... ---  .--- .- ...- .-
	//teste 2 eu uso java
	public static void main(String[] args) {
		System.out.println("Bem vindo ao Conversor de Morse! Digite uma frase em codigo Morse para converte-la para comum, ou digite uma frase em Comum para converte-la para codigo Morse!");
		String entrada = new String();
		Scanner myscan = new Scanner(System.in);
		entrada = myscan.nextLine();
		myscan.close();
		if (entrada.charAt(0) == '.' || entrada.charAt(0) == '-') {
			System.out.println(conversorMorseChar(entrada));
		}
		else {
			System.out.println(conversorCharMorse(entrada));
		}
	}
}
