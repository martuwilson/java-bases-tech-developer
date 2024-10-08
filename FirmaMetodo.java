public class FirmaMetodo {
    public static void main(String[] args){
        
        System.out.println("La suma de los dos numeros es: " + addTwoNumbers(2.0, 2.2));

    }
    //metodo por fuera del main

    public static Double addTwoNumbers(Double number1, Double number2){ // add two numbers es la firma del metodo -- static porque el main es static, sino no se puede

        return number1 + number2; // si o si return, no es lo mismo que imprimir por consola
    }

}
