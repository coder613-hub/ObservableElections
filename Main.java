package assignment5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<State> states = new ArrayList<>();
		
		State state1 = new State("Georgia", 24, 700, 580);
		State state2 = new State("New York", 30, 1500, 2500);
		State state3 = new State("California", 39, 2000, 1800);
		State state4 = new State("Florida", 28, 1700, 1500);
		State state5 = new State("Maine", 19, 1000, 1200);
		
		states.add(state1);
		states.add(state2);
		states.add(state3);
		states.add(state4);
		states.add(state5);
		
		
		ElectionStats electStats = new ElectionStats(states);
		
		RepFavoredObserver repFavored = new RepFavoredObserver(electStats, states);
		DemFavoredObserver demFavored = new DemFavoredObserver(electStats, states);
		DemFavoredPopRepFavoredElectObserver demPopRepElect = new DemFavoredPopRepFavoredElectObserver(electStats, states);
		DemFavoredPopObserver demFavoredPop = new DemFavoredPopObserver(electStats, states);
		HonestObserver honest = new HonestObserver(electStats, states);
		
		electStats.setStatistics(repFavored.getPopVote(), repFavored.getElectVote());
		electStats.setStatistics(demFavored.getPopVote(), demFavored.getElectVote());
		electStats.setStatistics(demPopRepElect.getPopVote(), demPopRepElect.getElectVote());
		electStats.setStatistics(demFavoredPop.getPopVote(), demFavoredPop.getElectVote());
		electStats.setStatistics(honest.getPopVote(), honest.getElectVote());

	}

}
