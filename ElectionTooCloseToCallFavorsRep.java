package assignment5;

import java.util.ArrayList;

//Sara Nordlicht
//Penina Rockove
public class ElectionTooCloseToCallFavorsRep implements IElectoralVoteStrategy {
	// There is a second republican favoring strategy that
	// considers the state where the democrat has the smallest lead to be "too close
	// to call"
	// and splits the electoral votes
	// giving half to the democrat and half to the republican
	// (and in the event of an odd number it gives the extra vote to the republican
	// of course)
	@Override
	public ElectoralVote getElectoralStrategy(ArrayList<State> states) {
		State smallestDemLead = getStateWithSmallestDemLead(states);
		int totalRepVotes = 0;
		int totalDemVotes = 0;
		for (State state : states) {
			if (state.getName().equals(smallestDemLead.getName())) {
				int electoralVotes = state.getElectoralVotes();
				if (electoralVotes % 2 == 0) {
					totalRepVotes += electoralVotes / 2;
					totalDemVotes += electoralVotes / 2;
				} else {
					totalRepVotes += electoralVotes / 2 + 1;
					totalDemVotes += electoralVotes / 2;
				}
			} else {
				totalRepVotes += state.getRepElectoralVotes();
				totalDemVotes += state.getDemElectoralVotes();
			}
		}
		return new ElectoralVote(totalDemVotes, totalRepVotes);
	}

	public State getStateWithSmallestDemLead(ArrayList<State> states) {
		State smallestDemLead = null;
		int smallestLead = Integer.MAX_VALUE;
		for (State state : states) {
			if (state.getDemVotes() - state.getRepVotes() < smallestLead) {
				smallestLead = state.getDemVotes() - state.getRepVotes();
				smallestDemLead = state;
			}
		}

		return smallestDemLead;

	}

	@Override
	public String getStrategyName() {
		return "Republican Favored, Too-Close-To-Call";
	}

}
