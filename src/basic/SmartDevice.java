package basic;

/**
 * Digital Device connected to the Internet.
 *
 * @author <a href="mailto:frt1001@alu.ubu.es">Francisco Romero</a>
 * @since 1.0
 * @version 1.0
 */
public class SmartDevice {

    /** Features */
    String processor;
    String rammem;
    String diskmem;

    /**
     * Default features if not specified.
     *
     */
    public SmartDevice(){
        this.processor = "Snapdragon 900";
        this.rammem = "8 GB";
        this.diskmem = "256 GB";
    }

    /**
     *
     * Specific features given
     *
     * @param processor processor's name
     * @param rammem quantity in GB
     * @param diskmem quantity in GB
     */
    public SmartDevice(String processor, String rammem, String diskmem) {
        this.processor = processor;
        this.rammem = rammem;
        this.diskmem = diskmem;
    }

    /**
     * SmartDevice description.
     *
     * @return variable and object description
     */
    public String toString() {
        return "SmartDevice{" +
                "processor='" + processor + '\'' +
                ", rammem='" + rammem + '\'' +
                ", diskmem='" + diskmem + '\'' +
                '}';
    }
}
