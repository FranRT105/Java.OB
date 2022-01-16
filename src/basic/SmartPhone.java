package basic;

/**
 *
 * Phone connected to the Internet.
 *
 * @author <a href="mailto:frt1001@alu.ubu.es">Francisco Romero</a>
 * @since 1.0
 * @version 1.0
 * @see basic.SmartDevice
 */
public class SmartPhone extends SmartDevice{

    /** Phone features */
    String camera;
    String battery;
    String connectivity;

    /**
     * Default features if not specified.
     *
     */
    public SmartPhone() {
        this.camera = "SONY 8 mpx";
        this.battery = "4000mAh";
        this.connectivity = "4G";
    }

    /**
     * All parameters given.
     *
     * @param camera camera brand and mpx
     * @param battery capacity in mAh
     * @param connectivity networks allowed
     * @param processor processor's name
     * @param rammem quantity in GB
     * @param diskmem quantity in GB
     */
    public SmartPhone(String camera, String battery, String connectivity, String processor, String rammem, String diskmem) {
        super(processor, rammem, diskmem);
        this.camera = camera;
        this.battery = battery;
        this.connectivity = connectivity;
    }

    /**
     * SmartPhone description, including SmartDevice features.
     *
     * @return variable and object description
     */
    @Override
    public String toString() {
        return "SmartPhone{" +
                "processor='" + processor + '\'' +
                ", rammem='" + rammem + '\'' +
                ", diskmem='" + diskmem + '\'' +
                ", camera='" + camera + '\'' +
                ", battery='" + battery + '\'' +
                ", connectivity='" + connectivity + '\'' +
                '}';
    }
}
