package prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {

    private List<String> vehicleList;

    public Vehicle(List<String> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<String> getVehicleList() {
        return vehicleList;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleList=" + vehicleList +
                '}';
    }

    @Override
    protected Vehicle clone() throws CloneNotSupportedException {

        List<String> vehicles = new ArrayList<>();

        this.vehicleList.forEach(vehicle -> vehicles.add(vehicle));

        return new Vehicle(vehicles);
    }
}
