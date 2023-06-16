import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws Exception {
        
        /*
         * Read a sequence of N strings and print then in the opposite order
         * Use a Method
         * 
         * Differences between array and arrayList:
         *  - array: Static and limited
         *      - Class/Type variableName[] = {values};
         *  - ArrayList: More flexible
         *      - ArrayList <class> variableName = new ArrayList <class>();
         * 
         * Primitive types in Java:
         *  - int
         *  - float
         *  - double
         *  - char
         */

         //The Scanner function will read the input
        Scanner keyboard = new Scanner(System.in);

        //This is our ArrayList for our names
        ArrayList <String> nameList = new ArrayList<String>();
        
        //Asking for a quantity of names that or list will have
        System.out.println("Insert the quantity of names in the list: ");
        
        //The variable that the Scanner will store our input
        int quantity = keyboard.nextInt();
        
        //The variable that will be receiving the names
        String name;
        
        //Asking the use to input the names
        System.out.println("Insert the names that are in the list: ");
        
        //First loop:
        //Starting from 0 until we reach the quantity value, add one more to the quantity
        for(int i = 0; i < quantity; i++){
            
            //The variable that the Scanner will store the names
            name = keyboard.next();

            //Adding the names of the variable into our ArrayList
            nameList.add(name);
        }

        //Second loop:
        //Starting from our total quantity going down to 0, removing one value of the quantity
        for(int i = nameList.size() - 1; i >= 0; i--){
            
            //Print our ArrayList in the position i
            System.out.println(nameList.get(i));
        }
        
        /*
         * Doing the same thing but using a function:
         * 
         * Collections.reverse(nameList);
         * System.out.println(nameList);
         *  - Collections is a function that have a lot of methods attached on it,
         *    one of those methods is the reversal method.
         */

        //Closing our Scanner function
        keyboard.close();

    }
}