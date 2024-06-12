package FichaPratica1;

import java.util.Scanner;

public class EX_05 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        double median=(num1 * 0.2) + (num2 * 0.3) + (num3 * 0.5);
        System.out.println("A média é de: " + median);
    }
}
