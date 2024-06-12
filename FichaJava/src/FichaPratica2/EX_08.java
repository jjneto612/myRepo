package FichaPratica2;

import java.util.Scanner;

public class EX_08 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double grade1=input.nextDouble();
        double grade2=input.nextDouble();
        double grade3=input.nextDouble();

        double median= (grade1 *0.25) + (grade2 * 0.35) + (grade3 * 0.4);

        if(median<9.5){

            System.out.println("Reprovado.");
        }else {

            System.out.println("Aprovado.");
        }
    }

}
