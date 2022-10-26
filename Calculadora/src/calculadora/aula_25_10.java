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
public class aula_25_10 {
        public static void main(String[] args) {
            String resp_string = JOptionPane.showInputDialog(null, "Deseja iniciar o programa? \n0- SIM\n999- NÃO");
            int resp = Integer.parseInt(resp_string);
                while(resp == 0) {
            String valor_string = JOptionPane.showInputDialog(null,"Informe a tabuada que você quer!");
                int valor = Integer.parseInt(valor_string);
    for (int i = 0; i <= 10; i++) {
    System.out.println("A tabuada do "+ valor +"  = " + i + " x " + valor + " = " + (i*valor));
    }
            resp_string = JOptionPane.showInputDialog(null, "Deseja continuar? \n0- SIM\n999- NÃO");
            resp = Integer.parseInt(resp_string);
}
}
}
