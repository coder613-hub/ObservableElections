package assignment5;

import java.util.ArrayList;
//Sara Nordlicht
//Penina Rockove
public interface IElectoralVoteStrategy {
	public ElectoralVote getElectoralStrategy(ArrayList<State> states);
	public String getStrategyName();
}
