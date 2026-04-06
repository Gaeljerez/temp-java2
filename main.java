import java.util.*;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;

        //System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad"));  

        if(edad >= 18){
            JOptionPane.showMessageDialog(null, "es mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "Es menor de edad");
        }
    }
}