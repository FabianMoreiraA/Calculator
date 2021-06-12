package sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int first,second, add, substract, multiply, divide;
        System.out.println("Escriba dos numeros");
        first = entrada.nextInt();
        second = entrada.nextInt();

        substract = first-second;
        multiply = first*second;
        divide = first/second;
        add = first+second;

        System.out.println(add);
        System.out.println(substract);
        System.out.println(multiply);
        System.out.println(divide);
        
    }
}
