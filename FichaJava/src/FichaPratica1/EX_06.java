package FichaPratica1;

import java.util.Scanner;

public class EX_06 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();

        System.out.println(num1);
        System.out.println(num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(num1);
        System.out.println(num2);



    }
}
