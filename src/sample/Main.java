package sample;

import sample.calculator.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calcu = new Calculator();

        Scanner entry = new Scanner(System.in);

        boolean exit = false;
        //MENU
        while(!exit){
        System.out.println("1.sumar");
        System.out.println("2.restar");
        System.out.println("3.multiplicar");
        System.out.println("4.dividir");
        System.out.println("5.Salir");

        System.out.println("seleccione un numero");
        int option = entry.nextInt();

        switch (option){
            //ADD
            case 1:

        System.out.println("Ingrese los 2 números a sumar");
        int result = calcu.add(entry.nextInt(), entry.nextInt());
        System.out.println("El resultado de la suma "+result);

                break;
            //SUBSTRACT
            case 2:

        System.out.println("Ingrese los 2 números a restar");
        result = calcu.substract(entry.nextInt(), entry.nextInt());
        System.out.println("El resultado de la resta "+result);

                break;
            //MULTIPLY
            case 3:
        System.out.println("Ingrese los 2 números a multiplicar");
        result = calcu.multiply(entry.nextInt(), entry.nextInt());
        System.out.println("El resultado de la multiplicacion es "+result);

                break;
            //DIVIDE
            case 4:
        System.out.println("Ingrese los 2 números a dividir");
        result = calcu.divide(entry.nextInt(), entry.nextInt());
        System.out.println("El resultado de la división "+result);

                break;
            //EXI
            case 5:
            exit = true;
                System.out.println("Muchas Gracias");
                break;
            default:
                System.out.println("INVALIDO");
            }
        }
    }
}
