package prototype;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws CloneNotSupportedException {
        Vehicle vehicle = new Vehicle(Arrays.asList("Honda", "Toyota", "Volvo"));
        System.out.println(vehicle);

        Vehicle clone = vehicle.clone();

        clone.getVehicleList().add("Fiat");
        System.out.println(clone);
    }
}
