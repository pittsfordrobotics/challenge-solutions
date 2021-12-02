import java.util.Scanner;
import java.util.Arrays;

public class challenges {

    public static void calc(){
        System.out.println("Calculator!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first number:");
        double a = s.nextDouble();
        System.out.println("Enter your operation:");
        String c = s.next();
        System.out.println("Enter your second number:");
        double b = s.nextDouble();
        s.close();
        double ans = 0;
        if (c.equals("+")){
            ans = a + b;
        }
        else if (c.equals("-")){
            ans = a - b;
        }
        else if (c.equals("/")){
            ans = a / b;
        }
        else if (c.equals("*")){
            ans = a * b;
        }

        System.out.println(a + " " + c + " " + b + " = " + ans);


    }

    public static void primeJam(){
        Scanner s = new Scanner(System.in);
        System.out.println("PRIME JAM!");
        System.out.println("Enter a number:");
        int num = s.nextInt();
        s.close();
        boolean prime = true;
        for (int i = 2; i < Math.sqrt(num); i++){
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }

    public static void fizzBuzz(){
        System.out.println("Fizz Buzz Sequence!");
        for(int i = 1; i <= 100; i++){
            String word = "";
            if (i % 3 == 0){
                word += "Fizz";
            }
            if (i % 5 == 0){
                word += "Buzz";
            }
            if (i % 2 == 0){
                word += "Zig";
            }
            if (i % 7 == 0){
                word += "Zag";
            }
            if (i % 19 == 0){
                word += "Quack";
            }
            if (word.equals("")) {
                System.out.println(i);
            }
            else{
                System.out.println(word);
            }
        }
    }

    public static void intGuess(){
        System.out.println("Number Guessing!");
        int i = (int)Math.round(100*Math.random());
        int counter = 0;
        int g = -1;
        Scanner s = new Scanner(System.in);
        while (g != i){
            System.out.println("Guess a number:");
            g = s.nextInt();
            if (g == i){
                System.out.println("You guessed it!");
                System.out.println("It took you " + counter +" guesses.");
                break;
            }
            else if(g > i) {
                System.out.println("Too big!");
            }
            else {
                System.out.println("Too small!");
            }
            counter++;
        }
        s.close();
    }

    public static void collatz1(){
        Scanner s = new Scanner(System.in);
        System.out.println("Singular Collatz!");
        System.out.println("Enter a number:");
        int num = s.nextInt();
        s.close();
        if (num % 2 == 0) {
            num /= 2;
        }
        else {
            num = num * 3 + 1;
        }
        System.out.println(num);
    }

    public static void collatz(){
        Scanner s = new Scanner(System.in);
        System.out.println("Singular Collatz!");
        System.out.println("Enter a number:");
        int num = s.nextInt();
        s.close();
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            System.out.println(num);
        }
    }

    public static void smallestArray(){
        int[] a = {5, 32, 46, 23, 14, 19, 68, 70, 421, 418};
        int n = 0;
//        cheaty method / resourceful method
//        Arrays.sort(a);
//        System.out.println(a[2]);
//        System.out.println(a[n]);

//        using while loops instead
        int temp;
        int count = -1;
        while (count != 0) {
            count = 0;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i+1]){
                    temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                    count++;
                }
            }
        }
        System.out.println(a[2]);
        System.out.println(a[n]);
    }

    public static void main(String[] args) {
//        calc();
//        primeJam();
//        fizzBuzz();
//        intGuess();
//        collatz1();
//        collatz();
//        smallestArray();
    }

}
