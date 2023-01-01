package assignment5;
//Sara Nordlicht
//Penina Rockove
import java.util.ArrayList;

public class StateWithMostElectoralGoesDem implements IElectoralVoteStrategy{

	@Override
	public ElectoralVote getElectoralStrategy(ArrayList<State> states) {
		State maxState = determineStateWithMostElectoralVotes(states);
		int totalRepVotes = 0;
		int totalDemVotes = 0;
		for(State state : states) {
			//if state has most electoral votes, give all votes to Democrat
			if (state.getName().equals(maxState.getName())) {
				totalDemVotes += state.getElectoralVotes();
			} else {
			totalRepVotes += state.getRepElectoralVotes();
			totalDemVotes += state.getDemElectoralVotes();
			}
		}
		return new ElectoralVote(totalDemVotes, totalRepVotes);
	}
	
	public State determineStateWithMostElectoralVotes (ArrayList<State> states) {
		State maxState = null;
		int maxElectVote = 0;
		for(State state : states) {
			if(state.getElectoralVotes() > maxElectVote) {
				maxElectVote = state.getElectoralVotes();
				maxState = state;
			}
		}
		return maxState;
	}

	@Override
	public String getStrategyName() {
		return "Democratic Favored, Largest State Goes Democratic";
	}

}
