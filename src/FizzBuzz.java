import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 6;

        if (number > 0 && number <= 100) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        } else {
            System.out.println("Invalid number. Please choose a number between 1-100.");
        }

        System.out.println(returnFizzBuzz(8));

        System.out.println(Arrays.toString(saveFizzBuzz()));

        printIndivLines(saveFizzBuzz());

    }

    public static String returnFizzBuzz(int number) {
        String print = new String();
        if (number > 0 && number <= 100) {
            if (number % 3 == 0 && number % 5 == 0) {
                print = "FizzBuzz";
            } else if (number % 3 == 0) {
                print = "Fizz";
            } else if (number % 5 == 0) {
                print = "Buzz";
            } else {
                print = print + number;
            }
        } else {
            System.out.println("Invalid number. Please choose a number between 1-100.");
        }

        return print;
    }

    public static String[] saveFizzBuzz(){
        String[] numerosFizzBuzz = new String[100];
        for (int i = 0; i <100 ; i++) {
            numerosFizzBuzz[i] = returnFizzBuzz(i+1);
        }
        return numerosFizzBuzz;
    }

    public static String convertIntToString (int number){
        return String.valueOf(number);
    }

    public static String[] saveAsStringArray (){
        String[] numbersString = new String[100];
        for (int i = 0; i < 100; i++) {
            numbersString[i]= convertIntToString(i+1);
        }
        return numbersString;
    }

    public static void printIndivLines(String [] toprint){
        for (int i = 0; i < toprint.length; i++) {
            System.out.println(toprint[i]);

        }
    }





}
