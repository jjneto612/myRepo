package FichaPratica1;

import java.util.Scanner;

public class EX_04 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        final double PI= 3.14;
        System.out.print("Introuz o raio: ");
        double raio= input.nextDouble();
        double area=PI * (raio*raio);
        System.out.println("A area é de: " + area);


    }
}
