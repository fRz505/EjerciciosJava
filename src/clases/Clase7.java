package clases;

import java.util.Scanner;

//Calcular la suma de 3 notas
public class Clase7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float nota1,nota2,nota3,suma;
		System.out.println("Digite tres calificaciones: ");
		nota1 = teclado.nextFloat();
		nota2 = teclado.nextFloat();
		nota3 = teclado.nextFloat();
		suma = nota1+nota2+nota3;
		System.out.println("\nLa suma es: "+suma);
		

	}

}
