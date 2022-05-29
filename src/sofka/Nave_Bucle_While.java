package sofka;


import javax.swing.*;

public class NavesBucleFor {

    public static void main(String[] args) {

        String clave = "Jupiter";
        String pass  = "";

        while(clave.equals(pass)==false) {

            pass= JOptionPane.showInputDialog("Introduce el nombre del acceso");
            if(clave.equals(pass)==false){
                System.out.println("Nombre incorrecto");
            }
        }

        System.out.println("Acceso permitido");
        
        }

    }
