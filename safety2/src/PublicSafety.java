import java.util.Scanner;

public class PublicSafety {
	
	private
	String cityName;
	String universityName;
	Station cityStation;
	Station uniStation;
	
	public PublicSafety(String UniversityName, String CityName) {
		cityName = CityName;
		universityName = UniversityName;
		cityStation = new Station(CityName);
		uniStation = new Station(UniversityName);
	}

	public void doHire(boolean b) {
		//If true hire for the city
		//else hire for the university
		if(b) {
			cityStation.hire();
		}
		else {
			uniStation.hire();
		}
	}


	public void printDetectiveLists(){

		System.out.println("List of detectives for "+ cityName);

		for (int i = 0; i < cityStation.getDetectiveList().length; i++) {
			System.out.println(cityStation.getDetectiveList()[i]);
		}


		System.out.println('\n' + "List of detectives for "+ universityName);
	}

}
