package clases;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Class3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nElementos;
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de elementos del arreglo: "));
		char[]letras = new char[nElementos];
		System.out.println("Digite los elementos del arreglo: ");
		for(char i=0;i<letras.length;i++){
		    System.out.println((i+1)+ ". Digite un caracter: ");
		    letras[i] = sc.next().charAt(0);
		
		}
		System.out.println("\nLos caracteres del arreglo son: ");
		for(char i=0;i<letras.length;i++) {
			System.out.println(letras[i]);
		}
	

	}
}