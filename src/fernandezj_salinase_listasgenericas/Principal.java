/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fernandezj_salinase_listasgenericas;

/**
 *
 * @author usuario
 */
public class Principal
{

    /**
     * @param args the command line arguments
     */
    //Crear la variable de la clase
     Generica generica = new Generica();
    
    public static void main(String[] args) 
    {   
        Scanner entrada = new Scanner(System.in);
        //Generica generica = new Generica();  
        // Variable para almacenar la opciónque ingresa el usuario
        int opcion;

        // Menú principal
        do {
            System.out.println("--Bienvenido al Sistema de Gestión Generica--");
            System.out.println("1. String");
            System.out.println("2. Interger");
            System.out.println("3. Character");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            
            // Leer la opción del usuario
            opcion = entrada.nextInt();
            entrada.nextLine(); // Consumir la nueva línea

            // Switch para manejar el menu 
            switch (opcion) {
                case 1:
                    generica.LlenarLista
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
        
    }
    
}
