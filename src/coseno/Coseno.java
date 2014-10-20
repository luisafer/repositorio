/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coseno;

import java.util.Scanner;

public class Coseno {

/**
* @param args
*/
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
double num, ope, result;

System.out.println( "Introduce su numero:" );
num = entrada.nextDouble();

result=	Math.cos(Math.toRadians(num));	

System.out.print( "el coseno del numero "        + num +       "     es        "      + result );
}
}
