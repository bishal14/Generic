package team.generics.football;

import java.util.ArrayList;

import team.generics.Player;
import team.generics.Team;
import team.generics.TeamGameInterface;
import team.generics.TeamPlayerInterface;

public class FootballTeam implements TeamGameInterface<FootballTeam>, TeamPlayerInterface<FootballTeam> {

	private int points = 0;
	private boolean hasWon = false;
	private boolean isDraw=false;
	ArrayList<Player> teams = new ArrayList();

	public int getPoints() {
		return points;
	}

	@Override
	public void calculatePoint(Team team) {

		if (hasWon == true) {
			this.points = this.points + 3;

		} else if (hasWon == false) {
			this.points = this.points + 0;

		} else if(isDraw==true) {
			this.points = this.points + 1;

		}

	}
	

	public ArrayList<Player> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Player> teams) {
		this.teams = teams;
	}

	@Override
	public void addPlayer(Player<FootballTeam> player) {
		teams.add(player);
		System.out.println("Player  "+ player.getName()+" is added.");
	}

	@Override
	public void removePlayer(Player player) {
		teams.remove(player);
		System.out.println("Player  "+ player.getName()+" is removed.");

	}

}
