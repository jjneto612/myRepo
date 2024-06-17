package FichaPratica3;

import java.util.Scanner;

public class EX_09 {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);

         int num;
         int tries=0;
         boolean stop=true;
         int total=0;

         while (stop){

             num=input.nextInt();

             if (num==-1){

                 total=total/tries;
                 System.out.println(total);
                 stop=false;

             }

             tries++;


             total+=num;


         }
    }
}
