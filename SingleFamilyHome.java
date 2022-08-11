/**
 * 
 * @author Michael Elder
 * Programming Project 1
 * 
 *The SingleFamilyHome class is inheriting from the residential class.
 */
public class SingleFamilyHome extends Residential{
	/**
	 * Creating private garage
	 */
	private boolean garage;
	
	/**
	 * Empty argument constructor that calls the super constructor and sets garage = false
	 */
	
	public SingleFamilyHome()
	{
		super();
		garage = false;
	}//end empty argument constructor
	
	/**
	 * Preferred constructor with parameters: projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom, and garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet,
			String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) 
	{
		super.projectName = projectName;
		super.completeAddress = completeAddress;
		super.totalSquareFeet = totalSquareFeet;
		super.occupancyGroup = occupancyGroup;
		super.subgroup = subgroup;
		super.numBedrooms = numBedrooms;
		super.numBathrooms = numBathrooms;
		super.laundryRoom = laundryRoom;
		this.garage = garage;	
	}//end preferred constructor
	
	/**
	 * Draw method that returns a String
	 */
	public String Draw() {
		return "Drawing code for a Single Family Home";
	}//end Draw method
	
	/**
	 * displayData method that returns the parameters of the preferred constructor
	 */
	public String displayData() {
		return "\n" + "Single Family Home" + "\n" + "ProjectName: " + projectName + "\n" + "Complete Address: "
				+ completeAddress + "\n" + "Total Square Feet: " + totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup
				+ "\n" + "Subgroup: " + subgroup + "\n" + "Number of Bedrooms: " + numBedrooms + "\n" + "Number of Bathrooms: " + numBathrooms
				+ "\n" + "Laundry Room: " + laundryRoom + "\n" + "Garage: " +  garage; 
	}//end displayData method
	/**
	 * isGarage method
	 */
	public boolean isGarage() {
		return garage;
	}//end isGarage
	/**
	 * Setter for garage
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString method
}//end class
