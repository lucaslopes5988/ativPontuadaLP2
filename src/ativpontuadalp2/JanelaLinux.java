/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativpontuadalp2;

/**
 *
 * @author lucas
 */
public class JanelaLinux implements JanelaImplementada{

    @Override
    public void DesenharJanela(String titulo) {
        System.out.println("janela de diálogo - Janela Linux");
    }

    @Override
    public void DesenharBotao(String titulo) {
        System.out.println("BOTÃO SIM - BOTÃO LINUX");
        System.out.println("BOTÃO NÃO - BOTÃO LINUX");
        System.out.println("BOTÃO CANCELAR - BOTÃO LINUX");
    }
        
    
}
