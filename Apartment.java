/**
 * 
 * @author Michael Elder
 * Programming Project 1
 * 
 *The Apartment class is inheriting from the residential class.
 */
public class Apartment extends Residential{
	/**
	 * Creating private numRentableUnits, avgUnitSize, and parkingAvailable
	 */
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	/**
	 * Empty argument constructor that calls the super constructor, sets numRentableUnits and avgUnitSize = 0, and set parkingAvailable = false
	 */
	public Apartment()
	{
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = false;
	}//empty argument constructor
	
	/**
	 * Preferred constructor with parameters: projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBedrooms, numBathrooms, 
	 * laundryRoom, numRentableUnits, avgUnitSize, and parkingAvailable
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet,
			String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, 
			boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailabile) 
	{
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		super.numBedrooms = numBedrooms;
		super.numBathrooms = numBathrooms;
		super.laundryRoom = laundryRoom;
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//end preferred constructor	
	
	/**
	 * Draw method that returns a String
	 */
	public String Draw() {
		return "Drawing code for Apartment";
	}//end Draw method
	public String displayData() {
		return "\n" + "Apartment" + "\n" + "Project Name: " + projectName + "\n" + "Complete Address: " + completeAddress + "\n" + "Total Square Feet: " + totalSquareFeet + "\n"
				+ "Occupancy Group: " + occupancyGroup + "\n" + "Subgroup: " + subgroup + "\n" + "Number of Bedrooms: " + numBedrooms + "\n" + "Number of Bathrooms: " + numBathrooms 
				+ "\n" + "Laundry Room: " + laundryRoom + "Number of Rentable Units: " + numRentableUnits + "\n" + "Average Unit Size: " + avgUnitSize + "\n" +
				"Parking Available: " + parkingAvailable;
	}
	
	/**
	 * Getter for numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits
	/**
	 * Setter for numRentableUnits
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	/**
	 * Getter for avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize
	/**
	 * Setter for avgUnitSize
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize
	/**
	 * Getter for parkingAvailable
	 */
	public boolean getParkingAvailable() {
		return parkingAvailable;
	}//end getParkingAvailable
	/**
	 * Setter for parkingAvailable
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable
	@Override
	/**
	 * toString method
	 */
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString method
}//end class
