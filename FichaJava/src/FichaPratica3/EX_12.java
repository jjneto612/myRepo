package FichaPratica3;

import java.util.Scanner;

public class EX_12 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int num;

        String command;

        boolean stop=true;

        while (stop){

            System.out.println("Introduza um número: ");
            num=input.nextInt();

            if(num>=0 && num<=25){

                int tries=0;
                tries++;

                System.out.println("[0,25] " + tries);
            }
            if(num>=26 && num<=50){

                int tries=0;
                tries++;

                System.out.println("[26,50] " + tries);
            }

            if(num>=51 && num<=75){

                int tries=0;
                tries++;

                System.out.println("[51,75] " + tries);
            }

            if(num>=76 && num<=100){

                int tries=0;
                tries++;

                System.out.println("[76,100] " + tries);
            }

            System.out.println("Continuar ?");
            command=input.next();

            if (!command.equals("Continue")){


                stop=false;
            }

        }
    }
}
