/**
 * 
 * @author Michael Elder
 * Programming Project 1
 * 
 * The application class creates all of the objects and different methods
 */
public class Application {

	public static void main(String[] args) {
		Building gainesHouse = new Building("Gaines House", "123 Main Street | Louisville, KY 40201", 2540,"Residential", "R1");
		Business mallComplex = new Business("Mall Complex", "234 Second Street | Louisville, KY 402405", 30000, "Business", "B", 2);
		Residential residentialComplex = new Residential("Residential Complex", "118 East Jefferson Street | Corbin, Indiana 40701", 50000, "Residential", "R1", 50, 45, true);
		SingleFamilyHome markSingleFamily = new SingleFamilyHome("Mark's House", "123 Main Street | Louisville, KY 40201", 3000, "Residential", "R1", 4, 3, true, true);
		Mall mall1 = new Mall("Mall", "234 Second Street | Louisville, KY 40205", 30000, "Business", "B", 20, 15, 1500, 200);
		Apartment ap1 = new Apartment("Apartment", "118 East Jefferson Street Unit 1 | Corbin, Indiana 40701", 50000, "Residential", "R1", 40, 35, false, 20, 2500, true);
		System.out.println(gainesHouse.Draw());
		System.out.println(gainesHouse.displayData());
		System.out.println(mallComplex.Draw());
		System.out.println(mallComplex.displayData());
		System.out.println(residentialComplex.Draw());
		System.out.println(residentialComplex.displayData());
		System.out.println(mall1.Draw());
		System.out.println(mall1.displayData());
		System.out.println(ap1.Draw());
		System.out.println(ap1.displayData());
		System.out.println(markSingleFamily.Draw());
		System.out.println(markSingleFamily.displayData());
	}//end main
}//end class
