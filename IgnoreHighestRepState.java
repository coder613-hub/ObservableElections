package assignment5;

import java.util.ArrayList;

public class IgnoreHighestRepState implements IPopularVoteStrategy {

	@Override
	public PopularVote getPopularStrategy(ArrayList<State> states) {
		int totalRepVotes = 0;
		int totalDemVotes = 0;
		State maxRepState = highestRepState(states);
		
		for(State state : states) {
			if(!state.equals(maxRepState)) {
				totalRepVotes += state.getRepVotes();
			}
			totalDemVotes += state.getDemVotes();
		}
		
		return new PopularVote(totalDemVotes, totalRepVotes);
	}
	
	public State highestRepState(ArrayList<State> states) {
		State maxState = null;
		int maxRepVote = 0;
		for(State state : states) {
			if(state.getRepVotes() > maxRepVote) {
				maxRepVote = state.getRepVotes();
				maxState = state;
			}
		}
		return maxState;
	}

	@Override
	public String getStrategyName() {
		return "Democratic Favored, Ignore Highest Republican State";
	}

}
