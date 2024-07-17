/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.de.apicalendario;

import java.util.Scanner;
import java.util.Calendar;

public class ExercicioDeApicalendario {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int ano_nasceu, idade, ano_atual;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println(" \n Digite o ano em que você nasceu: ");
    ano_nasceu = entrada.nextInt();
    
    Calendar calendario = Calendar.getInstance();
    ano_atual = calendario.get(Calendar.YEAR);
    
    idade = ano_atual - ano_nasceu;
    
    System.out.printf("\n Sua idade é: " + idade);
    
    }
    
}
