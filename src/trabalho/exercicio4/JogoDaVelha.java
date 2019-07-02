/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.exercicio4;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author alone
 */
public class JogoDaVelha extends JFrame implements ActionListener{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 7605733334430865031L;
	private final String TITULO = "Jogo da Velha";
    private final int LARGURA = 600;
    private final int ALTURA = 600;
    private String jogador = "X"; 
    private JPanel pan;
    private JButton btn;
    private Component[] btns;
    
    public JogoDaVelha() {
       configurar();
       dialog("Deseja Iniciar?");
    }
    
    public void dialog(String str){
    	int op = JOptionPane.showConfirmDialog(this, str);
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
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       JButton Jbtn = ((JButton)ae.getSource());
       if(Jbtn.getText().isEmpty()){
    	   Jbtn.setText(trocarJogador());
    	   if(verificarVitoria()){
    		   JOptionPane.showMessageDialog(this, String.format("Jogador %s ganhou", jogador));
    		   dialog("Deseja reiniciar");
    		   getContentPane().removeAll();
    	   }else{ 
    		   if(verificarVelha()){
    			   JOptionPane.showMessageDialog(this, String.format("Deu velha", jogador));
    			   dialog("Deseja reiniciar");
    			   getContentPane().removeAll();
    		   }
    	   }
    	   
    	   Jbtn.setFont(new Font("Courier New", Font.BOLD, 128));
    	   
       }
       
        
    }

    private void inicializar() {
    	pan = new JPanel();
        pan.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++){
            btn = new JButton();
            btn.setName(String.format("%d", i));
            btn.addActionListener(this);
           pan.add(btn);
            
        }
        add(pan);
    }
    //012
    //345
    //678
    public boolean verificarVitoria(){
        //horizontal
        if(verificarIguais(0, 1, 2) || verificarIguais(3, 4, 5) || verificarIguais(6, 7, 8))
        	return true;
        //vertical
        if(verificarIguais(0, 3, 6) || verificarIguais(1, 4, 7) || verificarIguais(2, 5, 8))
        	return true;
        //diagonal
        if(verificarIguais(0, 4, 8) || verificarIguais(2, 4, 6))
        	return true; 
        return false;
       
    }
    
    public Boolean verificarIguais(int pos1,int pos2,int pos3){
        btns = pan.getComponents();
        String celula1 = ((JButton)btns[pos1]).getText();
        String celula2 = ((JButton)btns[pos2]).getText();
        String celula3 = ((JButton)btns[pos3]).getText();
        boolean isVazio = (celula1.isEmpty() && celula2.isEmpty() && celula3.isEmpty());
        boolean isIgual = (celula1.equals(celula2) && celula2.equals(celula3));
        return  !isVazio && isIgual;
        
    }
    
    public Boolean verificarVelha(){
        boolean isVelha = true;
        for (Component btn1 : btns) {
            if (((JButton) btn1).getText().isEmpty()) {
                isVelha = false;
            }
        }
        return isVelha;
    }
    
    public String trocarJogador(){
        if("X".equals(jogador)){
            jogador = "O";
        }else{
            jogador = "X";
        }
        return jogador;
    }
    
    
}
