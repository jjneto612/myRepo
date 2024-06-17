package FichaPratica3;

import java.util.Scanner;

public class EX_10 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num=input.nextInt();

        for (int i = 2; i < num+1; i+=2) {

            System.out.println(i);
        }


    }
}
