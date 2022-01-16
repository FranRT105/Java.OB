package basic;

/**
 * Description and range of Java data types.
 *
 * @author <a href="mailto:frt1001@alu.ubu.es">Francisco Romero</a>
 * @since 1.0
 * @version 1.0
 *
 */
public class DataTypes {

    /**
     * Printing and explaining by comments DT.
     *
     * @param args prompt arguments
     */
    public static void main(String[] args) {
        // type identifier = value;
        // type identifier; -- Creates mem reservation
        // then: identifier = value;

        // Primitive types can't be null.
        // Null -> wrapper classes (start with capital letter).

        // Integers
        byte number1 = 1;   // 1 byte
        short number2 = 2;  // 2 bytes
        int number3 = 3;    // 3 bytes
        long number4 = 4;   // 4 bytes

        // Floats
        float decimal1 = 4.9f;
        double decimal2 = 9.99;

        // Character
        char caracter1 = 'a';

        // booleans
        boolean verdadero = true;
        boolean falso = false;

        // Text String
        String nombre = "Fran";
        String apellido = "Romero";

        // Wrappers
        // e.j. Databases
        Integer numero = null;
        Long numero2 = 2L;

        System.out.println("byte: " + number1 + "\n" +
                "short: " + number2 + "\n" +
                "int: " + number3 + "\n" +
                "long: " + number4 + "\n" +
                "float: " + decimal1 + "\n" +
                "double: " + decimal2 + "\n" +
                "char: " + caracter1 + "\n" +
                "boolean T: " + verdadero + "\n" +
                "boolean F: " + falso + "\n" +
                "String: " + nombre + " " + apellido + "\n" +
                "Int (object): " + numero + "\n" +
                "Long (object): " + numero2);
    }
}
