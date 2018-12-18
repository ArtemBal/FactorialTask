package Factorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input value of factorial (n!): ");
        int f = in.nextInt();
        FindNumberByFactorial numberByFactorial = new FindNumberByFactorial();
        int result = numberByFactorial.factorial(f);
        int checkResult = 1;
        for(int i = 1; i <= result; i++){
            checkResult *= i ;
        }
        if(checkResult == f){
            System.out.println("Value of n: " + result);
        }else {
            System.out.println("Incorrect value of factorial!");
        }

    }

}
