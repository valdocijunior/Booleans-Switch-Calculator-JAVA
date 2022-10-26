package calculadora;

// exemplos do while

import javax.swing.JOptionPane;

public class aula_18_10 {

    public static void main(String[] args) {
        int cont=0, x=0;
        String opcao="";
        
        
        
        do{
            cont=0;
            do
            {
                JOptionPane.showMessageDialog(null, cont, "Cont", JOptionPane.ERROR_MESSAGE);
                cont++;
            }
            while(cont<=50);
            opcao = JOptionPane.showInputDialog(null, "1-continuar\n0-sair ");
            x = Integer.parseInt(opcao);
        }while(x==1);
    }
    
}
    
