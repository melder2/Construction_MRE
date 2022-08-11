/**
 * 
 * @author Michael Elder
 * Programming Project 1
 * 
 *The Mall class is inheriting from the business class.
 */
public class Mall extends Business {
	/**
	 * Creating private numRentedUnits, medianUnitSize, and numParkingSpaces
	 */
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	/**
	 * Empty argument constructor calling the super constructor and making numRentedUnits, medianUnitSize, and numParkingSpaces = 0
	 */
	public Mall()
	{
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//end empty argument constructor
	/**
	 * Preferred constructor with parameters: projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits, numRentedUnits, medianUnitSize, and numParkingSpaces
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet,
			String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) 
	{
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		super.numRentableUnits = numRentableUnits;
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}//end preferred constructor
	/**
	 * Draw method returns a String
	 */
	public String Draw() {
		return "Drawing code for Mall";
	}//end Draw method
	/**
	 * displayData method returns the parameters of the preferred constructor
	 */
	public String displayData() {
		return "\n" + "Mall" + "\n" + "Project Name: " + projectName + "\n" + "Complete Address: "
				+ completeAddress + "\n" + "Total Square Feet: " + totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup
				+ "\n" + "Subgroup: " + subgroup + "\n" + "Number of Rentable Units" + numRentableUnits + "Number of Rented Units: " + numRentedUnits + "\n" + 
				"Median Unit Size: " + medianUnitSize + "\n" + "Number of Parking Spaces: "+ numParkingSpaces;
	}//end displayDataMethod
	/**
	 * Getter for numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits
	/**
	 * Setter for numRentedUnits
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits
	/**
	 * Getter for medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize
	/**
	 * Setter for medianUnitSize
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize
	/**
	 * Getter for numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces
	/**
	 * Setter for numParkingSpaces
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces
	@Override
	/**
	 * toString method
	 */
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
}//end class