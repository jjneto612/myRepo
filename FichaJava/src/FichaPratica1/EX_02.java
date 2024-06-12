package FichaPratica1;

import java.util.Scanner;

public class EX_02 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Introduza um numero: ");
        int num1= input.nextInt();
        System.out.print("Introduza um numero: ");
        int num2= input.nextInt();
        int sum=num1 + num2;
        int multiply=num1 * num2;
        int subtraction= num1 - num2;
        double division= (double) num1 /num2;
        System.out.println("Soma: " + sum);
        System.out.println("Subtração: " + subtraction);
        System.out.println("Multiplicação: " + multiply);
        System.out.println("Divisão: " + division);

    }
}
