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
public class aula_25_10_switch {
    public static void main (String[] args) {
    String resp;
    double resp_int;
    String x;
    double x_int = 0;
    String y;
    double y_int = 0;
    double result;
        int opcao_int;
            
    
        String opcao_string = JOptionPane.showInputDialog(null, "Deseja continuar? \n1 - SIM\n2 - NÃO");
        opcao_int = Integer.parseInt(opcao_string);
            while (opcao_int == 1) {
                
                
        
            x = JOptionPane.showInputDialog(null, "Escolha um numero: ");
            x_int = Integer.parseInt(x);
            y = JOptionPane.showInputDialog(null, "Escolha outro numero: ");
            y_int = Integer.parseInt(y);
            resp = JOptionPane.showInputDialog(null, "Escolha uma opção:\n+\n-\n*\n/");
            //resp_int = Integer.parseInt(resp);
               char escolha = resp.charAt(0);
    
        switch (escolha) {
            case '+': {
                result = x_int + y_int;
                System.out.println(x_int + " + " + y_int + " = " + result);
                break;
            }
            case '-': {
                result = x_int - y_int;
                System.out.println(x_int + " - " + y_int + " = " + result);
                break;
            }
            case '*': {
                result = x_int * y_int;
                System.out.println(x_int + " * " + y_int + " = " + result);
                break;
            }
            case '/': {
                result = x_int / y_int;
              //  double resto = x_int % y_int;
               // double dresult = result;
                System.out.println(x_int + " / " + y_int + " = " + result);
                break;
            }
            default: {
                System.out.println("Voce não selecionou nenhuma opção válida");
            }
        }   opcao_string = JOptionPane.showInputDialog(null, "Deseja continuar? \n1 - SIM\n2 - NÃO");
            opcao_int = Integer.parseInt(opcao_string);
            } while(opcao_int == 1);
    }
}
