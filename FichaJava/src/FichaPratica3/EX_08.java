package FichaPratica3;

import java.util.Scanner;

public class EX_08 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num=input.nextInt();

        for (int i = num -5 ; i < num +5 +1 ; i++) {

            if (i==num){

                continue;
            }

            System.out.println(i);
        }

    }
}
