package assignment5;

import java.util.ArrayList;

public class HonestPop implements IPopularVoteStrategy {
	//Sara Nordlicht
	//Penina Rockove
	@Override
	public PopularVote getPopularStrategy(ArrayList<State> states) {
		int totalRepVotes = 0;
		int totalDemVotes = 0;
		for(State state : states) {
			totalRepVotes += state.getRepVotes();
			totalDemVotes += state.getDemVotes();
		}
		return new PopularVote(totalDemVotes, totalRepVotes);
	}

	@Override
	public String getStrategyName() {
		return "Honest Popular Strategy";
	}

}
