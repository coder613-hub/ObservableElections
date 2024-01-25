package assignment5;

import java.util.ArrayList;

public class StateAlwaysGoesRep implements IElectoralVoteStrategy {

	@Override
	public ElectoralVote getElectoralStrategy(ArrayList<State> states) {
		//Assume the first state, Georgia, goes Republican
		int totalRepVotes = 24;
		int totalDemVotes = 0;
		//start from the second state
		for(int i=1; i<states.size(); i++) {
			totalRepVotes += states.get(i).getRepElectoralVotes();
			totalDemVotes += states.get(i).getDemElectoralVotes();
		}
		return new ElectoralVote(totalDemVotes, totalRepVotes);
	}

	@Override
	public String getStrategyName() {
		return "Republican Favored, One State Always Goes Republican";
	}
	
}
