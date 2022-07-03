package team.generics.basketball;

import java.util.ArrayList;

import team.generics.Player;
import team.generics.Team;
import team.generics.TeamGameInterface;
import team.generics.TeamPlayerInterface;
import team.generics.cricket.CricketTeam;

public class BasketBallTeam implements TeamGameInterface<BasketBallTeam>, TeamPlayerInterface<BasketBallTeam> {

	private int points = 0;
	private boolean hasWon = false;
	private boolean isDraw = false;

	ArrayList<Player> teams = new ArrayList<>();

	
	public int getPoints() {
		return points;
	}

	public boolean isHasWon() {
		return hasWon;
	}

	public boolean isDraw() {
		return isDraw;
	}

	public ArrayList<Player> getTeams() {
		return teams;
	}

	@Override
	public void addPlayer(Player<BasketBallTeam> player) {
		teams.add(player);
		System.out.println("Player  "+ player.getName()+" is added.");

	}

	@Override
	public void removePlayer(Player player) {
		teams.add(player);
		System.out.println("Player  "+ player.getName()+" is removed.");

	}
	
	

	@Override
	public void calculatePoint(Team<BasketBallTeam> team) {
		if (hasWon == true) {
			this.points = this.points + 3;

		} else if (hasWon == false) {
			this.points = this.points + 0;

		} else if(isDraw==true) {
			this.points = this.points + 1;

		}

	}

}
