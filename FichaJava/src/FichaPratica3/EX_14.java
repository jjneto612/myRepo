package FichaPratica3;

import java.util.Scanner;

public class EX_14 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Quantos numeros deseja inserir: ");
        int tries=input.nextInt();
        int choice=0;
        int num=0;
        boolean stop=true;

        while (stop){

            if (choice<num){

                System.out.println("Não crescente.");
            }
            num=choice;
            System.out.print("Insira um numero: ");
            choice=input.nextInt();
            tries--;
            if (tries==0){



                stop=false;
            }





        }
    }
}
