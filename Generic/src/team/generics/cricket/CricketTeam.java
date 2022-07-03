package team.generics.cricket;

import java.util.ArrayList;

import team.generics.Player;
import team.generics.Team;
import team.generics.TeamGameInterface;
import team.generics.TeamPlayerInterface;
import team.generics.football.FootballTeam;

public class CricketTeam implements TeamGameInterface<CricketTeam>, TeamPlayerInterface<CricketTeam> {

	ArrayList<Player> teams = new ArrayList<>();
	private int points = 0;
	private boolean hasWon = false;
	private boolean isDraw = false;

	public ArrayList<Player> getTeams() {
		return teams;
	}

	public boolean isDraw() {
		return isDraw;
	}

	public int getPoints() {
		return points;
	}

	public boolean isHasWon() {
		return hasWon;
	}

	@Override
	public void addPlayer(Player<CricketTeam> player) {
		teams.add(player);
		System.out.println("Player  "+ player.getName()+" is added.");


	}

	

	@Override
	public void removePlayer(Player player) {
		teams.remove(player);
		System.out.println("Player  "+ player.getName()+" is removed.");

	}

	@Override
	public void calculatePoint(Team<CricketTeam> team) {
		if (hasWon == true) {
			this.points = this.points + 3;

		} else if (hasWon == false) {
			this.points = this.points + 0;

		} else if (isDraw == true) {
			this.points = this.points + 1;

		}
	}

}
