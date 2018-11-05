/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.exercicio2;

/**
 *
 * @author PitchHybrid
 */
public class Exercicio2 {
   
    public Exercicio2(){
      int matriz[][] = new int[3][5];
        Threads[] thr = new Threads[3];
      
     for(int i=0;i<3;i++){
        for(int j = 0;j<5;j++){
            matriz[i][j] = 234;
        }
        thr[i] = new Threads(matriz[i]); 
     }
    
     for(int i =0 ;i<3;i++){
         thr[i].start();
         System.out.println("linha - " + i);
     }
   
    
    }
    
    
    
}
