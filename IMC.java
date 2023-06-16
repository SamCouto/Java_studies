import java.util.Scanner;

public class IMC {
    public static void main(String[] args) throws Exception {
        
        //Variables:
        int weight;
        double height;

        //Print a query to the user [insert his weight and height]
        System.out.println("Insert your weight and your height:");
            
        //The Scanner function will receive the inputs
        Scanner keyboard = new Scanner(System.in);

        //Variables receive their respective values
        weight = keyboard.nextInt();
        height = keyboard.nextDouble();
        
        //The IMC calculus
        double imc = weight / (height * height);

        //Closing our Scanner function
        keyboard.close();

        //Return the IMC to the user with teo decimal points
        System.out.printf("Your IMC is: %.2f", imc);
        
    }
}