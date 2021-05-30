import java.util.Arrays;

public class Vehicle implements Comparable<Vehicle> {
    private String vehiclename;
    private double milage;
    private int capacity;

    public Vehicle(String vehiclename, double milage, int capacity) {
        this.vehiclename = vehiclename;
        this.milage = milage;
        this.capacity = capacity;
    }

 
    public String getVehicleName() {
        return vehiclename;
    }

    public double getMilage() {
        return milage;
    }

    public int getCapacity() {
        return capacity;
    }

  
    public void setVehicleName(String name) {
        this.vehiclename = name;
    }

    public void setMilage(double milage) {
        this.milage = milage;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /* @Override
    public int compareTo(Vehicle v) {
        // Sorting by milage
        if(milage == v.milage)
            return 0;
        else if(milage < v.milage) {
            return -1;
        }
        else
            return 1;
    } */

    @Override
    public int compareTo(Vehicle v) {
        
        return vehiclename.compareTo(v.vehiclename);
    }

    @Override
    public String toString() {
        return vehiclename + " - Milage: " + milage + " kmpl - Capacity:
         " + capacity;
    }

    public static void main(String[] args) {
        Vehicle v_arr[] = new Vehicle[5];
        v_arr[0] = new Vehicle("Bajaj", 70, 2);
        v_arr[1] = new Vehicle("Honda", 64.5, 2);
        v_arr[2] = new Vehicle("Volvo", 46, 4);
        v_arr[3] = new Vehicle("Bmw ", 39, 4);
        v_arr[4] = new Vehicle("Hyundai ", 25, 6);

        Arrays.sort(v_arr);

        for(int i = 0; i < v_arr.length; i++) {
            System.out.println(v_arr[i]);
        }
    }
}