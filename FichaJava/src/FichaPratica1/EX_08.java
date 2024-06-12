package FichaPratica1;

import java.util.Scanner;

public class EX_08 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int toalSeg;
        System.out.print("Introduza minutos da musica1: ");
        int musica1=input.nextInt();
        System.out.print("Introduza segundos da musica1: ");
        int musica1Seg=input.nextInt();

        System.out.print("Introduza minutos da musica2: ");
        int musica2= input.nextInt();
        System.out.print("Introduza segundos da musica2: ");
        int musica2Seg=input.nextInt();

        toalSeg=((musica1 + musica2) *60) + (musica1Seg + musica2Seg);
        int horas=toalSeg/3600;

        int min=toalSeg/60;
        min=min%60;

        int seg=toalSeg%60;

        System.out.println("h " + horas + " m " + min + " seg " + seg);
    }
}
