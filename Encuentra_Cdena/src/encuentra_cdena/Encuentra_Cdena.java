/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentra_cdena;

import java.util.Scanner;

/**
 *
 * @author yojar
 * 
 */
public class Encuentra_Cdena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	Scanner scan = new Scanner(System.in);
		String cadena, subcadena;
		int posicion=0, apariciones=0;
		System.out.println("Introduzca la cadena  buscar");
		cadena = scan.nextLine();
		System.out.println("Introduzca la subcadena a buscar");
		subcadena = scan.nextLine();
                System.out.println("la subcadena en la que aparece es");
		System.out.println();
		while (posicion>=0){				
			posicion = cadena.indexOf(subcadena, posicion);			
			if (posicion >= 0){
				posicion++;
				apariciones++;
			}
		}		
		System.out.println("aparece " + apariciones + " veces");
	}
}

    
    

