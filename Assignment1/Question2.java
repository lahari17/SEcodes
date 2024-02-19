package Assignment1;

class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void print() {
        System.out.println("Ship name: " + name);
        System.out.println("Year built: " + yearBuilt);
    }
}

class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Getter and setter
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Maximum number of passengers: " + maxPassengers);
    }
}

class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Getter and setter
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Cargo capacity: " + cargoCapacity + " tons");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("ShipA", "2000");
        ships[1] = new CruiseShip("CruiseShipB", "2010", 1000);
        ships[2] = new CargoShip("CargoShipC", "2020", 5000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}

