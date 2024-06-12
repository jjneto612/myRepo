package FichaPratica2;

import java.util.Scanner;

public class EX_04 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Introduza o seu lugar na corrida: ");
        int place=input.nextInt();
        int points=0;

        switch (place){

            case 1:
                points+=10;
                System.out.println("1º lugar: " + points);
                break;
            case 2:
                points+=8;
                System.out.println("2º lugar: " + points);
                break;
            case 3:
                points+=6;
                System.out.println("3º lugar: " + points);
                break;
            case 4:
                points+=5;
                System.out.println("4º lugar: " + points);
                break;
            case 5:
                points+=4;
                System.out.println("5º lugar: " + points);
                break;
            case 6:
                points+=3;
                System.out.println("6º lugar: " + points);
                break;
            case 7:
                points+=2;
                System.out.println("7º lugar: " + points);
                break;
            case 8:
                points+=1;
                System.out.println("8º lugar: " + points);
                break;
            default:
                points=0;
                System.out.println("0 pontos.");

        }
    }
}
