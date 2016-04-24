/**
 * Team ZombieBytes
 * V1.0
 * This class knows information common with all types 
 * of projects. The types are as follows:
 * -Submitted
 * -Proposed
 * -Funded*/
public class Project {
	/**
	 * Responsibilities:
	 *  -Knows project information
	 */
	String airQualityAnalysis_CO;
	String airQualityAnalysis_NOX;
	String airQualityAnalysis_VOC;
	String area;
	boolean capacityProject;
	String city;
	String[] county = {"El Paso", "Dona Ana"};
	String[] DOT_District = {"Texas District 24", "NM District 1",
							"NM District 2"};
	int federalFiscalYear;
	String federalFunctionalClassification;
	String[] fundProjectType = {"Highway/Roadway", "Transit"};
	String highwayRoadwayName;
	
	String limitFrom;
	String limitTo;
	String networkYear;
	int numberOfExistingLanes;
	int numberOfMiles;
	int numberOfProjectedLanes;
	String projectDescription;
	String project_ID;
	String projectName;
	String projectType;
	
	//Project phases(don't know type)
	String remarks;
	String scopeOfWork;
	String sponsorAgency;
	String[] stateSystemRoad = {"ON_State System Road",
						"OFF_State System Road", "ON_OFF State System"
								+ "Road"};
	
	String transitInformation;
}
