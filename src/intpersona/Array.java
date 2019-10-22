package intpersona;

import javax.swing.JOptionPane;

public final class Array {

    public Persona persona1[] = new Persona[5];
    private Object J0ptionPane;
    Persona arrayObjetos[] = new Persona[5];
//Constructor

    public Array() {
        this.arreglo();
    }

    //Menu
    public void menu() {

        System.out.println("Bienvenido");

    }

    public void arreglo() {
        //Array

        //Cinco empleados
        for (int i = 0; i < 5; i++) {
            //Parametros
            String nombre = JOptionPane.showInputDialog("Escriba  Nombre");
            String apellido = JOptionPane.showInputDialog("Escriba  Apellido");
            String telefono = JOptionPane.showInputDialog("Digite telefono");
            String direccion = JOptionPane.showInputDialog("Direccion");
            String edad = JOptionPane.showInputDialog("Fecha de Nacimiento");

            //for (int j = 0; j < 5; j++) {
                System.out.println("Nombre " + nombre );
                System.out.println("");
                System.out.println("apellido " + apellido);
                System.out.println("");
                System.out.println("telefono " + telefono);
                System.out.println("");
                System.out.println("direccion "  +direccion);
                System.out.println("");
                System.out.println("fecha de nacimiento " + edad);
                System.out.println("_______________________________");
            }
        }

    }

    //public void leerArreglo() {

    }

}
