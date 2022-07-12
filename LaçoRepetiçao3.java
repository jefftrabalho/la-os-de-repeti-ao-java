package br.com.generation;

import java.util.Scanner;

public class LaçoRepetiçao3 {

	public static void main(String[] args) {
		  Scanner entrada = new  Scanner ( System . in );

			int idade ;

			System.out.println( "Escreva sua idade: " );
			 idade= entrada.nextInt ();

			if ( idade >= 25 ) {
				System.out.println ( "Você é um adulto" );
			} else  if ( idade >= 15 ) {
				System.out.println( "Você é um jovem" );
			} else  if ( idade >= 10 ) {
				System.out.println ( "Você é Infantil" );
			} else  if ( idade >= 0 ) {
				System.out.println ( "Bebezão" );
			}

			entrada . close ();


	}

}
