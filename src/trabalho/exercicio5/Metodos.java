package trabalho.exercicio5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Metodos extends JFrame implements ActionListener {
        
      JPanel pan;
      JButton btn;
      Component[] btns;
      
      
      final String IMAGENS[] = {             
              "./assets/fig_1.png",
              "./assets/fig_2.png",
              "./assets/fig_3.png",
              "./assets/fig_4.png",
              "./assets/fig_5.png",
              "./assets/fig_6.png",
              "./assets/fig_7.png",
              "./assets/fig_8.png",
              "./assets/fig_9.png",
              "./assets/fig_10.png",
              "./assets/fig_11.png",
              "./assets/fig_12.png",
              "./assets/fig_13.png",
              "./assets/fig_14.png",
              "./assets/fig_15.png"
      };
      
      
      public final String TITULO = "Jogo da Memoria";
      private final int LARGURA = 700;
      private final int ALTURA = 700;
      

    public Metodos() {
        configurar();
        
        int op = JOptionPane.showConfirmDialog(pan, "Deseja Iniciar?");
        if(op == 0){
        inicializar();
        }else{
            System.exit(0);
        }
        
    }
      
      
       private void configurar() {
        setTitle(this.TITULO);
        setSize(this.LARGURA, this.ALTURA);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);      
    }
      
      private void inicializar() {
        pan = new JPanel(new GridLayout(6,6));
        for(int i=0;i<36;i++){
            btn = new JButton(new ImageIcon("./assets/duvida.png"));
            btn.addActionListener(this);
            pan.add(btn);
        }
        add(pan); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
      Random rand = new Random();
      int j = rand.nextInt(IMAGENS.length);
      
      JButton Jbtn = ((JButton)e.getSource());
      
       if(String.valueOf(Jbtn.getIcon()) == "./assets/duvida.png"){
          Jbtn.setIcon(new ImageIcon(IMAGENS[j])); 
       }
        
    }

}
