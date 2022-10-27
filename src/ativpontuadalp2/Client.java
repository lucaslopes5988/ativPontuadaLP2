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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaWindows WindowsJ1 = new JanelaWindows();
        JanelaLinux LinuxJ1 = new JanelaLinux();       

        
        WindowsJ1.DesenharJanela("Windows");
        WindowsJ1.DesenharBotao("Windows");
        System.out.println("\n");
        LinuxJ1.DesenharJanela("Linux");
        LinuxJ1.DesenharBotao("Linux");
    }
    
}
