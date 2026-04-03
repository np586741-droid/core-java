class WorldCupTeam
{
    String countryName; // Changed from teamName for better context
    String captainName;
    static int noOfPlayers = 11;
    String coachName;
    String boardName;   // Changed from ownerName since countries have boards (like BCCI)
    String jerseyColour;
    
    // Default Constructor
    public WorldCupTeam()
    {
        
    }

    // Parameterized Constructor
    public WorldCupTeam(String countryName, String captainName, String coachName, String boardName, String jerseyColour)
    {
        this.countryName = countryName;
        this.captainName = captainName;
        this.coachName = coachName;
        this.boardName = boardName;
        this.jerseyColour = jerseyColour;
    }

    public void displayWorldCupTeamDetails()
    {
        System.out.println("Country: " + countryName);
        System.out.println("Captain: " + captainName);
        System.out.println("Squad Size: " + noOfPlayers);
        System.out.println("Head Coach: " + coachName);
        System.out.println("Cricket Board: " + boardName);
        System.out.println("Jersey Colour: " + jerseyColour);
        System.out.println("---------------------------");
    }
}