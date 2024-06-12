package FichaPratica2;

import java.util.Scanner;

public class EX_13 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Introduza as horas: ");
        int hour=input.nextInt();

        System.out.print("Introduza os minutos: " );
        int minutes=input.nextInt();

        if(hour<12 && minutes>=10){

            System.out.println(hour + ":" + minutes + "AM");
        } else if (hour<12 && minutes<10) {

            System.out.println(hour + ":" + "0" + minutes + "AM");
        } else if ((hour>12 && minutes>=10) || hour==12) {

            hour-=12;
            System.out.println(hour + ":" + minutes + "PM");
        } else if ((hour>12 && minutes<10) || hour==12) {

            hour-=12;
            System.out.println(hour + ":" + "0" + minutes + "PM");
        }
    }
}
