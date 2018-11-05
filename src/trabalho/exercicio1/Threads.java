
package trabalho.exercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Threads extends Thread {
    String nome;
    int max;
    int min;

    public Threads(String nome, int min,int max) {
        this.max = max;
        this.min = min;
        this.nome = nome;
    }
    
    
    @Override
    public void run() {
        laco();   
    }
    
    public void laco(){
        for(int i=min;i<max;i++){
            System.out.println(nome+" - "+i);
            try {       
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
}
