//scanner permite que java pueda leer datos del usuario que ingresan por consola

import java.util.Scanner;  // Importa la clase Scanner de la biblioteca java.util

public class ScannerExample {  // Cambia el nombre de la clase
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);  // System.in es la entrada de datos por consola

        System.out.println("Ingresa un número:");
        Integer number = scanner.nextInt();  // Lee un entero desde la consola

        System.out.println("Has ingresado: " + number);
    }
}

