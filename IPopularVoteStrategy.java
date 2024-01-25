package assignment5;

import java.util.ArrayList;

public interface IPopularVoteStrategy {
	public PopularVote getPopularStrategy(ArrayList<State> states);
	public String getStrategyName();
}
