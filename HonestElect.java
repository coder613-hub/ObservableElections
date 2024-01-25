package assignment5;

import java.util.ArrayList;

public class HonestElect implements IElectoralVoteStrategy {
	
	@Override
	public ElectoralVote getElectoralStrategy(ArrayList<State> states) {
		int totalRepVotes = 0;
		int totalDemVotes = 0;
		for(State state : states) {
			totalRepVotes += state.getRepElectoralVotes();
			totalDemVotes += state.getDemElectoralVotes();
		}
		return new ElectoralVote(totalDemVotes, totalRepVotes);
	}

	@Override
	public String getStrategyName() {
		return "Honest Electoral Strategy";
	}

}
