package FichaPratica2;

import java.util.Scanner;

public class EX_09 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int smallestNumber;

        if (num1<num2 && num1<num3){

            smallestNumber=num1;
            System.out.println(smallestNumber);
        } else if (num2<num1 && num2<num3) {

            smallestNumber=num2;
            System.out.println(smallestNumber);
        } else if (num3<num1 && num3<num2) {

            smallestNumber=num3;
            System.out.println(smallestNumber);
        }
    }
}
