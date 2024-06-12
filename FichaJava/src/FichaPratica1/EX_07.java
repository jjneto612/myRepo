package FichaPratica1;

import java.util.Scanner;

public class EX_07 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        final double desconto=0.10;
        double item1=input.nextDouble();
        double item2= input.nextDouble();
        double item3= input.nextDouble();
        double total=(item1 + item2 + item3) * (1-desconto);
        System.out.println(total);
    }
}
