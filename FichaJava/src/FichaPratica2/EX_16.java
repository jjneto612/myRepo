package FichaPratica2;

import java.util.Scanner;

public class EX_16 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num=input.nextInt();

        if(num%5!=0){

            System.out.println("It has to be a multiple of 5");
            input.close();
        }

        if (num>=500){


            int ii;
            ii=num/500;
            System.out.println("It needs " + ii + " 500 bills");
        }
        if (num>=200 && num<500){


            int ii;
            ii=num/200;
            System.out.println("It needs " + ii + " 200 bills");
        }

        if (num>=100 && num<200){

            int ii;
            ii=num/100;
            System.out.println("It needs " + ii + " 100 bills");
        }

        if (num>=50 && num<100){

            int ii;
            ii=num/50;
            System.out.println("It needs " + ii + " 50 bills");
        }

        if (num>=20 && num<50){

            int ii;
            ii=num/20;
            System.out.println("It needs " + ii + " 20 bills");
        }

        if (num>=10 && num<20){

            int ii;
            ii=num/10;
            System.out.println("It needs " + ii + " 10 bills");
        }

        if (num>=5 && num<10){

            int ii;
            ii=num/5;
            System.out.println("It needs " + ii + " 5 bills");
        }

        if (num==5){

            int ii;
            ii=num/5;
            System.out.println("It needs " + ii + " 5 bills");
        }

    }
}
