package team.generics;

import team.generics.football.FootballTeam;

public interface TeamPlayerInterface<T> {
	
	public void addPlayer(Player<T> player);
	public void removePlayer(Player player);

}
