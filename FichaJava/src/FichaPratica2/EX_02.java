package FichaPratica2;

import java.util.Scanner;

public class EX_02 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Introduza um salario: ");
        int salary=input.nextInt();

        if (salary>15000){

            double tax=0.3;
            System.out.println("Paga taxa de 30% : " + (salary*tax) );
        }
        else {

            double tax=0.2;
            System.out.println("Paga taxa de 20% : " + (salary * tax));
        }

    }
}
