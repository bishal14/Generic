import java.util.ArrayList;

import team.generics.Player;
import team.generics.basketball.BasketBallTeam;
import team.generics.cricket.CricketTeam;
import team.generics.football.FootballTeam;

public class MainClass {

	public static void main(String[] args) {

		// Player of Cricket
		Player<CricketTeam> crP1 = new Player<>("Bikram", "Maharjan", 30);
		Player<CricketTeam> crP2 = new Player<>("Sachin", "Tendukar", 35);
		Player<CricketTeam> crP3 = new Player<>("Birat", "Kohli", 40);
		Player<CricketTeam> crP4 = new Player<>("Dhoni", "dhoni", 39);

		// Player of Football
		Player<FootballTeam> fbP1 = new Player<>("Bishal", "Maharjan", 29);
		Player<FootballTeam> fbP2 = new Player<>("Manish", "Shrestha", 30);
		Player<FootballTeam> fbP3 = new Player<>("Bibek", "Shrestha", 30);
		Player<FootballTeam> fbP4 = new Player<>("Binayak", "Ojha", 38);

		// Player of Basketball
		Player<BasketBallTeam> bsP1 = new Player<>("Michael", "Jordan", 45);
		Player<BasketBallTeam> bsP2 = new Player<>("Michael", "Jordan", 46);
		Player<BasketBallTeam> bsP3 = new Player<>("Michael", "Jordan", 47);
		Player<BasketBallTeam> bsP4 = new Player<>("Michael", "Jordan", 48);

		// Football Teams
		FootballTeam arsenal = new FootballTeam();
		FootballTeam chelsea = new FootballTeam();
		FootballTeam realMadrid = new FootballTeam();
		FootballTeam barcelona = new FootballTeam();
		FootballTeam psg = new FootballTeam();

		// BasketBallTeam names
		BasketBallTeam bostonCeltics = new BasketBallTeam();
		BasketBallTeam chicagoBulls = new BasketBallTeam();
		BasketBallTeam philadelphiaers = new BasketBallTeam();
		BasketBallTeam milwaukeeBucks = new BasketBallTeam();

		// Cricketteam names

		CricketTeam australia = new CricketTeam();
		CricketTeam india = new CricketTeam();
		CricketTeam england = new CricketTeam();
		CricketTeam newzealand = new CricketTeam();
		CricketTeam southafrica = new CricketTeam();

	
		arsenal.addPlayer(fbP1);
		
		bostonCeltics.addPlayer(bsP4);
		
		india.addPlayer(crP4);
		

	}

}
