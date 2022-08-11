/**
 * 
 * @author Michael Elder
 * Programming Project 1
 * 
 *The Business class is inheriting from the building class.
 */
public class Business extends Building {
	/**
	 * Creating protected numRentableUnits
	 */
	protected int numRentableUnits;
	
	/**
	 * Empty argument constructor calling the empty argument constructor from building and setting numRentableUnits = 0
	 */
	public Business() {
		super();
		numRentableUnits = 0;
	}//end empty argument constructor
	/**
	 * Preferred constructor with projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet,
					String occupancyGroup, String subgroup, int numRentableUnits) {
		
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor
	/**
	 * displayData method returns all of the parameters of the preferred constructor
	 */
	public String displayData() {
		return "\n" + "Business" + "\n" + "Project Name: " + projectName + "\n" + "Complete Address: "
				+ completeAddress + "\n" + "Total Square Feet: " + totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup
				+ "\n" + "Subgroup: " + subgroup + "\n" + "Number of Rentable Units: " + numRentableUnits;
	}//end displayData method
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
	}//end setnumRentableUnits
	/**
	 * Draw method that returns a String
	 */
	public String Draw() {
		return "Drawing code for Business";
	}//end Draw method
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString method
}//end class
