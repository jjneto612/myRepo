package FichaPratica2;

import java.util.Scanner;

public class EX_07 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num=input.nextInt();

        if(num%2==0){

            System.out.println("Par");
        }else {

            System.out.println("Impar");
        }
    }
}
