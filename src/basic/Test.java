package basic;

public class Test {

    public static void main(String[] args) {
        /*
        SmartDevice device1 = new SmartPhone();
        SmartDevice device2 = new SmartPhone("SONY 12MPX", "5000mAh", "4G", "Kirin 990", "16 GB", "128 GB");
        SmartDevice device3 = new SmartWatch();
        SmartDevice device4 = new SmartWatch("46mm", "shapire", true, "Mediatek M450", "2 GB", "16 GB");

        System.out.println(device1);
        System.out.println(device2);
        System.out.println(device3);
        System.out.println(device4);
        */

        CarCRUD car1 = new CarCRUDImpl();

        System.out.println(car1.save());
        System.out.println(car1.findAll());
        System.out.println(car1.delete());
    }
}
