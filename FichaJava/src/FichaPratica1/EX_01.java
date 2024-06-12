package FichaPratica1;

import java.util.Scanner;

public class EX_01 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Introduza um numero: ");
        int num1=input.nextInt();
        System.out.print("Introduza um numero: ");
        int num2=input.nextInt();
        int result=num1 + num2;
        System.out.println("A soma dos dois numeros è: " + result);

    }


}
