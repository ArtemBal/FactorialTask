package Factorial;

public class FindNumberByFactorial {

    public int factorial(int f){
        if(f < 0 ){
            System.out.println("Incorrect data entry!");
            System.exit(0);
        }
        int i = 1;
        while ((f = f / i) > i){
            i++;
        }
        return i;
    }
}
