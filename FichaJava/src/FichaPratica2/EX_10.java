package FichaPratica2;

import java.util.Scanner;

public class EX_10 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();
        int result;
        String choice=input.next();

        switch (choice){

            case "+":
                result=num1 + num2;
                System.out.println(result);
                break;
            case "-":
                result= num1-num2;
                System.out.println(result);
                break;
            case "*":
                result=num1 * num2;
                System.out.println(result);
                break;
            case ":":
                result=num1/num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
