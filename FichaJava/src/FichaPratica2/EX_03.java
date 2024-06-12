package FichaPratica2;

import java.util.Scanner;

public class EX_03 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int salary=input.nextInt();
        double tax;

        if(salary<=15000){

            tax=0.2;
            System.out.println("Impostos a pagar: " + (salary * tax));
        } else if (salary>15000 && salary<=20000) {

            tax=0.30;
            System.out.println("Impostos a pagar: " + (salary * tax));
            
        } else if (salary>20000 && salary<=25000) {

            tax=0.35;
            System.out.println("Impostos a pagar: " + (salary * tax));
            
        } else if (salary>25000) {

            tax=0.40;
            System.out.println("Impostos a pagar: " + (salary * tax));
        }
    }
}
