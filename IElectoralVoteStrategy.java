package assignment5;

import java.util.ArrayList;

public interface IElectoralVoteStrategy {
	public ElectoralVote getElectoralStrategy(ArrayList<State> states);
	public String getStrategyName();
}
