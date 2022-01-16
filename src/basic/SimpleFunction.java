package basic;

/**
 * Return a given price with taxes.
 *
 * @author <a href="mailto:frt1001@alu.ubu.es">Francisco Romero</a>
 * @since 1.0
 * @version 1.0
 *
 */
public class SimpleFunction {

    /**
     *
     * Main function.
     *
     * @param args prompt arguments
     */
    public static void main(String[] args) {

        double price = 10.0;
        System.out.println(priceWithTaxes(price));

    }

    /**
     *
     * Calculates price with 21% taxes included.
     *
     * @param price given
     * @return price with taxes added
     */
    public static double priceWithTaxes(double price){
        return price * 1.21;
    }
}
