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
        for (int i = 0; i < 5; i = i + 1) {
            //Parametros
            String nombre = JOptionPane.showInputDialog("Escriba  Nombre");
            String apellido = JOptionPane.showInputDialog("Escriba  Apellido");
            String telefono = JOptionPane.showInputDialog("Digite telefono");
            String direccion = JOptionPane.showInputDialog("Direccion");
            String edad = JOptionPane.showInputDialog("Fecha de Nacimiento");
            String genero = JOptionPane.showInputDialog("Escriba su Genero");
            System.out.println("PERSONA NUEVA");
            System.out.println("Nombre: " + nombre);
            System.out.println("");
            System.out.println("Apellido: " + apellido);
            System.out.println("");
            System.out.println("Telefono: " + telefono);
            System.out.println("");
            System.out.println("Direccion: " + direccion);
            System.out.println("");
            System.out.println("Fecha de Nacimiento: " + edad);
            System.out.println("");
            System.out.println("Genero: " + genero);
            System.out.println("__________________________________");
        }
    }

}

    //public void leerArreglo() {

