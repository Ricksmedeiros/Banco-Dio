/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package roboquestion.bancodio;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class BancoDio {

    public static void main(String[] args) {
        
        int escolha=99;
        
                Cliente henrique = new Cliente();
		henrique.setNome("Henrique");
		
		Conta cc = new ContaCorrente(henrique);
		Conta poupanca = new ContaPoupanca(henrique);

	while(escolha != 0){
          String opcao = JOptionPane.showInputDialog("escolha a opção\n"
                  + "1-> sacar\n"
                  + "2->depositar\n"
                  + "3->tranferir\n"
                  + "4->extrato\n"
                  + "0->encerrar");  
          escolha = Integer.parseInt(opcao);
          if(escolha==1){
              String saque = JOptionPane.showInputDialog("entre com o valor que quer sacar");
              double valor =Double.parseDouble(saque);
              cc.sacar(valor);
          }
            
          if(escolha==2){
              String saque = JOptionPane.showInputDialog("entre com o valor que quer depositar");
              double valor =Double.parseDouble(saque);
              cc.depositar(valor);
          }
          if(escolha==3){
              String saque = JOptionPane.showInputDialog("entre com o valor que quer sacar");
              double valor =Double.parseDouble(saque);
              String tipo = JOptionPane.showInputDialog("entre com o tipo da conta\n"
                      + "1->poupaça\n"
                      + "2->corrente\n");
              int tipoConta = Integer.parseInt(tipo);
              if(tipoConta==1){
              cc.transferir(valor,poupanca);
              }
              if (tipoConta==2){
                poupanca.transferir(valor, cc);
              }
          }
          if(escolha==4){            
              cc.extrato();
          }
          if(escolha==0){
              JOptionPane.showMessageDialog(null,"Obrigado por fazer parte do Nosso banco");
          }
            
            
            
            
            
        }	 
                
                
	
    }
}
