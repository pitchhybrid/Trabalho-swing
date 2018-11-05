
package trabalho.exercicio2;


public class Threads extends Thread {
    
    int vetor[];

    public Threads(int vetor[]) {
        this.vetor = vetor;
    }
    
    
    @Override
    public void run(){
        laco();
    }
    
    public void laco(){
        for (int i =0 ;i<5 ;i++){
            
            System.out.println(i);
        }
    }
    
}

