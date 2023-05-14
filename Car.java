public class Car extends Vehicle{

	private int doors;
	private int passengers;

	public Car(String theMake, String theModel, int aPlate, int theDoors, int thePassengers) {
		super(theMake, theModel, aPlate);
		this.doors = theDoors;
		this.passengers = thePassengers;
		
	}
	

	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	
	@Override
	public String toString(){
		String result = "";
		String theMake = super.getMake();
		String theModel = super.getModel();
		String thePlate = super.getPlate();

		result = String.format("%d-door %s %s with license %s\n", this.doors, theMake, theModel, thePlate);
		return result;
	}
	


	@Override
	public boolean equals(Object other) {
	
		if (!(other instanceof Car)){
			return false;
		}
		
		// cast other to current type
		Car otherCar = (Car) other;
		
		if (this.doors==(otherCar.doors)) {
			if (this.passengers==(otherCar.passengers)) {
					return super.equals(other);
			}
		}

		return false;
	}
		
		
	public Car copy() {
		// get the data
		String theMake = super.getMake();
		String theModel = super.getModel();
		String thePlate = super.getPlate();
		int theDoors = this.doors;
		int thePassengers = this.passengers;
		// create and return a copy
		Car theCopy = new Car(theMake, theModel, thePlate, theDoors, thePassengers);
		return theCopy;
		}
	
		
	
}

