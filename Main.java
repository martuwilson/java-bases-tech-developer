
public class Main {
    public static void main(String[] args){
        System.out.println("Hello World"); // Imprimir por consola

        //crear variable en JAVA
        String name = "Juan";
        Integer age = 20;
        Double height = 1.75;

        System.out.println("Hey, I'm " + name + " and I'm " + age + " years old and I'm " + height + " meters tall");

        if(age > 15 && height >= 1.5){
            System.out.println("You can ride the roller coaster");
        } else {
            System.out.println("You can't ride the roller coaster");
        }

        for(Integer i = 0; i < 10; i++){
            System.out.println("i: " + i);
        }
    }
}