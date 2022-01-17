package basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Sessions 7-9
 *
 * @author <a href="mailto:frt1001@alu.ubu.es">Francisco Romero</a>
 * @since 1.0
 * @version 1.0
 */
public class Misc {

    public static void main(String[] args) {
        // reverse("Hello World");
        // array();
        // intArray();
        // manipulatesVector();
        // printVectorAndArrayList();
        // removeEvenFromArrayList();

        try {
            System.out.println(divideByZero(16, 0));
        } catch (ArithmeticException  e) {
            System.out.println("Demo Code: Exception control.");
        }
    }

    /**
     * Ex.0 Reverse a string
     * @param text given
     */
    public static void reverse(String text) {
        String reverse = "";
        for (int i = text.length() - 1 ; i >= 0; i--) {
            reverse = reverse.concat(Character.toString(text.charAt(i)));
        }
        System.out.println(reverse);
    }

    /**
     * Ex.1 This function creates an array and prints it.
     */
    public static void array(){
        String [] names = { "Pepe", "Juan", "María", "Carlos"};
        for (String value : names) {
            System.out.println(value);
        }
    }


    /**
     * Ex.2 Initializes an array and prints it with values and indexes.
     */
    public static void intArray() {
        int [][] values = new int[5][5];

        for (int i = 0; i < values.length; i++){
            for (int j = 0; j < values[0].length; j++){
                // Since Java 1.7, creates an instance of Random() is not recommended.
                // Using recommended alternative.
                values[i][j] = ThreadLocalRandom.current().nextInt(0, 100 + 1);
                System.out.println("Stored value: " + values[i][j] + " in position " + "[" + i + "]" + "[" + j + "]");
            }
        }
    }


    /**
     * Ex.3 Creates and manipulates a vector.
     */
    public static void manipulatesVector() {
        String [] names = { "Pepe", "Juan", "Manolo", "María", "Lucía"};
        Vector<String> vector = new Vector<String>();

        vector.add("Pepe");
        vector.add("Juan");
        vector.add("Manolo");
        vector.add("María");
        vector.add("Lucía");

        System.out.println("size: " + vector.size() + " and capacity: " + vector.capacity());
        for (String i : vector){
            System.out.println(i);
        }

        // Juan (second element), Manolo (third element)
        // Removes index 1 -> value Juan
        vector.remove(1);
        // Removing Juan changes all index, now Manolo is vector's second element
        vector.remove(1);

        System.out.println("\nsize: " + vector.size() + " and capacity: " + vector.capacity());
        for (String i : vector){
            System.out.println(i);
        }
    }

    /*
    Ex.4 Vector with default capacity.

    Initial capacity of a Vector instance is 10.
    If we want to create 1000 records, we'll need to relocate (copy) Vector to adapt to the new size.
    As it may be possible, it's not recommended due to the computational cost that implies copying mechanism of arrays.
    As Vector gets more elements, it doubles it capacity each time required. If we are sure we'll need 1000 records it implies
    (10-20-40-80-160-320-640-1280) 7 relocations. We should initialize the vector with 1000+ capacity to avoid slow app.
     */

    /**
     * Ex.5 Create a vector, copy it to a LinkedList and print them.
     */
    public static void printVectorAndArrayList(){
        ArrayList<String> arrayList = new ArrayList<String>(4);
        arrayList.add("Pepe");
        arrayList.add("Juan");
        arrayList.add("Lucía");
        arrayList.add("Manolo");

        LinkedList<String> list = new LinkedList<String>(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("ArrayList value: " + arrayList.get(i) + ", LinkedList value: " + list.get(i));
        }
    }

    /**
     * Ex.6 Removes even numbers from ArrayList
     */
    public static void removeEvenFromArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            arrayList.add( i+1 );
            System.out.println(arrayList.get(i));
        }


        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i) % 2 == 0)) {
                arrayList.remove(i);
                // Each time we remove an element, arrayList's size varies.
                // Decrementing i ensure us to complete de whole loop.
                i--;
            }else {
                System.out.println(arrayList.get(i));
            }
        }
    }

    /**
     * Ex.7 Throw an ArithmeticException if user tries to divide by zero.
     *
     * @param numberA first integer
     * @param numberB second integer
     * @return division if both numbers are correct
     * @throws ArithmeticException when numberB = 0
     */
    public static int divideByZero(int numberA, int numberB) throws ArithmeticException {
        try {
            return numberA / numberB;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("That can't be done!");
        }
    }
}
