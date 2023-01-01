package assignment5;

import java.util.ArrayList;
//Sara Nordlicht
//Penina Rockove
public interface IPopularVoteStrategy {
	public PopularVote getPopularStrategy(ArrayList<State> states);
	public String getStrategyName();
}
