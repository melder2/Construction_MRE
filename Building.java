/**
 * 
 * @author Michael Elder
 * Programming Project 1
 * 
 *The building class is the parents class of all of the subclasses.
 */

public class Building {
	/**
	 * Creating projectName, completeAddress, totalSquareFeet, occupancyGroup, and subgroup protected variables that will be inherited.
	 */
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	//creating variables
	
	/**
	 * Empty argument constructor and setting variables equal to empty strings or 0
	 */
	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//end empty argument constructor
	/**
	 * Preferred constructor with parameters projectName, completeAddress, totalSquareFeet, occupancyGroup, and subgroup 
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, 
					String occupancyGroup, String subgroup) 
	{
		
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//end preferred constructor
	/**
	 * Draw method returning a String
	 */
	public String Draw() {
		return "Drawing code for Building";
	}//end Draw method
	/**
	 * displayData returning the parameters of the preferred constructor
	 */
	public String displayData() {
		return "Building" + "\n" + "Project Name: " + projectName + "\n" +  "Address: " + completeAddress +
				"\n" + "Square Feet: " + totalSquareFeet + "\n" + "Occupancy Group: " + occupancyGroup + 
				"\n" + "Occupancy Subgroup: " + subgroup;
	}//end displayData 
	/**
	 * Getter for projectName
	 */
	public String getProjectName() {
		return projectName;
	}//end getProjectName
	/**
	 * Setter for projectName
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName
	/**
	 * Getter for completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress
	/**
	 * Setter for completeAddress
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress
	/**
	 * Getter for totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet
	/**
	 * Setter for totalSquareFeet
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet
	/**
	 * Getter for occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup
	/**
	 * Setter for occupancyGroup
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup
	/**
	 * Getter for subgroup
	 */
	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup
	/**
	 * Setter for subgroup
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end setSubgroup
	@Override
	/**
	 * toString method
	 */
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
}//end class

