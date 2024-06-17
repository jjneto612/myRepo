package FichaPratica3;

import java.util.Scanner;

public class EX_06 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();

        for (int i = num1; i < num2+1; i++) {

            System.out.println(i);
        }
    }
}