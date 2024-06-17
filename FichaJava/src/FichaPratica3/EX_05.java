package FichaPratica3;

import java.util.Scanner;

public class EX_05 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int num=input.nextInt();
        input.nextLine();
        
        String message=input.nextLine();

        for (int i = 0; i < num; i++) {

            System.out.println(message);
        }
    }
}
