/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Scanner;
import trabalho.exercicio1.Exercicio1;
import trabalho.exercicio2.Exercicio2;
import trabalho.exercicio3.Exercicio3;
import trabalho.exercicio4.Exercicio4;
import trabalho.exercicio5.JogodaMemoria;

/**
 *
 * @author PitchHybrid
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\t\tBem Vindo!!");
        System.out.println("\tPor onde deseja Começar?");
        int op;
       
        do{
        System.out.println("\t 1.\tExercicio 1");
        System.out.println("\t 2.\tExercicio 2");
        System.out.println("\t 3.\tExercicio 3");
        System.out.println("\t 4.\tExercicio 4");
        System.out.println("\t 5.\tExercicio 5");
        System.out.println("\t 99.\t Para sair");
       
        
        
        
        Scanner scan = new Scanner(System.in);
        op = scan.nextInt();
        
        System.out.println(String.format("Selecionado opção %d:", op));
        
        switch(op){
            
            case 1:
            Exercicio1 ex1 = new Exercicio1();
            break;
            
            case 2:
              Exercicio2 ex2 = new Exercicio2();
            break;
            
            case 3:
            Exercicio3 ex3 = new Exercicio3();
            break;
            
            case 4:
            Exercicio4 ex4 = new Exercicio4();
            break;
            
            case 5:          
            JogodaMemoria mem = new JogodaMemoria();
            break;
            
            default:
            if(op == 99){
            System.out.println("Saindo....");
            System.exit(0);
            }else
            System.out.println("Opção Errada!!!!");
        
        }
        
        }while(op != 99);
        
    }
    
}
