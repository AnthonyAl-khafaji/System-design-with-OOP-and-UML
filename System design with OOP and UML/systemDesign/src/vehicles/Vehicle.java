package vehicles;


	public abstract class Vehicle {
	    private String brand;
	    protected int year;

	    public Vehicle(String brand, int year) {
	        this.brand = brand;
	        this.year = year;
	    }

	    public abstract void start();

	    public void stop() {
	        System.out.println("Vehicle stopped.");
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public int getYear() {
	        return year;
	    }
	}

