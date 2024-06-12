package FichaPratica1;

import java.util.Scanner;

public class EX_09 {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        final int dailyPay=40;
        final int dailyPension=5;
        final double IRS=0.10;
        final double WORKERIRS=0.11;
        final double COMPANYIRS=0.2375;

        String code=input.next();

        int daysWorked=input.nextInt();

        int grossPay=daysWorked * dailyPay;
        int totalPension=daysWorked * dailyPension;
        double irsToState=grossPay * IRS;
        double socialSecurityToState=(grossPay * WORKERIRS) + (grossPay * COMPANYIRS);
        double netPay=grossPay - (irsToState + (grossPay * WORKERIRS));
        int ll=0;


        for (int i = 0; i < 10; i++) {

            ll+=1;

        }

        System.out.println(ll);


    }
}
