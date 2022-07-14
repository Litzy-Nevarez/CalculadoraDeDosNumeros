
package com.mycompany.calculadprabasica;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Litzy Yulissa Nevarez García
 */
public class CalculadpraBasica {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int op=0;
        int num1, num2;
        
        do{
            
            op=Integer.parseInt(JOptionPane.showInputDialog("***** Calculadora *****"
                    + "\n1. Suma +"
                    + "\n2. Resta -"
                    + "\n3. Multiplicación *"
                    + "\n4. División /"
                    + "\n5. Exponencial ^"
                    + "\n6. Modulo %"
                    + "\n7. Salir"));
            
            switch (op){
                
                case 1:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número Entero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número Entero"));
                    
                    int suma;
                    
                    suma = num1+num2;
                    
                    JOptionPane.showMessageDialog(null, suma, "Resultado",JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                case 2:
                    
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número Entero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número Entero"));
                    
                    int resta;
                    
                    resta = num1-num2;
                    
                    JOptionPane.showMessageDialog(null, resta, "Resultado",JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                case 3:
                    
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número Entero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número Entero"));
                    
                    int mult;
                    
                    mult = num1*num2;
                    
                    JOptionPane.showMessageDialog(null, mult, "Resultado",JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                case 4:
                    
                    double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
                    double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite otro número"));
                    
                    double div;
                    
                    div = n1/n2;
                    
                    JOptionPane.showMessageDialog(null, div, "Resultado",JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                case 5:
                    
                    int base = Integer.parseInt(JOptionPane.showInputDialog("Digite la base"));
                    int exponente = Integer.parseInt(JOptionPane.showInputDialog("Digite el exponente"));
                    
                    int resultado = 1;
                    
                    for(int i=1;i<=exponente;i++){
                        
                        resultado = resultado * base;
                        
                    }
                    
                    JOptionPane.showMessageDialog(null, resultado, "Resultado",JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                case 6:
                    
                    double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
                    double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite otro número"));
                    
                    double modulo;
                    
                    modulo = numero1%numero2;
                    
                    JOptionPane.showMessageDialog(null, modulo, "Resultado",JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                case 7:
                    
                    JOptionPane.showMessageDialog(null, "Adiós","Salir",JOptionPane.CLOSED_OPTION);
                    
                    break;
                default:
                    
                    JOptionPane.showMessageDialog(null, "Digite una opción valida","Error",JOptionPane.ERROR_MESSAGE);
                    
                    break;
            }
            
        }while(op<7);
        
    }
}
