package FichaPratica1;

import java.util.Scanner;

public class EX_03 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Insira o comprimento: ");
        double comprimento=input.nextDouble();
        System.out.print("Insira a largura: ");
        double largura=input.nextDouble();
        double area=comprimento * largura;
        double perimetro= 2 *(comprimento + largura);
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);

    }
}
