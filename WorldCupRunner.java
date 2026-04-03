class WorldCupRunner {
    public static void main(String[] args) {
  
        WorldCupTeam india = new WorldCupTeam("India", "Rohit Sharma", "Gautam Gambhir", "BCCI", "Blue");
		india.displayWorldCupTeamDetails();
        WorldCupTeam australia = new WorldCupTeam("Australia", "Pat Cummins", "Andrew McDonald", "Cricket Australia", "Yellow");
		australia.displayWorldCupTeamDetails();
        WorldCupTeam england = new WorldCupTeam("England", "Jos Buttler", "Brendon McCullum", "ECB", "Red and Blue");
		england.displayWorldCupTeamDetails();
        WorldCupTeam southAfrica = new WorldCupTeam("South Africa", "Aiden Markram", "Rob Walter", "CSA", "Green");
		southAfrica.displayWorldCupTeamDetails();
        WorldCupTeam newZealand = new WorldCupTeam("New Zealand", "Tom Latham", "Gary Stead", "NZC", "Black");
		newZealand.displayWorldCupTeamDetails();
        WorldCupTeam pakistan = new WorldCupTeam("Pakistan", "Babar Azam", "Jason Gillespie", "PCB", "Green");
		pakistan.displayWorldCupTeamDetails();
        WorldCupTeam westIndies = new WorldCupTeam("West Indies", "Rovman Powell", "Daren Sammy", "CWI", "Maroon");
		westIndies.displayWorldCupTeamDetails();
        WorldCupTeam sriLanka = new WorldCupTeam("Sri Lanka", "Charith Asalanka", "Sanath Jayasuriya", "SLC", "Blue");
		sriLanka.displayWorldCupTeamDetails();
        WorldCupTeam afghanistan = new WorldCupTeam("Afghanistan", "Rashid Khan", "Jonathan Trott", "ACB", "Blue");
		afghanistan.displayWorldCupTeamDetails();
        WorldCupTeam bangladesh = new WorldCupTeam("Bangladesh", "Najmul Hossain Shanto", "Phil Simmons", "BCB", "Green and Red");
		bangladesh.displayWorldCupTeamDetails();

        System.out.println("=== ICC World Cup Teams List ===");
        System.out.println("-------------------------------");
    }
}