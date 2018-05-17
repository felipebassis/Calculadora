package br.com.db1.start.calculadora;

import java.util.Scanner;

public class Executadora {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(false);
		Scanner reader = new Scanner(System.in);
		
		do{
			calculadora.setNumero1(reader.nextDouble());
			calculadora.setOperacao(reader.next());
			calculadora.setNumero2(reader.nextDouble());
			
			if(calculadora.getOperacao().equals("+")){
				System.out.println(calculadora.getSoma());
			}else if(calculadora.getOperacao().equals("-")){
				System.out.println(calculadora.getSubtracao());
			}
			else if(calculadora.getOperacao().equals("*")){
				System.out.println(calculadora.getMultiplicacao());
			}
			else if(calculadora.getOperacao().equals("/")){
				System.out.println(calculadora.getDivisao());
			} 
			else{
				System.out.println("Operacao Invalida!");
			}
			
			
			
		}while(calculadora.getConfirma() == false);
	}
}
