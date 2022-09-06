import java.util.*;
public class Station {
	Detective[] detectiveList;
	String stationName;
	static final int MAX_DETECTIVES= 5;
	static int lastBadgeNumber = 1;

	int currentStationIndex = 0;

	public Detective[] getDetectiveList() {
		return detectiveList;
	}

	public Station(String stationName) {
		super();
		this.detectiveList  = new Detective[MAX_DETECTIVES];
		this.stationName = stationName;
	}


	public void hire(){


		//In case of maxed out station.
		if(currentStationIndex +1 == MAX_DETECTIVES){
			System.out.println("Can't hire any more detectives for " +stationName);
		}
		else {
			String name;
			Scanner userInput = new Scanner(System.in);

			//Create detective
			System.out.println("New hire for " + stationName + "...Enter detective's name:");
			name = userInput.nextLine();

			Detective newDetective = new Detective(name, lastBadgeNumber);
			lastBadgeNumber++;

			//Add detective to list of detectives.
			detectiveList[currentStationIndex] = newDetective;
			currentStationIndex++;
		}




	}
}
