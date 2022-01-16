package basic;

/**
 * Using loops, concat an array of Strings and print it on CLI
 *
 * @author <a href="mailto:frt1001@alu.ubu.es">Francisco Romero</a>
 * @since 1.0
 * @version 1.0
 *
 */
public class Loop {

    /** Strings Array */
    private static String [] words = {"This", "is", "a", "dog."};

    /**
     *
     * Main function
     *
     * @param args prompt arguments
     */
    public static void main(String[] args) {
        int i = 0;
        String phrase = "";
        while (i < words.length) {
            phrase = phrase.concat(words[i]).concat(" ");
            i++;
        }
        System.out.println(phrase);
    }

}
