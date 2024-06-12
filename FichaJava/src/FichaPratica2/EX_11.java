package FichaPratica2;

import java.util.Scanner;

public class EX_11 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double balance=input.nextDouble();
        double money=input.nextDouble();

        if(money<0){

            balance= balance + money;
            System.out.println(balance);

            if (balance<0){

                balance-=money;
                System.out.println("Insufficient balance");
                System.out.println(balance);
            }
        }
        else {

            balance+=money;
            System.out.println(balance);
        }
    }
}
