package FichaPratica3;

import java.util.Scanner;

public class EX_13 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int start=input.nextInt();
        int stop=input.nextInt();
        for (int i = start; i < stop +1; i++) {

            if (i%5==0){

                System.out.println(i);
            }
        }
    }
}
