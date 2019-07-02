
package trabalho.exercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author PitchHybrid
 */
public class CacaNiquel extends JFrame implements ActionListener{

    /**
	 * 
	 */
	private static final long serialVersionUID = 4914288844621649748L;
	/**
     *
     */
    public  String TITULO = "Caça Niquel";;
    private final int LARGURA = 400;
    private final int ALTURA = 250;
    
    JButton btn;
    JTextField text1,text2,text3;    
    
    Random rand = new Random();
    
    JLabel lbl= new JLabel();
    
    
    public CacaNiquel() {
        configurar();
        inicializar();
        
    }
    
     private void configurar() {
        setTitle(this.TITULO);
        setSize(this.LARGURA, this.ALTURA);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);        
    }
     
    private void inicializar(){
        setLayout(null);
        
        btn = new JButton("Iniciar"); 
        btn.setBounds(0, 195, this.LARGURA,25);
        btn.addActionListener(this);
        
        text1 = new JTextField();
        text1.setBounds(50, 50, 100, 50);
        text1.setEditable(true); 
        text1.setHorizontalAlignment(JTextField.CENTER);
        
        text2 = new JTextField();
        text2.setBounds(150, 50, 100, 50);
        text2.setEditable(true);
        text2.setHorizontalAlignment(JTextField.CENTER);
        
        text3 = new JTextField();
        text3.setBounds(250, 50 , 100, 50);
        text3.setEditable(true);
        text3.setHorizontalAlignment(JTextField.CENTER);

        text1.updateUI();
        text2.updateUI();
        text3.updateUI();
        
        lbl.setBounds(160,100,100,50);
        
        
        add(btn);
        add(text1);
        add(text2);
        add(text3);    
        add(lbl);
         
    }
       
  @Override
    public void actionPerformed(ActionEvent e) {
   
        ramdomizar(); 
    
    }
    

    private void ramdomizar(){
        Thread tt = new Thread(){
            
            @Override
            public void run(){
               int j = rand.nextInt(150);
                for(int i=0;i<j;i++){
                   
                    text1.setText(String.valueOf(rand.nextInt(7)));
                }
                for(int i=0;i<j;i++){ 
                   
                    text2.setText(String.valueOf(rand.nextInt(7)));
                }
                for(int i=0;i<j;i++){ 
                    
                    text3.setText(String.valueOf(rand.nextInt(7)));
                }
                if(text1.getText().equals(text2.getText()) && text1.getText().equals(text3.getText())){
                lbl.setText("Voce Ganhou");
                btn.setText("Jogar Novamente");

                }else{

                lbl.setText("Voce perdeu");
                btn.setText("Jogar Novamente");
        
        }
            }
        };
        
        tt.start();
        
     }
}
    

