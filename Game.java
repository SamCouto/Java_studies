import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {
        
        /*
         * What is the main goal? 
         *  - Help a warrior to find out how man enemies his 300 man team will be facing in battle.
         * What is the correct answer?
         *  - The correct answer is 10.000 man
         */

        //Variables
        int guess;
        int correctValue = 10000;

        //The Scanner function will read the user input
        Scanner input = new Scanner(System.in);
            
        //Ask the user for a value
        System.out.println("Let's help a warrior to discover how many people his army will be facing in battle!");
        System.out.println("Enter your guess:");

        //Variable that our Scanner function will store the guess value
        guess = input.nextInt();

        //We'll create a while condition, to force the user to find the correct answer
        //That while condition could be made in another manner, such like:
        /*
         * String = message;
         * massage = guess > correctAnswer ? "A little less..." : "A little more...";
         * System.out.println(message);
         * 
         * **Always remembering the logical operators:
         *  AND: &&
         *  OR: ||
         *  NOT: !
         */
        
        //Loop:
        //While our query isn't complete, the system will force the user to continue
         while(guess != correctValue){
            
            //If our guess is smaller than the correct answer:
            //The system will tell that the guess needs to be a little bigger
            if(guess > correctValue){
                System.out.println("A little less...");
                System.out.println("Try again!");
            }

            //Any value bigger than the correct answer:
            //The system will tell that the guess needs to be a little smaller
            else{
                System.out.println("A little more...");
                System.out.println("Try again!");
            }

            //Ask the user to input a guess
            System.out.println("Enter another guess:");
            
            //Variable that the Scanner will store our guess value
            guess = input.nextInt();
            
        //Closing our Scanner function
        input.close();
        }

        //Here our loop ends, 'cause the user found the correct answer
        System.out.println("Congrats! You've found the correct answer!");
        
    }
}