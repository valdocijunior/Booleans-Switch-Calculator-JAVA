/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;
import javax.swing.JOptionPane;
/**
 *
 * @author valdo
 */
public class CalculadoraProfessor {

        public static void main(String[] args){
        int nro1 = 0;
        int nro2 = 0;
        String firstNumber;
        String secondNumber;
        String operation;
        
            String resp_string = JOptionPane.showInputDialog(null, "Deseja iniciar o programa? \n0- SIM\n999- NÃO");
            int resp = Integer.parseInt(resp_string);
            while(resp == 0) {
                System.out.println("Entrou no while!");
                firstNumber = JOptionPane.showInputDialog(null, "Digite um número!");
                if (firstNumber != null) {
                    nro1 = Integer.parseInt(firstNumber);
                }
                secondNumber = JOptionPane.showInputDialog(null, "Digite outro número!");
                if (secondNumber != null) {
                    nro2 = Integer.parseInt(secondNumber);
                }
                
                operation = JOptionPane.showInputDialog(null, "Digite a operação desejada: \n+ SOMAR\n- SUBTRAIR\n* MULTIPLICAR\n/ DIVIDIR");
                
                
                if (operation.equals ("+")) {
                    JOptionPane.showMessageDialog(null, "A sua resposta é " + " " + (nro1 + nro2));
                }
                if (operation.equals("-")) {
                    JOptionPane.showMessageDialog(null, "A sua resposta é " + " " + (nro1 - nro2));
                }
                if (operation.equals("*")) {
                    JOptionPane.showMessageDialog(null, "A sua resposta é " + " " + (nro1 * nro2));
                }
                if (operation.equals("/")) {
                    JOptionPane.showMessageDialog(null, "A sua resposta é " + " " + (nro1 / nro2));
                }
                resp_string = JOptionPane.showInputDialog(null, "Deseja continuar? \n0- SIM\n999- NÃO");
                resp = Integer.parseInt(resp_string);
            }
        }
}
