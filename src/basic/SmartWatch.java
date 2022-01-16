package basic;

/**
 *
 * Watch connected to the Internet.
 *
 * @author <a href="mailto:frt1001@alu.ubu.es">Francisco Romero</a>
 * @since 1.0
 * @version 1.0
 * @see basic.SmartDevice
 */
public class SmartWatch extends SmartDevice{

    /** Watch features */
    String radius;
    String crystal;
    boolean heartrate;

    /**
     * Default features if not specified.
     *
     */
    public SmartWatch() {
        this.radius = "42 mm";
        this.crystal = "PVC";
        this.heartrate = false;
    }

    /**
     * All parameters given.
     *
     * @param radius device's size
     * @param crystal material
     * @param heartrate capacity to calculate heart parameters
     * @param processor processor's name
     * @param rammem quantity in GB
     * @param diskmem quantity in GB
     */
    public SmartWatch(String radius, String crystal, boolean heartrate, String processor, String rammem, String diskmem) {
        super(processor, rammem, diskmem);
        this.radius = radius;
        this.crystal = crystal;
        this.heartrate = heartrate;
    }

    /**
     * SmartWatch description, including SmartDevice features.
     *
     * @return variable and object description
     */
    @Override
    public String toString() {
        return "SmartWatch{" +
                "processor='" + processor + '\'' +
                ", rammem='" + rammem + '\'' +
                ", diskmem='" + diskmem + '\'' +
                ", radius='" + radius + '\'' +
                ", crystal='" + crystal + '\'' +
                ", heartrate=" + heartrate +
                '}';
    }
}
