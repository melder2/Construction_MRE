/**
 * 
 * @author Michael Elder
 * Programming Project 1
 * 
 *The Residential class is inheriting from the building class.
 */
public class Residential extends Building {
	/**
	 * Creating protected numBedrooms, numBathrooms, and laundryRoom
	 */
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	/**
	 * Empty argument constructor calling the super constructor and making numBedrooms and numBathrooms = 0 & laundryRoom = false
	 */
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end empty argument constructor
	
	/**
	 * Preferred constructor passing the parameters: projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, and laundryRoom
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet,
					String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) 
	{
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//end preferred constructor
	/**
	 * displayData method that returns the preferred constructor parameters
	 */
	public String displayData() {
		return "\n" + "Residential" + "\n" + "Project Name: " + projectName + "\n" + "Complete Address: "
				+ completeAddress + "\n" + "Total Square Feet: " + totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup
				+ "\n" + "Subgroup: " + subgroup + "\n" + "Number of Bedrooms: " + numBedrooms + "\n" + "Number of Bathrooms: " + numBathrooms + 
				"\n" + "Laundry Room: " + laundryRoom;
	}//end displayData method
	/**
	 * Getter for numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms
	/**
	 * Setter for numBedrooms
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms
	/**
	 * Getter for numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms
	/**
	 * Setter for numBathrooms
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms
	/**
	 * isLaundryRoom method
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom method
	/**
	 * Setter for laundryRoom
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom
	/**
	 * Draw method returning a String
	 */
	public String Draw() {
		return "Drawing code for Residential";
	}//end Draw method
	@Override
	/**
	 * toString method
	 */
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}//end toString method	
}//end class
