package trabalho.exercicio5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Metodos extends JFrame implements ActionListener {
        
      JPanel pan;
      JButton btn;
      String[] con = new String[2];
      private final HashMap<Integer, String> hmap = new HashMap<>();
      
      {             
        hmap.put(1,"./assets/fig_1.png");
        hmap.put(2,"./assets/fig_2.png");
        hmap.put(3,"./assets/fig_3.png");
        hmap.put(4,"./assets/fig_4.png");
        hmap.put(5,"./assets/fig_5.png");
        hmap.put(6,"./assets/fig_6.png");
        hmap.put(7,"./assets/fig_7.png");
        hmap.put(8,"./assets/fig_8.png");
        hmap.put(9,"./assets/fig_9.png");
        hmap.put(10,"./assets/fig_10.png");
        hmap.put(11,"./assets/fig_11.png");
        hmap.put(12,"./assets/fig_12.png");
        hmap.put(13,"./assets/fig_13.png");
        hmap.put(14,"./assets/fig_14.png");
        hmap.put(15,"./assets/fig_15.png");
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
      JButton Jbtn = ((JButton)e.getSource());
      
      int j = rand.nextInt(hmap.size());
      
       if("./assets/duvida.png".equals(String.valueOf(Jbtn.getIcon()))){
          
           Jbtn.setIcon(new ImageIcon(hmap.get(j)));
           
       }
       
       
      }
          

}
