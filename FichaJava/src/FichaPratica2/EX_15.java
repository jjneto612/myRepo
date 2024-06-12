package FichaPratica2;

import java.util.Scanner;

public class EX_15 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        int firstNumber;
        int secondNumber;
        int lastNumber;

        String choice=input.next();

        switch (choice){

            case "C":

                if(num1<num2 && num1<num3){

                    firstNumber=num1;

                    if (num2<num3){

                        secondNumber=num2;
                        lastNumber=num3;
                    }else {

                        secondNumber=num3;
                        lastNumber=num2;

                    }

                    System.out.println(firstNumber + " " + secondNumber + " " + lastNumber );
                }



                if(num2<num1 && num2<num3){

                    firstNumber=num2;

                    if (num1<num3){

                        secondNumber=num1;
                        lastNumber=num3;
                    }else {

                        secondNumber=num3;
                        lastNumber=num1;

                    }

                    System.out.println(firstNumber + " " + secondNumber + " " + lastNumber );
                }


                if(num3<num2 && num3<num1){

                    firstNumber=num3;

                    if (num2<num1){

                        secondNumber=num2;
                        lastNumber=num1;
                    }else {

                        secondNumber=num1;
                        lastNumber=num2;

                    }

                    System.out.println(firstNumber + " " + secondNumber + " " + lastNumber );
                }
                break;

            case "D":

                if(num1<num2 && num1<num3){

                    lastNumber=num1;

                    if (num2<num3){

                        secondNumber=num2;
                        firstNumber=num3;
                    }else {

                        secondNumber=num3;
                        firstNumber=num2;

                    }

                    System.out.println(firstNumber + " " + secondNumber + " " + secondNumber );
                }



                if(num2<num1 && num2<num3){

                    lastNumber=num2;

                    if (num1<num3){

                        secondNumber=num1;
                        firstNumber=num3;
                    }else {

                        secondNumber=num3;
                        firstNumber=num1;

                    }

                    System.out.println(firstNumber + " " + secondNumber + " " + lastNumber );
                }


                if(num3<num2 && num3<num1){

                    lastNumber=num3;

                    if (num2<num1){

                        secondNumber=num2;
                        firstNumber=num1;
                    }else {

                        secondNumber=num1;
                        firstNumber=num2;

                    }

                    System.out.println(firstNumber + " " + secondNumber + " " + lastNumber );
                }

        }
    }
}
