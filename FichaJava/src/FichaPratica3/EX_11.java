package FichaPratica3;

import java.util.Scanner;

public class EX_11 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int limit=input.nextInt();

        int jump=input.nextInt();

        for (int i = 0; i < limit+1; i+=jump) {

            System.out.println(i);
        }


    }
}
