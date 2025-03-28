package entradasysalidas;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan y Chatgpt
 */
public class EntradasySalidas {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int seleccion;

        // Menú para elegir tipo de entrada y salida
        System.out.println("Seleccione el tipo de entrada y salida:");
        System.out.println("1. Consola");
        System.out.println("2. Frame");
        
        try{
            System.out.print("Ingrese su opcion (1 o 2): ");
            seleccion = scanner.nextInt();        
        }catch(InputMismatchException e){
            System.out.println("Error: Ingrese un numero que sea valido");
            scanner.next();
            return;
        }
        
        
        switch (seleccion) {
            case 1 -> {
                FabricaConsola fabricaConsola = new FabricaConsola();
                Cliente clienteConsola = new Cliente(fabricaConsola);
                clienteConsola.realizarOperacion();
            }
            case 2 -> {
                FabricaMedios fabricaFrame = new FabricaFrame();
                Cliente clienteFrame = new Cliente(fabricaFrame);
                clienteFrame.realizarOperacion();
            }
            default -> System.out.println("Opcion no valida.");
        }

        scanner.close();
    }
}
        

   