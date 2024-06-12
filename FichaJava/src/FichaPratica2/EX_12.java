package FichaPratica2;

import java.util.Scanner;

public class EX_12 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();

        switch (choice){

            case 1:
                System.out.println("Criar");
                break;
            case 2:
                System.out.println("Atualizar");
                break;
            case 3:
                System.out.println("Eliminar");
                break;
            case 4:
                break;
            default:
                System.out.println("Escolha invalida");
        }
    }
}
