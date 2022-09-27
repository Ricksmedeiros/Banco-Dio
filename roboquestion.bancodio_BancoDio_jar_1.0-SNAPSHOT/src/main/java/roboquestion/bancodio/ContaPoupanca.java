package roboquestion.bancodio;

import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ContaPoupanca extends Conta  {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    
    


    @Override
    public void extrato() {
       Calendar c =  Calendar.getInstance();
        System.out.println("extrato do mes:"+ c.get(Calendar.MONTH));
       super.imprimirInfosComuns();
    }

} 