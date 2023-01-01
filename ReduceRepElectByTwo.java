package assignment5;

import java.util.ArrayList;

//Sara Nordlicht
//Penina Rockove
public class ReduceRepElectByTwo implements IPopularVoteStrategy {
	// There is a democrat favoring strategy that takes 2% of all republican votes
	// in every state and makes them democrat votes instead
	// (note that this only affects the electoral votes if there is a state within
	// this margin)

	@Override
	public PopularVote getPopularStrategy(ArrayList<State> states) {
		int totalRepVotes = 0;
		int totalDemVotes = 0;
		for (State state : states) {
			//take two percent of Republican vote
			double twopercentrep = state.getRepVotes() * .02;
			//take it off of Republican vote
			int stateRepVotes = (int) (state.getRepVotes() - twopercentrep);
			//give it to Democratic vote
			int stateDemVotes = (int) (state.getDemVotes() + twopercentrep);
			totalRepVotes += stateRepVotes;
			totalDemVotes += stateDemVotes;
		}
		return new PopularVote(totalDemVotes, totalRepVotes);
	}

	@Override
	public String getStrategyName() {
		return "Democratic Favored, Reduce Republican by 2%";
	}
}
