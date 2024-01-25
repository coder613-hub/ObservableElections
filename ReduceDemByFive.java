package assignment5;

import java.util.ArrayList;

public class ReduceDemByFive implements IPopularVoteStrategy {
	
	@Override
	public PopularVote getPopularStrategy(ArrayList<State> states) {
		int totalRepVotes = 0;
		int totalDemVotes = 0;
		for(State state : states) {
			totalRepVotes += state.getRepVotes();
			int tempDemVotes = state.getDemVotes();
			tempDemVotes = (int) Math.floor(tempDemVotes*.95);
			totalDemVotes += tempDemVotes;
		}
		return new PopularVote(totalDemVotes, totalRepVotes);
	}

	@Override
	public String getStrategyName() {
		return "Republican Favored, Reduce Democratic Votes By 5%";
	}

}
