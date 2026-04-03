class FifaTeam
{
	String teamName;
	String captainName;
	static int noOfPlayers=11;
	String coachName;
	String ownerName;
	String jerseyColour;
	
	public FifaTeam()
	{
		
	}
	public FifaTeam(String teamName,String captainName,String coachName,String ownerName,String jerseyColour)
	{
		this.teamName=teamName;
		this.captainName=captainName;
		this.coachName=coachName;
		this.ownerName=ownerName;
		this.jerseyColour=jerseyColour;
	}
	public  void displayFifaTeamDetails()
	{
		System.out.println("Team Name:"+teamName);
		System.out.println("Captain Name:"+captainName);
		System.out.println("No Of Players:"+noOfPlayers);
		System.out.println("Coach Name:"+coachName);
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Jersey Colour:"+jerseyColour);
		System.out.println("---------------------------");
	}
}