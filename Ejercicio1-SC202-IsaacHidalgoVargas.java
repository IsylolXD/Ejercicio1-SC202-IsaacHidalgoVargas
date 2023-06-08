/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejercicio1");
        int empleados = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de empleados"));
  
        double montobruto = 0;
        for (int i = 0; i <= empleados; i++){
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de empleados"));
            montobruto += (salario);
            }        
        JOptionPane.showMessageDialog(null, "El salario que debe pagar la persona es de:  " + montobruto);
    }
    public static double reducirsalario1(Double salario){
    double seguroA = salario * 0.0925;
    double seguroB = salario * 0.0508;
    return salario = seguroA - seguroB;
    }
    
}
