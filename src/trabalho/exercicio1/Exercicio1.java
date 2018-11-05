package trabalho.exercicio1;


public class Exercicio1 {

    public Exercicio1() {
        iniciar();
    }
    
    private void iniciar(){
        Threads i1 = new Threads("Thread - 1 ",0,70);
        Threads i2 = new Threads("Thread - 2 ",50,90);
        Threads i3 = new Threads("Thread - 3 ",80,150);
        Threads i4 = new Threads("Thread - 4 ",78,90);
        Threads i5 = new Threads("Thread - 5 ",50,200);
        
        i1.start();
        i2.start();
        i3.start();
        i4.start();
        i5.start();
        
    }
    
    
    
    
}
