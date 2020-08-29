import java.util.Random;
import java.util.Scanner;

  public class Game{

    public static void main(String[] args){

     Random random = new Random();
     int number = random.nextInt(100);
     int tries = 0;
     Scanner scanner = new Scanner(System.in);
     int guess;
     boolean win = false;
     
     while (win == false) {

     System.out.println("Guess a number between 1 and 100:");
     guess = scanner.nextInt();
     tries++;

     if(guess == number) {
         win = true;

        }
       else if (guess <= number) {
           System.out.println("You're very cold, try guessing higher");
        }
        else if (guess >= number) {
            System.out.println("You're very hot, try guessing lower");
        }
    }
    System.out.println("you got it!Congrats");
    System.out.println("The secret number was:" +  number);
    System.out.println("Numbers of tries :" +  tries +  "tries");
 }
}
